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
    print("LISTA DE CONTATOS \n")
    while True:
        for contato in contatosalvo:    
            print(f"Código: {contato["Codigo"]}")
            print(f"Nome: {contato["Nome"]}")
            print(f"Telefone: {contato["Telefone"]}\n")
        return False

def buscar():
    print('''BUSCANDO CONTATOS \n
          Opções disponiveis para buscar um contato \n
                     C = Código \n
                     N = Nome   \n
                     T = Telefone \n
                     ''')
    procurar = str(input("Digite a opção que deseja utilizar: ")).lower()
    if procurar == "c":
        y = int(input("Digite o código: "))
        for x in contatosalvo:
            if y == x ["Codigo"]:
                print(f"Código: {x['Codigo']}")
                print(f"Nome: {x['Nome']}")
                print(f"Telefone: {x['Telefone']}")
                print("\n") 
                 
            if y != x["Codigo"]:
                print("Esse código não existe")  
            
    elif procurar == "n":
        y = str(input("Digite o nome: "))
        for x in contatosalvo:
            if y in x["Nome"]:
                print(f"Código: {x['Codigo']}")
                print(f"Nome: {x['Nome']}")
                print(f"Telefone: {x['Telefone']}")
                print("\n")

            if y != x["Nome"]:
                print("Esse nome não existe")  
     
    elif procurar == "t":
        y = int(input("Digite o telefone: "))
        for x in contatosalvo:
            if y == x["Telefone"]:
                print(f"Código: {x['Codigo']}")
                print(f"Nome: {x['Nome']}")
                print(f"Telefone: {x['Telefone']}")
                print("\n")
             
            if y != x["Telefone"]:
                print("Esse telefone não existe")
    else:
        print("Caractere inválido")

def editar():
    print('''        EDITAR CONTATOS \n
          Opções disponiveis para editar um contato \n
                     C = Código \n
                     N = Nome   \n
                     T = Telefone \n
                     ''')
    escolher = str(input("Digite a opção que deseja utilizar: ")).lower()
    if escolher == "c":
        achar = int(input("Digite o código que deseja substituir: "))
        for x in contatosalvo:
            if achar == x['Codigo']:
                x['Codigo'] = int(input("Digite o novo valor: "))
                print("Código alterado com sucesso !")
            else:
                print("Código não existe")
    
    elif escolher == "n":
        achar = str(input("Digite o nome que deseja substituir: "))
        for x in contatosalvo:
            if achar in x['Nome']:
                x['Nome'] = str(input("Digite o novo valor: "))
                print("Código alterado com sucesso !")
            else:
                print("Esse nome não existe")
    
    elif escolher == "t":
        achar = int(input("Digite o telefone que deseja substituir: "))
        for x in contatosalvo:
            if achar == x['Telefone']:
                x['Telefone'] = int(input("Digite o novo valor: "))
                print("Código alterado com sucesso !")
            else:
                print("Esse telefone não existe")
    
    else:
        print("OPÇÃO INVÁLIDA\n")            

def ordernar():
    print('''   ORDENANDO OS CONTATOS   \n''')
    contatoord = sorted(contatosalvo, key=lambda x: x['Nome'])
    for contato in contatoord:
        print(f"Código: {contato["Codigo"]}")
        print(f"Nome: {contato["Nome"]}")
        print(f"Telefone: {contato["Telefone"]}\n")

def apagar():
    print('''    DELETAR CONTATO\n ''' )
    opcao = str(input("Digite o nome de um contato para prosseguir com a deleção: ")) 
    encontrado = False
    for contato in contatosalvo:    
            if opcao in contato['Nome']:
                encontrado = True
                pergunta = input(f'''CUIDADO! Deseja mesmo apagar seu contato, {contato['Nome']} permanentemente?\n 
                                     (s/n): ''').lower()
                if pergunta == "s":
                    contatosalvo.remove(contato)
                    print("Contato deletado com sucesso! \n") 
                else:
                    print("Deletamento cancelado!\n")
    if not encontrado:
        print("ESSE CONTATO NÃO EXISTE! \n") 
        

def main():
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
                \n Digite [0] para Sair da agenda.
                \n''') 
            deu_print = True        #Condição pra dar print só uma vez

        escolha = int(input("Digite um dos números para realizar a função que busca: "))

        if escolha == 1:
           inserir() 
        elif escolha == 2:
            mostrar() 
        elif escolha == 3:
            buscar ()
        elif escolha == 4:
            editar()
        elif escolha == 5:
            ordernar()
        elif escolha == 6:
            apagar()
        elif escolha == 0:
            print("Agradecemos por seu tempo, esperamos por sua presença novamente!\n")
            break
        else:
            print("Caractere inválido\n")


main()