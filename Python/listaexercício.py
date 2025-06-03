'''
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

# Ex de lista de listas começa apartir daq

matriz = []
for i in range (2):
    linha= []
    for j in range(3):
        valor = int(input(f"Digite um valor para a posição {[(i)]} {[(j)]}:"))
        linha.append(valor)
    matriz.append(linha)

print("\nMatriz")
for linha in matriz:
    print(linha,"")