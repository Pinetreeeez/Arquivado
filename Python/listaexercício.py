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
'''

lista = [-1,6,-9,-8,4,0,-3,2,7,1,8,-2]
listaordernada = [-1,6,-9,-8,4,0,-3,2,7,1,8,-2]
positivos = [x for x in lista if x >= 0]
negativos = [y for y in lista if y < 0]
listaordernada.sort()
print(f"Lista original: {lista}")
print(f"Lista ordenada: {listaordernada}")
print(f"Lista positivos: {positivos}")
print(f"Lista negativos: {negativos}")