#Ejercicio 2c
def imprimefila(lista):
    for i in lista:
        print(i)

def inviertefila (fila):
    for i in range(len(fila)-1,-1,-1):
        cad= cad + "," + fila[i]
    return cad

def imprimefilaInversa(lista):
    for fila in lista:
        print (inviertefila(fila))  



fila = ('a','b','c')           
#cad = inviertefila (fila)
#print (cad)
lista = [["a","b","c"],["d","e","f"],["g","h","i"]]
