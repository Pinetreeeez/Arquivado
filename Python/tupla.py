'''
num = (10,20,30,40) # 10 = 0, 20 = 1, 30 = 2, 40 = 3. É a ordem, começa do zero

print(num)
print(num{2})
print(num{0:2})     # É o intervalo, vai começar a contar do zero até o 2 mas não mostra o numero final
print(num{1:})      # Começou a contar o intervalo no 1
'''
#Tuplas são imutáveis, não tem como mudar nada.

#Estrutura de repetição
'''
for contador in num:
    print(contador)
print("\n")

for contador in range(0, len(num)):     # Len() conta quantos valores tem na tupla
    print(num[contador])
'''

#Mostrando a posição do valor
'''
for contadorPos, contadorValor in enumerate(num):
    print(f"Posição {contadorPos} tem o valor {contadorValor}")

print("\n")

for contador in range (0, len(num)):
    print(f"Posição {contador} tem o valor{num[contador]}")

#Exibição em ordem decrescente
print(sorted(num, reverse=True))

#exibição normal
print(num)
'''
'''
#Junção de tuplas
a = (1,2,3)
b = (4,5,6,7)
c = a + b
print(c)

#métodos nativos da tupla: 
#Quantas vezes repete o número 5 na tupla C
print(c.count(5))
#Qual é a posição de um determinado valor
print(c.index(6))
'''
'''
#Em python tuplas podem ter dados de tipos diferentes
pessoa = ('José', 40, 'm', 75,5)
print (pessoa)
'''

'''
calendario = ('','janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro')
opcao = int(input("Digite o número do mês entre 1 a 12 :"))
while not (opcao >= 1 and opcao <=12):
    opcao = int(input("Digite o número do mês entre 1 a 12:"))
print(f"Você digitou o mês de {calendario[opcao]}")
'''    
    
    