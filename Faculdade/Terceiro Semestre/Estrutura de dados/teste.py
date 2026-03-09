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
numeros = int(input("Digite um número: "))
for i in range (0,9):
    if i % 2 == 0:
        print("Esses numéros são pares")