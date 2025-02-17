#Ejercicio 3 
def convertirespaciado(cadena):
    cadenaResultado = ""
    for c in cadena:
        if c != "":
         cadenaResultado= cadenaResultado + c + ""
    return cadenaResultado

print (convertirespaciado("Hola,tu"))

