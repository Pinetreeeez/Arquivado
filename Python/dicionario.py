'''
print("Cadastro da pessoa 1:")
pessoa1 = {'nome1':'João','cidade1':'Jales','idade1':18}
print(pessoa1)
print(f"O {pessoa1['nome1']} tem {pessoa1['idade1']} anos")
print("\nQual é a idade de Pedro?")
print(pessoa1['idade1'])
print("\nQUantas chaves tem o dicionário?")
print(len(pessoa1))
print("\nRetorna as chaves do dicionário:")
print(pessoa1.keys())
print("\nRetorna os valores das chaves do dicionário:")
print(pessoa1.values())
print("\nRetorna as chaves e valores do dicionário:")
print(pessoa1.items())
print("\nCadastro da pessoa 2:")
pessoa2 = {'nome2':'Maria','cidade2':'Iturama','idade2':20}
print(pessoa2)
print("\nAgrupa pessoa2 em pessoa1:")
pessoa1.update(pessoa2)
print(pessoa1)
print("\nApaga uma chave:")
del pessoa1['cidade2']
print(pessoa1)
print("\nApaga o dicionário")
pessoa1.clear()
print(pessoa1)
'''
n = int(input("Quantos alunos?:"))
aluno1 = {str(input("Nome do aluno:")): int(input("Média do aluno:")) for _ in range(n)}
print(aluno1[str(input("Nome do aluno:"))])
print(aluno1[int(input("Média do aluno:"))])
