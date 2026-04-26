'''
def Julgamento (nome,nota):
    if nota >= 6 and nota <= 10: 
        print(f"{nome} passou na matéria com a nota {nota}")
    elif nota < 6 and nota >= 0:
        print(f"{nome} reprovou na matéria com a nota {nota}")
    else:
        print("Inválido")
    return

Julgamento("elio", 11)
'''

'''
Lista = [1,2,3,4,5,6,7,8,9,10]
nova_lista = []
for numero in Lista:
    if numero % 2 == 0:
        nova_lista.append(numero)
    else:
        continue

print(nova_lista)
'''

'''
estoque ={
    "Maçã": 5,
    "Banana": 10,
    "Laranja": 8,
}
estoque["Banana"] = 15
estoque["Uva"] = 20
soma = sum(estoque.values())
print(estoque)
print(f"Soma de toda quantidade de frutas = {soma}")
'''

'''
Coordenadas = (10,20,30)
x,y,z = Coordenadas
print(f"A posição Z é {z}")
'''

'''
def verificar_palindromo(texto=str):
    if texto == texto[:: -1]:
        return True
    else:
        return False

print(verificar_palindromo("ovo"))
'''

class Carro:
    def __init__(self, marca=str, modelo=str,ano=int):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
    
    def _descrever(self):
        print(f"Este é um {self.marca} {self.modelo} do ano {self.ano}")

carro1 = Carro("Chevrolet", "Opala", 1968)
carro1._descrever()