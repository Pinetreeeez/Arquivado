#EX 1
'''
contador = []
while 0 not in contador:
    numero = int(input("Digite um número:"))
    adicionar = contador.append(numero)
    soma = sum(contador)
    contagem = len(contador) - 1
    if numero == 0:
        print(f"Soma: {soma}")
        print(f"Quantidade: {contagem}")
'''

#EX 2
'''
pares = []
impares = []
for numero in range (10):
    numero = int(input("Digite um numero: "))
    if numero % 2 ==0:
        pares.append(numero)
    else:
        impares.append(numero)
print(f"Tem {pares} pares")
print(f"Tem {impares} impares")
'''

#EX 3
'''
numero = int(input("Digite um numero: "))
for i in range(1,11):
    resultado = numero * i
    if resultado < 50:
        print(f"{numero} x {i} = {resultado}")
    else:
        break
'''

#EX 4
'''
numerolista = []
for i in range (8):
    numero = int(input("Digite um numero: "))
    if numero >= 0:
        numerolista.append(numero)
        soma = sum(numerolista)
    else:
        continue
print(f"Soma dos numeros positivos: {soma}")
'''

#EX 5
'''
palavra = str(input("Digite uma palavra: "))
vogais = 0
consoantes = 0
for i in palavra:
    if i in "aeiou":
        vogais += 1
    elif i in "qwrtypsdfghjklçzxcvbnm":
        consoantes += 1
print (f"Vogais: {vogais}")
print (f"Consoantes: {consoantes}")
'''

#EX 6
'''
compras = ["arroz", "feijão", "macarrão", "leite", "pão"]
for indice, compras in enumerate(compras,1):
    print(f"{indice} - {compras}")
'''    

#EX 7
'''
nomes = ["Ana", "Carlos", "João", "Marina"]
notas = [8.5, 6.0, 9.2, 7.1]

for nome, nota in zip(nomes, notas):
    print(f"{nome} tirou {nota}")
'''

#EX 8
'''
while True:
    numero = int(input("Digite um numero maior que zero: "))
    if numero <= 0:
        continue
    else:
        while numero >= 0:
            print(numero)
            numero -= 1
    break
'''

#EX 9
'''
lista = []
for i in range(1,100):
    if i % 3 ==0:
        adicionar = lista.append(i)
        soma = sum(lista)
        contador = len(lista)
print(f"{soma}")
print(f"{contador}")
'''

#EX 10
'''
alunos = { "Ana": 8, "Carlos": 5, "Marina": 7, "João": 4}
for aluno, nota in alunos.items():
    print(f"{aluno} : {nota}")
    if nota >= 6:
        print(f"status: Aprovado")
    else:
        print(f"status: Reprovado")
'''

#EX 11
maior = None
menor = None
maior = menor = numero = 0
for i in range (5):
    numero = int(input("Digite um numero: "))
    if i > maior:
        maior = i
    if i < menor:
        menor = i
print(f"{maior}")
print(f"{menor}")