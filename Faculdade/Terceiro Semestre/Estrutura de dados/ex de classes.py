'''
class Livro:
    def __init__(self,titulo,autor,ano):
        self.titulo = titulo
        self.autor = autor
        self.ano = ano
    
    def exibir_informacoes(self):
        print(f"Titulo do livro: {self.titulo}, Nome do autor: {self.autor}, Ano que foi publicado: {self.ano}")
 
informacoes = Livro('Wuthering Heights', 'Healthcliff', int(2005))
informacoes.exibir_informacoes()
'''   

class Aluno:
    def __init__(self, nome, matricula, media):
             self.nome = nome
             self.matricula = matricula
             self.media = media
    
    def _exibir(self):
        print(f"Aluno: {self.nome}, Matricula: {self.matricula}, Média: {self.media}")
    
    def _status(self):
        if self.media >= 6:
            print(f"Esse aluno foi aprovado com a nota {self.media} ")
        else:
            print(f"Esse aluno foi reprovado com a nota {self.media}")

estudante = Aluno('Otávio','Feita', int(5))
estudante._exibir()
estudante._status()