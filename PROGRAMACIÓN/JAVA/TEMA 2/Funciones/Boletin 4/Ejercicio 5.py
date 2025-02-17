#Ejercicio 5

def sumaFilaPar(matriz, numfila):
    if numfila %2 == 0 :
        suma = suma + sumaFila(matriz,numfila)
    return suma

def sumaFila(matriz, numfila):
    suma = 0 
    fila = matriz[numfila]
    for i in fila:
        suma = i + suma
    return suma

matriz = [[8,1,6],[3,5,7],[4,9,2]]
print (sumaFilaPar(matriz))