'''
No caso de usar append em dicionários, se tiver mais de um valor pra adicionar usa-se a função .copy
exemplo disso tem no exercício 3 e 5 desse arquivo


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

'''
EX 1


aluno = {}
aluno['nome'] = str(input("Nome do aluno: "))
aluno['media'] = float(input("Média do aluno: "))

print(aluno)

print(f"Nome = {aluno['nome']}")
print(f"Média = {aluno['media']}")

if aluno ['media'] >= 6:
    aluno['situacao'] = "Aprovado"
else:
    aluno['situacao'] = "Reprovrado"
print(f"Situação = {aluno['situacao']}")
'''


'''
EX 2


from datetime import date
data_atual = date.today()
dados = {}
dados['Nome'] = str(input('Nome: '))
dados['Nascimento'] = int(input('Ano de nascimento: '))
dados['Idade'] = data_atual.year - dados ['Nascimento']
dados['Carteira'] = int(input('Número carteira de Trabalho (0 não tem): '))
if dados['Carteira'] != 0:
    dados['Contratação'] = int(input('Ano de Contratação: '))
    dados['Salario'] = float(input('Salário: R$'))
    dados['Aposentadoria'] = ((dados['Contratação'] + 35) - data_atual.year)
for chave, valor in dados.items():
    print(f"{chave} = {valor}")
'''


'''
EX 3


estado = {}
brasil = []
for c in range(0,3):
    estado['uf'] = str(input("Estado: "))
    estado['sigla'] = str(input("Sigla: "))
    brasil.append(estado.copy())
for e in brasil:
    print(f"{e}")
'''

'''
EX 4



jogador = {}
partidas = []

jogador['Nome'] = str(input('Nome do Jogando: '))
total = int(input(f"Quantas partidas {jogador['Nome']} jogou? "))
for c in range (0,total):
    partidas.append(int(input(f"Quantos gols na partida {c}? ")))
jogador['Gols'] = partidas[:]
jogador['Total'] = sum(partidas)
print(jogador)
'''

'''
EX 5



lista = []
pessoa = {}
soma = 0
media = 0

while True:
    pessoa.clear()
    pessoa['Nome'] = str(input("Nome: "))
    pessoa['Sexo'] = str(input("Sexo [M/F]: ").upper())
    pessoa['Idade'] = int(input("Idade: "))
    soma += pessoa['Idade']
    lista.append(pessoa.copy())
    resp = str(input("Quer continuar? [S/N] ")).upper()
    if resp == "N":
        break
print(lista)
print(f"Ao todo temos {len(lista)} pessoas cadastradas.")
media = soma / len(lista)
print(f"A média de idade é de {media:.2f} anos")
print(f"As mulheres cadastradas foram: ")
for p in lista:
    if p['Sexo'] == "F":
        print(f"{p["Nome"]}")
'''



