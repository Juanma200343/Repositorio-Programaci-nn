#Ejercicio 2e

def damecolumnas(lista,nºcolumna):
    lista = []

    for i in range (0,len(lista)):
      lista.insert(lista[i][nºcolumna])
    return lista










lista1 = [["a","b","c"],["d","e","f"],["g","h","i"]]
damecolumnas(lista1) 