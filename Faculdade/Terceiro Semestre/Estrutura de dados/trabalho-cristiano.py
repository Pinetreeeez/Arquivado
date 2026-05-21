
lista_vazia: list[str] = []

class ListaTarefas:
    def __init__(self, tarefa:str):
         self.tarefa = tarefa
    
    def adicionar_tarefa(tarefa):   
        lista_vazia.append(tarefa)                          # Método simples que adiciona o input do usuário na lista. definição simples para adicionar strs na lista.
        print("Tarefa adicionada com sucesso", end ="\n\n")

    def remover_tarefa(tarefa):                                  # Método a onde ele checa se o valor imposto pelo usuário está na lista, se estiver ele remove o valor.
        lista_vazia.remove(tarefa)
        print("Tarefa removida com sucesso", end ="\n\n")

    def mostrar_tarefas():                                       # Método no qual mostra todas as tarefas adicionadas por meio de uma iteração.
        if not lista_vazia:                                              # Verifica se a lista está vazia.
            print("Nenhuma tarefa foi adicionada ainda... \n")
        else:
            for index, tarefa in enumerate(lista_vazia, start= 1):       # Vai iterar a lista com 2 argumentos, um para colocar o número e o outro para tarefa. O start= 1 faz com que o index comece no 1.
                print(f"{index}. {tarefa} \n")
    
    def pesquisar_tarefas(tarefa):                                  # Método igual ao de remover tarefas, só que ele vai falar se tá ou não tá na lista.
        if tarefa in lista_vazia:
            print(f"Tarefa {tarefa} existe na Lista!", end ="\n\n")
        else:
            print("Tarefa não existe na Lista!", end ="\n\n")      

    def quantidade_tarefas():                                       # Outro método simples que usa a função len para contar a quantidade de tarefas.
            lista_total = len(lista_vazia)
            print(f"Há um total de {lista_total} tarefas registradas!" , end ="\n\n")        
                
class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None        
        self.anterior = None

class Historico:                   
    def __init__(self):
        self.head = None           # O head é o início dos nós, que está vazio agora. O ponteiro do último nó sempre vai ser None pq ele vai ser o último da lista.
    
    def tarefa_removida(self, valor):             # Função que pega a tarefa inserida pelo usuário antes que ela seja deletada para guardar nos nós.
        novo_valor = No(valor)
        novo_valor.proximo = self.head            # Primeiro ele vai apontar esse node novo para o início dos nós.
        if self.head:                       # Vai verificar se é None.
            self.head.anterior = novo_valor       # Ele aponta devolta para o nó que estava apontando para ele.
        self.head = novo_valor                    # Agora o head vai apontar para o novo node, transformando ele como o head (início) dos nós e na linha abaixo faz com que o anterior seja vazio.
        novo_valor.anterior = None

    def mostrar_historico(self):                   # Método simples que conta do head(início) do nó até o final da lista encadeada. Ele checa também pra ver se tem um número deletado ou não.
        contador = 0
        atual = self.head 
        if atual == None:
            print("Não há nenhuma tarefa removida...", end="\n\n")  
        else:
            ja_deu_print = False                     
            while atual:
                contador += 1
                if not ja_deu_print:
                    print(f"   --HISTÓRICO-- \n")
                    ja_deu_print = True 
                print(f"{contador}. {atual.valor} \n")
                atual = atual.proximo

    def contar_historico(self):                  # Método que conta todos os nós começando pelo começo verificando se não estão vazios. Ele checa também para ver se tem um número deletado ou não.
        contador = 0
        atual = self.head                        # Começa pela head (inicio).
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
            print()

            if escolha == 1:
                x = str(input("Escreva a tarefa que deseja adicionar: ")).lower()        
                if x not in lista_vazia:                                         # Para checar se já está na lista.
                    print()
                    ListaTarefas.adicionar_tarefa(x)
                else:
                    print()
                    print("Erro, já existe essa tarefa", end ="\n\n")
                        
            elif escolha == 2:
                x = str(input("Escreva a tarefa que deseja remover: ")).lower()  
                if x not in lista_vazia:                                        # Para checar se não está na lista.
                    print("Tarefa não encontrada", end ="\n\n")
                else:
                    print()
                    lista.tarefa_removida(x)                                # Pega o valor que o usuário decidiu tirar para adicionar nos nós antes dele realmente for removido.
                    ListaTarefas.remover_tarefa(x)                          # Esses prints sem nada dentro é para ter espaço entre os outputs e input do usuário (para ficar melhor de ver os resultados).
                
            elif escolha == 3:
                ListaTarefas.mostrar_tarefas()
                
            elif escolha == 4:
                x = str(input("Escreva a tarefa que deseja pesquisar: ")).lower()  
                print()
                ListaTarefas.pesquisar_tarefas(x)

            elif escolha == 5:
                ListaTarefas.quantidade_tarefas()
            
            elif escolha == 6:
                lista.mostrar_historico()
            
            elif escolha == 7:
                lista.contar_historico()

            elif escolha == 0:
                print("Tchau tchau! Até mais!", end ="\n\n")
                break
            else:
                print("Caractere inválido!", end ="\n\n")

main()


# 1. List foi usado na classe Lista.


# 2. Lista encadeada foi usada na classe historico.


# 3. A parte mais difícil desse código foi a lista encadeada porque é muito confusa, eu admito que eu não entendi quase nada sobre isso mesmo tendo os arquivos de estudo que você mandou e vendo tutoriais no youtube + pesquisas do google. Por causa que é muito complicado e tem como fazer mais rápido ainda sem precisar usar lista encadeada.


# 4. A estrutura mais fácil de percorrer foi a de lista porque ela é muito mais simples de usar, mais prática e menos confusa. Eu tive um pequeno problema em lembrar de como chamar métodos dentro de uma classe, mas eu consegui resolver mais rápido do que fazer com lista encadeada.


# Errei um monte de coisa fazendo esse código ksksksks mas foi legal fazer.

