'''
num =[10, 20, 30, 40]
print(num)
print(num[2])
print(num[0:2])
print(num[1:])
'''

#Listas são imutáveis

'''
num = [10,20,30,40]
num[1] = 25
print(num)
'''

#Inserir novos valores na lista
'''
num = [10,20,30,40]

'num[4] = 50'        #ERRADOOOOOOO!!!  Use append pra inserir novos valores

num.append(50)
num.insert(1,15)          #Para inserir novos valores no meio da lista -> .INSERT
print(num)
'''

#Remover valores da lista
'''
num = [10,20,30,40,50]
num.remove(50)
print(num)
'''

#Inserir valores em uma lista vazia pelo usuário
'''
valores =[]
for cont in range(0,5):
    valores.append(int(input("Digite um valor:")))

for indice, valor in enumerate(valores):                                                                            
    print(f"Na poição {indice} foi digitado o valor {valor}")      
'''    
#No enumerate começa a contar primeiro o indice e depois o valor, sendo a posição importante
#por causa que na primeira posição é o indice (onde a variável indice ta escrita) e na segunda é o valor (que ta escrito a variável valor)

#LISTA DE LISTAS
'''
pessoas = [["Pedro", 25],["Maria", 19],["João",32]]            #Cada elemento dentro do "[]" tem uma posição, o Pedro tem como posição 0 e o numero tem posição 2, em cada matriz ou lista tanto faz sempre começa do 0.
print(pessoas)                                                 # nessa lista então começando pelo Pedro ele é a matriz 0 com dois elementos iguais as outras matrizes, a Maria é a matriz 1 e o João é a matriz 3
print(pessoas [0] [0])
print(pessoas [2] [0])
print(pessoas [1])
'''

pessoas = []
cliente = []
for indice in range (0,3):
    cliente.append(str(input("Nome:")))
    cliente.append(int(input("Idade:")))
    pessoas.append(cliente[:])
    cliente.clear()
print(pessoas)