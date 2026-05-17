'''
people: list[str] = ['Hole','Buraco','Marmita']
copy_people: list[str] = people.copy()

copy_people.remove('Marmita')
print(people)
print(copy_people)
'''

people: list[str] = ['Hole','Buraco','Marmita']
animals: list[str] = ['Cat', 'Dog', 'Mouse']

people.extend(animals) # = ['Hole', 'Buraco', 'Marmita', 'Cat', 'Dog', 'Mouse']
people.extend([animals]) # = ['Hole', 'Buraco', 'Marmita', ['Cat', 'Dog', 'Mouse']] Imprime a lista junto
print(people) 
