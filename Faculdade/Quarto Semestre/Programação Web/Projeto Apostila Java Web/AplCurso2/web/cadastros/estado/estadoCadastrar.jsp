<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

<div class="container-fluid">
	<!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Estados</h1>
    <p class="mb-4">Formulário de Cadastro</p>
    
    <a class="btn btn-secondary mb-4" href="${pageContext.request.contextPath}/EstadoListar">
        <i class="fas fa-undo-alt"></i>
        <strong>Voltar</strong>
    </a>
    
     <div class="row">
        <!-- Campos de cadastramento -->        
        <div class="col-lg-9">
            <div class="card shadow mb-4">
                <div class="card-body">
                    <div class="form-group">
                        <label>Id</label>
                        <input class="form-control" type="text" name="id" id="id" 
                               value="${estado.id}" readonly="readonly"/>
                    </div>
                    <div class="form-group">
                        <label>Estado</label>
                        <input class="form-control" type="text" name="nomeEstado" id="nomeEstado" 
                               value="${estado.nomeEstado}" size="100" maxlength="100"/>
                    </div>
                    <div class="form-group">
                        <label>Sigla</label>
                        <input class="form-control" type="text" name="siglaEstado" id="siglaEstado" 
                               value="${estado.siglaEstado}" size="2" maxlength="2"
                               style="text-transform:uppercase;"/>
                   </div>
                   <!-- Botão de Confirmação -->
                   <div class="form-group">
                   		<button class="btn btn-success" type="submit" id="submit" onclick="validarCampos()">
                            Salvar Estado</button>
                  </div>
              </div>
           </div>
        </div>
    </div>          	
</div>

<script>
	$(document).ready(function (){
		console.log("entrei na ready do siglaEstado");
		
		// Só aceita letras na sigla e deixa em maiúsculo enquanto digita
		$('#siglaEstado').on('input', function () {
            this.value = this.value.replace(/[^A-Za-z]/g, '').toUpperCase();
        });
		
		// (FrontEnd) Ao sair do campo sigla, pergunta ao backend se ja existe
		$('#siglaEstado').blur(function () {
            var sigla = $(this).val().trim();
            if (sigla === '') {
                return;
            }
            if (sigla.length !== 2) {
                Swal.fire({
                    position: 'center',
                    icon: 'warning',
                    title: 'A sigla deve ter 2 letras!',
                    showConfirmButton: true,
                    timer: 4000
                });
                return;
            }
            
            // Verificar se ta duplicado a sigla/se existe copia
            $.ajax({
                type: 'get',
                url: 'EstadoVerificarSigla',
                data: { sigla: sigla, id: $('#id').val() },
                success: function (response) {
                    if (response == '1') {
                        Swal.fire({
                            position: 'center',
                            icon: 'warning',
                            title: 'Sigla já cadastrada!',
                            text: 'Informe outra sigla.',
                            showConfirmButton: true,
                            timer: 4000
                        }).then(function () {
                            $('#siglaEstado').focus().select();
                        });
                    }
                },
                error: function () {
                    console.log("Erro ao verificar sigla no servidor.");
                }
            });
        });
		
		$('#nomeEstado').focus();
    });
	
	function validarCampos() {
		console.log("entrei na validação de campos do estado e sigla");
        if ($('#nomeEstado').val().trim() === '') {
            Swal.fire({
            	position: 'center',
            	icon: 'error',
            	title: 'Verifique o nome do estado!',
                showConfirmButton: false,
                timer: 1000
            });
            $('#nomeEstado').focus();
        } else if ($('#siglaEstado').val().trim().length !== 2) {
            Swal.fire({
            	position: 'center',
            	icon: 'error',
            	title: 'Verifique a sigla (2 letras)!',
                showConfirmButton: false,
                timer: 1500
            });
            $('#siglaEstado').focus();
        } else {
            gravarDados();
        }
    }
	
	function gravarDados() {
		console.log("Gravando dados do estado ....");
        $.ajax({
            type: 'post',
            url: 'EstadoCadastrar',
            data: {
                id: $('#id').val(),
                nomeEstado: $('#nomeEstado').val().toUpperCase(),
                siglaEstado: $('#siglaEstado').val().toUpperCase()
            },
            success: function (data) {
            	console.log("resposta servlet->");
                console.log(data);
                if (data == 1) {
                    Swal.fire({
                        position: 'center',
                        icon: 'success',
                        title: 'Sucesso',
                        text: 'Estado gravado com sucesso!',
                        showConfirmButton: true,
                        timer: 3000
                    }).then(function () {
                        window.location.href = 'EstadoNovo';
                    });
                } else if (data == 5) {
                    Swal.fire({
                        position: 'center',
                        icon: 'error',
                        title: 'Dados em branco ou fora do padrão, verifique!',
                        showConfirmButton: true,
                        timer: 5000
                    }).then(function () {
                        setTimeout(function () {
                        	$('#nomeEstado').focus();
                        	}, 50);
                    });
                } else if (data == 6) {
                	// Verifica se a sigla ja esta cadastrada
                    Swal.fire({
                        position: 'center',
                        icon: 'error',
                        title: 'Sigla já cadastrada!',
                        showConfirmButton: true,
                        timer: 5000
                    }).then(function () {
                        setTimeout(function () {
                        	$('#siglaEstado').focus().select();
                        	}, 50);
                    });
                } else {
                    Swal.fire({
                        position: 'center',
                        icon: 'error',
                        title: 'Não foi possível gravar o estado!',
                        showConfirmButton: true,
                        timer: 5000
                    }).then(function () {
                        setTimeout(function () {
                        	$('#nomeEstado').focus();
                        	}, 50);
                    });
                }
            },
            error: function () {
                Swal.fire({
                    position: 'center',
                    icon: 'error',
                    title: 'Erro de comunicação',
                    text: 'Falha na comunicação com o servidor.',
                    showConfirmButton: true,
                    timer: 5000
                }).then(function(){
                	setTimeout(function(){
                		$('#nomeEstado').focus();
                	}, 50);
                });
            }
        });
    }
</script> 
<jsp:include page="/footer.jsp"/>