#Ejercicio 5 Boletin 2 (subcadenas)
cadena = input("Introduce cadena :")
subcadena = input("Introduce subcadena :")
if len(cadena) > len(subcadena) :
    print("La cadena es mas larga que la subcadena")
elif len(subcadena) <= len(cadena):
    if cadena[len(cadena) - len(subcadena): len(cadena)]==subcadena:
        print("las cenas termina por {subcadena}")
    else :
        print("la cadena no termina por {subcadena}")