#Ejercicio 6
def sumaColumna(matriz, numColumna):
    sumacolum = 0
    for fila in matriz:
        sumacolum = fila[numColumna] + sumacolum
    return sumacolum

matriz = [[8, 1, 6], [3, 5, 7], [4, 9, 2]]
#Sumar columnas
print(sumaColumna (matriz,1))
