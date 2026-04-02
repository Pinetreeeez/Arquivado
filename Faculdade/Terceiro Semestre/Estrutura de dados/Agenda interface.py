contatosalvo = []

def inserir(): 
    while True:
        codigo = int(input("Digite o seu código: "))
        nome = input("Digite o nome: ")
        telefone = int(input("Digite o telefone: "))
        contatosalvo.append ({"Codigo": codigo , "Nome": nome, "Telefone": telefone})
        print("Contrato inserido com sucesso!")
        return True

def mostrar():
    print(" LISTA DE CONTATOS")
    while True:
        if not contatosalvo:
            print("Nenhum contato registrado.....")
            return False
        
        for contato in contatosalvo:    
            print(f"Código: {contato["codigos"]}")
            print(f"Nome: {contato["nomes"]}")
            print(f"Telefone: {contato["telefones"]}")
        return False


def interface():
    
    deu_print = False
    while True:  
        if not deu_print:
            print('''Ola! Bem vindo á agenda de contatos! Todas as funções estão a baixo.
                \n Digite [1] para Inserir um contato.
                \n Digite [2] para Mostrar todos os contatos.
                \n Digite [3] para Buscar um contato.
                \n Digite [4] para Editar o contato.
                \n Digite [5] para Ordenar os contatos por nome.
                \n Digite [6] para Apagar o contato.
                \n Digite [7] para Sair da agenda.
                ''') 
            deu_print = True        #Condição pra dar print só uma vez

        escolha = int(input("Digite um dos números para realizar a função que busca: "))

        if escolha == 1:
           inserir() 
            
        elif escolha == 2:
            mostrar() 

        elif escolha == 3:
            print("Ola")
        elif escolha == 4:
            print("Ola")
        elif escolha == 5:
            print("Ola")
        elif escolha == 6:
            print("Ola")
        elif escolha == 7:
            print("Agradecemos por seu tempo, esperamos por sua presença novamente!")
            break
        else:
            print("Caractere inválido")

interface()