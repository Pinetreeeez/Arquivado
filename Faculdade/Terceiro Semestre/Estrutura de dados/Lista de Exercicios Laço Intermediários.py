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
numero = int(input("Digite um numero: "))
for i in range(1,11):
    resultado = numero * i
    if resultado < 50:
        print(f"{numero} x {i} = {resultado}")
    else:
        break
