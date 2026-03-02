# PARTE 1 BÁSICOS
#1
'''
x = int(input("Digite um número inteiro: "))
if x % 2 == 0:
    print("Par")
else:
    print("ímpar")
''' 

#2
'''
idade = int(input("Digite a sua idade: "))
if idade >= 18:
    print("Maior de idade")
else:
    print("Menor de idade") 
'''   

#3   
'''
compra = int(input("Digite o valor da sua compra: "))
if compra > 100:
    x = compra * 0.10
else:
    x = compra * 0.05
print(f"Você terá um desconto de: {x}")
'''

#4
'''
listadias = ["Domingo", "Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"]
x = int(input("Insira um número entre 0 á 6: "))
if x <= 6 and x >= 0:
    print(listadias[x])
else:
    print("Invalído")
'''

#5
'''
ano = int(input("Digite um ano para saber se é bissexto: "))
if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
    print("È um ano bissexto")
else:
    print("Não é um ano bissexto")
'''   

#PARTE 2 - INTERMEDIÁRIOS

#1
'''
primeiro = int(input("Insira o primeiro número: "))
segundo = int(input("Insira o segundo número: "))
terceiro = int(input("Insira o terceiro número: "))
if primeiro > segundo and primeiro > terceiro:
    print(f"{primeiro} é o maior número")
elif segundo > primeiro and segundo > terceiro:
    print(f"{segundo} é o maior número")
else:
    print (f"{terceiro} é o maior numero")
'''
     
#2
'''
peso = float(input("Informe seu peso (kg): "))   
altura = float(input("Informe sua altura (m): ")) 
imc = peso % (altura ** 2)
if imc < 18.5:
    print("Abaixo do peso")
elif 18.5 < imc <25:
    print("Peso normal")
elif 25 < imc <30:
    print("Sobrepeso")    
elif imc > 30:
    print("Obeso")
'''