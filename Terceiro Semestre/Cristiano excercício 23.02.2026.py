
# Exercício 1

'''
a = 10
b = a
b = 15

print(a)
print(b)
'''

# O resultado é a = 10 e b = 15.
# Variáveis não armazenam valores mas referenciam um objeto. Primero a variável "b" estava referenciando a variável "a" que referenciava o valor inteiro 10, porém a variável b foi referenciada ao valor 15 fazendo com que o resultado seja 15.

# Exercício 2

'''
a = [10]
b = a
b[0] = 30

print (a)
print(b)
'''

# O resultado é [30] e [30].
# Normalmente objetos inteiros são imutáveis, porem listas são mutáveis. A variável "b" primeiramente referenciava (ou apontava) para a variável "a" que referenciava uma lista com o valor 10, só que depois a variável "b" inseriu um objeto de valor 30 no início da lista substituindo o valor inteiro de 10.

# Exercício 3

'''
a = (10,)
b = a
b += (5,)
print(a)
print(b)
'''

# O resultado é (10,) e (10,5).
# Primeiro a variável "b" tem o mesmo valor da variável "a" que é a tuple (10,), depois a variável "b" acresenta um valor inteiro de 5 na tuple fazendo com que a variável b possua o valor de (10,5) e a variável "a" continue com o seu valor normal (10,), tuples são imutáveis então não tem como alterar o seu valor fazendo com que a tuple da variável "a" seja diferente da tuple da variável "b", os dois tendo ids diferentes.

# Exercício 4

'''
x = [1,2]
y = x
y = y + [3]
print(x)
print(y)
'''

# O resultado é [1, 2] e [1, 2, 3]
# A variável "x" tem como referencia a lista [1, 2], a variável "y" tem como referencia a variável "x", em seguida a variável "y" adiciona o valor inteiro de 3 em si mesmo. Sendo que a variável "y" tinha como referencia a variável "x" então ficou [1, 2, 3] sendo uma lista diferente com a lista de "x".

# Exercício 5

'''
x = [5]
print(id(x))
x.append(10)
print(id(x))
'''

# O objeto não mudou pois é a mesma lista só que adicionou um valor no final da lista, não afetando a lista em si tendo como resultado "2447547318976 2447547318976".