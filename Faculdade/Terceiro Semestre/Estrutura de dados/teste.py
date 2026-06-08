class No:
    def __init__(self, dado):
        self.dado = dado
        self.proximo = None
        
class Testando:
    def __init__(self):
        self.head = None

    def inserir_inicio (self,dado):
        novo = No(dado)
        novo.proximo = self.head
        self.head = novo
    
    def inserir_fim (self,dado):
        novo = No(dado)
        if self.head is None:
            self.head = novo
            return
    
        atual = self.head
        while atual.proximo is not None:
            atual = atual.proximo
        atual.proximo = novo
    
    def mostrar (self):
        atual = self.head
        if atual == None:
            print("Não há nada.....")
        else:
            while atual:
                print(f"{atual.dado} -> ", end="")
                atual = atual.proximo
    
    def procurar(self,dado):
        atual = self.head
        while atual is not None:
            if atual.dado == dado:
                print(f"\nO valor {dado} esta na lista! \n")
                return
            atual = atual.proximo
        print("\nValor não esta na lista...\n")



lista = Testando()

lista.inserir_inicio(10)
lista.inserir_inicio(20)
lista.inserir_fim(30)
lista.mostrar()
lista.procurar(20)
lista.procurar(50)
