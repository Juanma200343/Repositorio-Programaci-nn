
def calculasuma (numfila,numcolum):
    suma = 0
    for fila in matriz:
        for elemento in fila:
            suma = elemento + suma
    return suma

matriz = [[8,1,6],[3,5,7],[4,9,2]]
resultado = calculasuma(matriz)
print (resultado)