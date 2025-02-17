#Ejercicio 1 Boletin 1 Cadenas con While
cadena= "67321234376"
i=0
ultimaPosicion = len(cadena)-1
posicionMedia = int(len(cadena)/2 )
condicion = len(cadena) %2!=0
iguales = True
while i <posicionMedia and  iguales:
    if cadena [i]!=cadena [ultimaPosicion-i] :
        iguales = False
        print("distintos")
    else :
        print("iguales")
    i= i+1
if iguales :
    print("Es capicua")
else:
    print("No es capicua")