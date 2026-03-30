def inserir(CodigoN, NomeN, TelefoneN): 
    contato = [{
    "Codigo": f"{CodigoN}",
    "Nome": f"{NomeN}",
    "Telefone": f"{TelefoneN}",
}]
    for x,y in contato:
        print(f"{x}:{y}")
    return contato

   
print('''Ola! Bem vindo á agenda de contatos! Todas as funções estão a baixo. \n Digite [1] para Inserir um contato.
        \n Digite [2] para Mostrar todos os contatos.
        \n Digite [3] para Buscar um contato.
        \n Digite [4] para Editar o contato.
        \n Digite [5] para Ordenar os contatos por nome.
        \n Digite [6] para Apagar o contato.
        \n Digite [7] para Sair da agenda.
        ''') 
    
escolha = int(input("Digite a opção que deseja acessar: "))
if escolha == 1:
    print("ola")
elif escolha == 2:
    print ("Ola")
elif escolha == 3:
    print("Ola")
elif escolha == 4:
    print("Ola")
    