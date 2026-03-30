# 1
'''
def funcao(lista, limite):
    vazio = 0
    for x in lista:
        if x > limite:
            vazio += x
    return vazio

numeros = [1,2,3,4,5,6,7,8]
numerolimite = 3
print(funcao(numeros, numerolimite))
'''

# 2

'''
def contar(lista):
    for i in range(len(lista)):
        if lista[i] < 0:
           lista[i] = 0
    return lista

numeros = [1,2,3,-4,-5,-6,7,8]
print(contar(numeros))
'''

# 3
'''
def entre(lista, low, up):
    soma = 0
    for numero in lista:
        if low < numero < up:
            soma += 1
    print(soma)

numeros = [1,2,5,7,9,11,14,15]
pequeno = 2
maior = 14
entre(numeros, pequeno, maior)
'''

# 4
'''
def multiplicao_lista(lista,numero):
    for i in range (len(lista)):
        lista[i] *= numero
    return lista

numeros = [1,2,3,4,5,6,7]
multiplicador = 3
print(multiplicao_lista(numeros, multiplicador))
'''

# 5 
'''
def quadrado(n):
    lista = [x**2 for x in range(1, n)]
    return lista

n = int(input("Digite o limite da lista: "))
print (quadrado(n))
'''

# 6
'''
def booleano(numeros, condicao):
    for i in range (len(numeros)):
        if numeros[i] > condicao:
            print("True")
        else:
             print ("False")

lista = [1,2,3,4,5,6]
cond = 2
booleano(lista,cond)
'''

# 7
'''
def media(lista):
    soma = 0
    
    for i in lista:
        soma += i
    media = soma / len(lista)    
    contador = 0
    for i in lista:
        if i > media:
            contador += 1
    return contador

numeros = [1,3,4,5,6,7,8,9,10,13]
print(media(numeros))
'''

# 8
'''
def duplicados(x):
    lista = []
    for i in x:
        if i not in lista:
            lista.append(i)
    return lista

numeros = [1,2,3,1,1,1,2,3,3,2,4,4,5,5]
print(duplicados(numeros))
'''

# 9
'''
def inter(lista1,lista2):
    emcomum = []
    for x in lista1:
        if x in lista2:
            emcomum.append(x)
    return emcomum

numero1 = [1,2,3,4,5,6,7,8,9]
numero2 = [3,5,8,9]
print(inter(numero1,numero2))
'''

# 10
'''
def dif(lista1,lista2):
    primeiralista = list(set(lista1) - set(lista2))
    return primeiralista

num1 = [1,2,3,4]
num2 = [3,4,5,6]
print(dif(num1,num2))
'''

# 11
'''
def compac(lista):
    novalista1 = []
    novalista2 = []
    for x in lista:
        if x in novalista2:
            continue
        novalista1.append((x, lista.count(x)))
        novalista2.append(x)
    return novalista1

num = [2,3,3,3,4,5,5,5,1,1,1,3]
print(compac(num))
'''

# 12
'''
def decompac(lista):
    listadecompac = []
    for x in lista:
        valor, multiplo = x
        for _ in range(multiplo):
            listadecompac.append(valor)
    return listadecompac

lista = [(2,1),(3,4), (4,1), (5,3), (1,3)]
print(decompac(lista))
'''

# 13
'''
def menormaior(lista):
    max1 = max2 = float('-inf')        # Infinito negativo
    for i in lista:
        if i > max1:                   #max 1 guarda o maior numero que ja foi lido, max 2 guarda o proximo maior numero
            max2 = max1                # cada elemento que passa vai atualizando esses dois valores quando necessário, garantindo uma solução de tempo linear
            max1 = i
        elif i > max2 and i != max1:
            max2 = i
    return max2

numeros = [1,2,3,4,5,6,7,8,9]
print(menormaior(numeros))
'''

# 14
'''
def rotate(lista,n):
    lista_rodada = lista[-n:] + lista[:-n]      #rodar para a direita
    return lista_rodada

numeros = [1,2,3,4]
giros = 2
print(rotate(numeros, giros))
'''

#15

def parimpar(lista):
    lista_par = []
    lista_impar = []

    for i in lista:
        if i % 2 == 0:
            lista_par.append(i)
        else:
            lista_impar.append(i)

    lista_par.sort()
    lista_impar.sort()
    nova_lista = lista_par + lista_impar
    return nova_lista

numeros = [1,2,3,4,5,6,7,8,9]
print(parimpar(numeros))
