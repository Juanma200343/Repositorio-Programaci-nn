#Ejercicio 8 

def calculaMax(matriz,numfila):
    max = -99999999
    fila =matriz[numfila]
    for elemento in fila:
        if elemento > max:
            max = elemento
    return max



matriz = [[8,1,6],[3,5,7],[4,9,2]]
numfila = 1
print(calculaMax(matriz,numfila))