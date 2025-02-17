#Ejercicio 2b

def imprimefila (lista):
    for i in range(len(lista)):
        print(lista[i-1])

lista = [[8,1,6],[3,5,7],[4,9,2]]
imprimefila(lista)