#Isso daqui é anotação só pra eu lembrar esse negocio de matriz
matriz = []
for i in range (2): #CRIA UMA LINHA
    linha= []
    for j in range(3): # ELE ENCHE A LINHA COM OS VALORES, nesse caso ele vai por os valores em 3 posições, ai quando enche as posições essa linha feita é bota na matriz no append la, repete até as linhas estiverem feitas.
        valor = int(input(f"Digite um valor para a posição {[(i)]} {[(j)]}:"))
        linha.append(valor)
    matriz.append(linha)

print("\nMatriz")
for linha in matriz:
    print(linha,"")
'''
EX 1

lista = []
while True:
    x = int(input("Digite um valor:"))
    if x not in lista:
        print("Valor adicionado com sucesso...")
        lista.append (x)
    else:
        print("Valor duplicado! Não vou adicionar....") 
    opcao = str(input("Deseja continuar? [S/N]:")) .upper()
    if opcao == "N":
        break
print (sorted(lista))    
'''
'''
EX 2

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
'''
EX 3

lista = [-1,6,-9,-8,4,0,-3,2,7,1,8,-2]
listaordernada = [-1,6,-9,-8,4,0,-3,2,7,1,8,-2]
positivos = [x for x in lista if x >= 0]
negativos = [y for y in lista if y < 0]
listaordernada.sort()
print(f"Lista original: {lista}")
print(f"Lista ordenada: {listaordernada}")
print(f"Lista positivos: {positivos}")
print(f"Lista negativos: {negativos}")
'''
'''
EX 4

texto = str(input("Digite um texto:"))
maiuscula = []
minuscula = []
print(texto2)
for letra in texto2:
  if letra.isupper():
    maiuscula.append(letra)
  elif letra .islower():
    minuscula.append(letra)

print(f'As letras maiusculas foram {maiuscula}\nA quantidade de letras maiusculas foram {len(maiuscula)}')

print(f'As letras minusculas foram {minuscula}\nA quantidade de letras minusculas foram {len(minuscula)}')
'''
'''
EX 5

pessoas = []
cliente = []
maior = 0
menor = 0
for c in range (0,3):
    cliente.append(str(input("Nome:")))
    cliente.append(int(input("Idade:")))
    pessoas.append(cliente[:])
    cliente.clear()

print(pessoas)

for c in pessoas:
    if c[1] >= 18:
        print(f"{c[0]} é maior de idade.")
        maior += 1
    else:
        print(f"{c[0]} é menor de idade.")
        menor += 1

print(f"Na lista tem {maior} maior(es) e {menor} menor(es) de idade.")
'''
'''
EX 6

import random
matriz = []
for i in range(4):
    linha = []
    for j in range(4):
        valor = random.randint(1,100)
        linha.append(valor)
    matriz.append(linha)

print("\nMatriz")
for linha in matriz:
    print(linha,"")
'''
'''
EX 7

matriz = []
soma = 0
for i in range (5):
    linha = []
    for j in range (2):
        valor = int(input(f"Digite um valor para a posição {[i]} {[j]} :"))
        soma = soma + valor
        linha.append(valor)
    matriz.append(linha)

print("\nMatriz")
for linha in matriz:
    print(linha,"")
print(f"Soma = {soma}")
'''

'''
EX 8

matriz = []
soma = 0
for i in range (3):
    linha = []
    for j in range (3):
        valor = int(input(f"Digite um valor para a posição {[i]} {[j]} :"))
        linha.append(valor)
        if i==j:
            soma += valor
    matriz.append(linha)

print("\nMatriz")
for linha in matriz:
    print(linha,"")
print(f"Soma = {soma}")
'''

'''
EX 9 FINAL

matriz1 = []
matriz2 = []
soma = []
print("Preenchendo Matriz 1")
for i in range (2):
    linha = []
    for j in range (2):
        valor = int(input(f"Digite um valor para a posição {[i]} {[j]} :"))
        linha.append(valor)
    matriz1.append(linha)

print("\nExibindo Matriz 1")

for linha in matriz1:
    print(linha,"")

print("Preenchendo Matriz 2")

for i in range (2):
    linha = []
    for j in range (2):
        valor = int(input(f"Digite um valor para a posição {[i]} {[j]} :"))
        linha.append(valor)
    matriz2.append(linha)

print("\nExibindo Matriz 2")
for linha in matriz2:
    print(linha,"")

for i in range(2):
    linha = []
    for j in range (2):
        valor = matriz1[i][j] + matriz2[i][j]
        linha.append(valor)
    soma.append(linha)
    
print("\nResultado soma")
for linha in soma:
    print(linha,"")
'''
