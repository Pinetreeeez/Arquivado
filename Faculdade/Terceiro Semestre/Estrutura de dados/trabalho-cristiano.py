# class NodeLista(object):
#     def __init__(self, valor, proximoNo=None):
#         self.valor = valor
#         self.proximoNo = proximoNo

# node1 = NodeLista("3")
# node2 = NodeLista("6")
# node3 = NodeLista("9")

# node1.proximoNo = node2  # node1 --> node2,  3 --> 6. Ele esta apontando para o próximo valor
# node2.proximoNo = node3  # node2 --> node3   6 --> 9   

# currentnode = node1
# while True:
#     print (currentnode.valor, end = " --> ", )
#     if currentnode.proximoNo is None:     #pra checar se o nó atual não é o none do Nó final
#         print ("None")
#         break
#     currentnode = currentnode.proximoNo

# people: list[str] = ['Hole','Buraco','Marmita']
# copy_people: list[str] = people.copy()

# copy_people.remove('Marmita')
# print(people)
# print(copy_people)


# people: list[str] = ['Hole','Buraco','Marmita']
# animals: list[str] = ['Cat', 'Dog', 'Mouse']

# people.extend(animals) # = ['Hole', 'Buraco', 'Marmita', 'Cat', 'Dog', 'Mouse']
# people.extend([animals]) # = ['Hole', 'Buraco', 'Marmita', ['Cat', 'Dog', 'Mouse']] Imprime a lista junto
# print(people) 