#Ejercicio 2d

def inviertefila (fila):
    for i in range(len(fila)-1,-1,-1):
        cad= cad + "," + fila[i]
    return cad

def ImprimeMatrizinvertida(lista):
    for i in range(len(lista)-1,-1,-1):
        print(inviertefila(lista[i]))


lista = [["a","b","c"],["d","e","f"],["g","h","i"]]

ImprimeMatrizinvertida(lista)