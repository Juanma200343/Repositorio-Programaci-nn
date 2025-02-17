#Examen T2 Programación Ejercicio 1 Juan Manuel Domínguez García

# 1.Hacemos una función llamada letras para que nos devuelva las palabras que empiecen por esa o esas letras que estan en la lista. (Rival 5 no sale ya que no esta añadida a la lista)
# 2.Hacemos otra función donde llamada caracterespec donde nos devolvera una lista donde esta contenga una todos los caracteres que les pido. EJ: si le pido el carracter ba que me devuelva todos los elementos de la lista que empiecen por dicho caracter.

def letras(lista):
    palabra = []
    caracter = ""
    for lista in range(0,20) :
       if caracter == lista:
            palabra = caracter + lista 
    return palabra

def caracterespec(lista):
    caracter = "Ry"
    listary= []
   
        





print(input("Introduce una palabra: "))
lista = ["Core i9", "Ryzen 9", "core i7", "Ryzen 5", "fury Beast", "Vengeance LPX", "trident Z5", "Ballistix Sport", "980 PRO", "Black SN850X", "barracuda HDD", "MX500 SSD", "geForce RTX", "radeon RX", "GeForce GTX", "Radeon 6600",  "ROG STRIX", "MPG B550", "Aorus X570", "steel legend"]
palabra = []
print (letras(lista))
print(lista)