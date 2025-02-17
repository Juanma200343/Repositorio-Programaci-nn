#Ejercicio 8 Boletin 3 

import random
def genera_numero ():
    num =[]
    for i in range (0, 100):
        num.append (random.randint (0, 1000))
    return num

# Conocer el mayor.
def num_mayor ():
    num_generado = genera_numero()
    maximo = max (num_generado)
    return (maximo)

# Conoce el menor.
def num_menor ():
    num_generado = genera_numero()
    minimo = min (num_generado)
    return (minimo)

# Obten la suma de todos los números.
def suma_total ():
    num_generado = genera_numero()
    total = 0
    for num in num_generado:
        total = total + num
    return total

# Obtener la media.
def num_media ():
    num_generado = genera_numero()
    total = 0
    suma = suma_total()
    total = suma_total / 100
    return total

# Sustituir el valor de un elemento.
def sustituir_num (lista):
    num = int (input ("introducir un numero:"))
    elemento = input (input ("introducir el numero a sustituir:"))
    for i in range (len (lista)):
        if num == lista [i]:
            lista [i] = elemento
    return lista

def imprimeMenu():
    print("A--conoce el mayor")
    print("B--conoce el menor")
    print("C--obten la suma de todos los números")
    print("D--obtener la media")
    print("E--sustituir el valor de un elemento")
    print("F--mostrar todos los números")
    opcion = input("Indique que opción desea realizar: ").upper()
    while not(opcion=="A" or opcion=="B" or opcion=="C" or opcion=="D" or opcion=="E" or opcion=="F"):
        print("A--conoce el mayor")
        print("B--conoce el menor")
        print("C--obten la suma de todos los números")
        print("D--obtener la media")
        print("E--sustituir el valor de un elemento")
        print("F--mostrar todos los números")
    return opcion

respuesta=imprimeMenu()  
match respuesta:
    case "A": print (f"El numero mas grande es:",num_mayor())
    case "B": print (f"El numero mas pequeño es:",num_menor())
    case "C": print (f"La suma de los numeros es:",suma_total())
    case"D": print (f"La media de los numeros es:",num_media())
    case"F": print (f"Los numeros aleatorios son:",genera_numero())
    case _: print("No vale ese carácter")