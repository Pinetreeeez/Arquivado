#O programa interpreta a função (def) por ultimo, no terceiro exemplo da pra ver que ele primeiro interpreta o n1 e n2 e depois o resultado que ta na função.
#Quando o parenteses é vazio --> () quer dizer que ele só vai rodar a função

#Função SEM parâmetro e SEM retorno
'''
def soma():
    n1 = int(input("Digite um número: "))
    n2 = int(input("Digite outro número: "))
    r = n1 + n2
    print(f"Resultado = {r}")
    
soma()
'''

#Função SEM parâmetro e COM retorno
'''
def soma():
    n1 = int(input("Digite um número: "))
    n2 = int(input("Digite outro número: "))
    r = n1 + n2
    return r

res = soma()
print(f"Resultado = {res}")
'''

#Função COM parâmetro e SEM retorno
'''
def soma(n1,n2):
    r = n1+n2
    print(f"Resultado = {r}")

n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))
soma(n1,n2)
'''

#Função COM parâmetro e COM retorno

def soma(n1,n2):
    r = n1 + n2
    return r

n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))
res = soma(n1,n2)
print(f"Resultado = {res}")

