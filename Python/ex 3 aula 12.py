while True:
    num1 = int(input("Digite o primeiro número da contagem:"))
    num2 = int(input("Digite o ultimo número da contagem:"))
    if num1 > num2:
        for x in range(num1, num2 - 1, - 1):
            print(x)
    else:
        for x in range(num1, num2 + 1):
            print(x)
    opcao = str(input("Digite (s) para realizar uma outra operação e digite (n) para finalizar a operação:")).lower()
    if opcao =="n":
        break

