'''
lista = []
while True:
    x = int(input("Digite um valor:"))
    if x in lista:
        print("Valor duplicado! Não vou adicionar....")
    else:
         print("Valor adicionado com sucesso...")
         lista.append (x)
    lista.sort()
    opcao = str(input("Deseja continuar? [S/N]:")) .capitalize()
    if opcao == "N":
        break
print (lista)    
'''
lista = []
lista_pares = []
lista_impares = []
while True:
    x = int(input("Digite um valor:"))
    lista.append(x)
    if (x % 2 == 0):
        lista_pares.append (x)
    if (x % 2 != 0):
        lista_impares.append(x)
    lista.sort
    lista_pares.sort
    lista_impares.sort
    opcao = str(input("Deseja continuar? [S/N]:")) .upper()
    if opcao == "N":
        break
print(lista)
print(lista_pares)
print(lista_impares)

