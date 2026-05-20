
lista_vazia: list[str] = []

class ListaTarefas:
    def __init__(self, tarefa:str):
         self.tarefa = tarefa
    
    def Adicionar_tarefa(tarefa):   
        lista_vazia.append(tarefa)                          # Método simples que adiciona o input do usuário na lista. definição simples pra adicionar strs na lista
        print("Tarefa adicionada com sucesso", end ="\n")

    def Remover_tarefa(tarefa):                                  # Método a onde ele checa se o valor imposto pelo usuário esta na lista, se estiver ele remove o valor.
        if tarefa in lista_vazia:
            lista_vazia.remove(tarefa)
            print("Tarefa removida com sucesso", end ="\n")
        else:
            print("Tarefa não encontrada", end ="\n\n")

    def Mostrar_tarefas():
        if not lista_vazia:                                              #Verifica se a lista esta vazia usando
            print("Nenhuma tarefa foi adicionada ainda... \n")
        else:
            for index, tarefa in enumerate(lista_vazia, start= 1):      #Vai iterar a lista com 2 argumentos, um pra colocar o número e o outro pra tarefa. O start= 1 faz com que o index comece no 1
                print(f"{index}. {tarefa}")
    
    def Pesquisar_tarefas(tarefa):                                  #Método igual ao de remover tarefa, só que ele vai falar se tá ou não tá na lista.
        if tarefa in lista_vazia:
            print(f"Tarefa {tarefa} existe na Lista!", end ="\n")
        else:
            print("Tarefa não existe na Lista!", end ="\n")      

    def Quantidade_tarefas():                                       # Outro método simples que usa a função len pra contar a quantidade de tarefas.
            lista_total = len(lista_vazia)
            print(f"Há um total de {lista_total} tarefas registradas!" , end ="\n\n")        
                
class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None        
        self.anterior = None

class Historico:                   
    def __init__(self):
        self.head = None           # O head é o inicio dos nós, que esta vazio agora. O ponteiro do ultimo nó sempre vai ser None pq ele vai ser o ultimo da lista
    
    def AddTarefa_removida(self, valor):
        novo_valor = No(valor)
        novo_valor.proximo = self.head            # Primeiro ele vai apontar esse node novo para o inicio dos nós
        if self.head:                       # Vai verificar se é None
            self.head.anterior = novo_valor       # Ele aponta devolta para o nó que estava apontando para ele
        self.head = novo_valor                    # Agora o head vai apontar para o novo node, transformando ele como o head (inicio) dos nós e na linha abaixo faz com que o anterior seja vazio
        novo_valor.anterior = None

    def Mostar_historico(self):                  # Método simples que conta do head(inicio) do nó até o final do nó. Ele checa também pra ver se tem há um numero deletado ou não.
        contador = 0
        atual = self.head 
        if atual == None:
            print("Não há nenhuma tarefa removida...", end="\n\n")  
        else:                     
            while atual:
                contador += 1
                print(f"{contador}. {atual.valor} ")
                atual = atual.proximo

    def Contar_historico(self):                  # Método que conta todos os nós começando pelo começo verificando se não estão vazios. Ele checa também pra ver se tem há um numero deletado ou não.
        contador = 0
        atual = self.head                        # Começa pela head (inicio)
        if atual == None:
            print("Não há nenhuma tarefa removida...", end= "\n\n")
        else:
            while atual is not None:
                contador += 1
                atual = atual.proximo
            print(f"A quantidade de tarefas removidas é : {contador} \n")


lista = Historico()

def main():
    ja_deu_print = False
    while True:
            if not ja_deu_print:
                print('''\n=========== MENU ===========
                \n Digite [1] para Adicionar uma tarefa.
                \n Digite [2] para Remover uma tarefa.
                \n Digite [3] para Mostrar as tarefas.
                \n Digite [4] para Pesquisar tarefas.
                \n Digite [5] para Mostrar a quantidade de tarefas.
                \n Digite [6] para Mostrar o histórico.
                \n Digite [7] para Mostrar a quantidade removida de tarefas.
                \n Digite [0] para Sair.
                \n''')
                ja_deu_print = True                                
            escolha = int(input("Escolha uma opção: "))

            if escolha == 1:
                x = str(input("Escreva a tarefa que deseja adicionar: "))
                print()
                ListaTarefas.Adicionar_tarefa(x)
                        
            elif escolha == 2:
                x = str(input("Escreva a tarefa que deseja remover: "))
                print()
                lista.AddTarefa_removida(x)                                # pega o valor que vc decidiu tirar pra adicionar nos nós antes dele realmente for removido
                ListaTarefas.Remover_tarefa(x)                             # esses prints sem nada dentro é pra ter espaço entre os outputs e input do usuario
                
            elif escolha == 3:
                print()
                ListaTarefas.Mostrar_tarefas()
                
            elif escolha == 4:
                x = str(input("Escreva a tarefa que deseja pesquisar: "))
                print()

                ListaTarefas.Pesquisar_tarefas(x)

            elif escolha == 5:
                print()
                ListaTarefas.Quantidade_tarefas()
            
            elif escolha == 6:
                print()
                lista.Mostar_historico()
            
            elif escolha == 7:
                print()
                lista.Contar_historico()

            elif escolha == 0:
                print()
                print("Tchau tchau! Até mais!", end ="\n\n")
                break
            else:
                print()
                print("Caractere inválido!", end ="\n\n")

main()


# List foi usado no começo do códiga na classe Lista.
# Lista encadeada foi usada na classe Historico.
# A parte mais dificil desse código foi a lista encadeada (que eu fiz como pilha) porque é muito confuso, eu adimito que eu não entendi quase nada sobre isso mesmo tendo os arquivos de estudo que você mandou e vendo tutoriais no youtube + pesquisas do goole. Por causa que é muito complicado e tem como fazer mais rápido ainda sem precisar usar lista encadeada.
# A estrutura mais facíl de percorrer foi a de list porque ela é muito mais simples de usar, mais prática e menos confusa. Eu tive um pequeno problema em lembrar de como chamar métodos dentro de uma classe mas eu consegui resolver mais rápido do que fazer com lista encadeada.