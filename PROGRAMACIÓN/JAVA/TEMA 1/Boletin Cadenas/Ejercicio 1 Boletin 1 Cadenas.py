#Ejercicio 1 Boletin 1 Cadenas
cadena= "6732376"
ultimaPosicion = len(cadena)-1
posicionMedia = int(len(cadena)/2 )
condicion = len(cadena) %2!=0
if condicion:
    posicionMedia=posicionMedia -1
for i in range(0, posicionMedia) :
    if cadena[i]== cadena[ultimaPosicion-i] :
        print("iguales")
    else: 
        print("Distintos")