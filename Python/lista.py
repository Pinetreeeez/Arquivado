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

valores =[]
for cont in range(0,5):
    valores.append(int(input("Digite um valor:")))

for indice, valor in enumerate(valores):                                                                            
    print(f"Na poição {indice} foi digitado o valor {valor}")      
    
#No enumerate começa a contar primeiro o indice e depois o valor, sendo a posição importante
#por causa que na primeira posição é o indice (onde a variável indice ta escrita) e na segunda é o valor (que ta escrito a variável valor)
    