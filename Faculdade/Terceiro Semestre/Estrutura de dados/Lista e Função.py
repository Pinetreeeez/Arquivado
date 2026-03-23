#1
'''
def valoreslimite(valores):
    if len(valores) <= 3:
        return 0
    else:
        return valores[3] + valoreslimite(valores[1:])  
    

numeros = [1,2,3,4,5,6]
print(valoreslimite(numeros))
'''

# 2

def valoresnegativos():
    lista = []
    for x in range(5):
        numero = int(input("Digite uns valores: "))
        if numero < 0:
            numero = 0
            lista.append(numero)
        else:
            lista.append(numero)
    print(lista)

valoresnegativos()       