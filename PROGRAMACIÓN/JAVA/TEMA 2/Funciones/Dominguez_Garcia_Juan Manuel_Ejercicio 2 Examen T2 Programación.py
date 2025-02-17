#Ejercicio 2 Examen T2 Programación Juan Manuel Dominguez Garcia

#Creamos las 4 funciones para el juego :
#Donde Iniciar partida va a tener que devolver donde se situaran los barcos en un lugar aleatorio
#Donde Disparar nos mostrara la puntuacion que llevamos en ese momento y los numeros de disparos
#Donde Resultado nos muestre numero de disparos, barcos hundidos,barcos sin hundir y puntuación actual
#Hacemos la funcion imprimeMenu donde este tiene 4 opciones : Inicia Partida,Disparar ,ImprimerResultado y Salir 

import random

def iniciaPar(posbarco):
    numbarco = 10 
    for i in range (0, 49):
        posbarco.append (random.randint (0, 49))
    return posbarco

def Disparar(numDis,pun_actual):
    posicion = ""
    if posicion == True:
        for i in range (0, 49):
            posicion = 33
    if posicion == False:
        print("Vuelve a elegir posicion")
    


def Resultado(numDis,bar_hun,bar_sin_hun, punt_actual):
    punt_actual = bar_hun / numDis *100
    print("El resultado es: ")
    




def imprimeMenu():
    print("1.Iniciar Partida ")
    print("2.Disparar")
    print("3.Resultado.")
    print("4.Salir.")
    while not(opcion=="1" or opcion=="2" or opcion=="3" or opcion=="4"):
        print("1.Iniciar Partida  ")
        print("2.Disparar ")
        print("3.Resultado")
        print("4.Salir. ")
    return opcion

while respuesta != 4:
    respuesta = ""
    respuesta=imprimeMenu()  
    match respuesta:
        case "1": print (f"Iniciar Partida",())
        case "2": print (f"Disparar",())
        case "3": print (f"Resultado:",())
        case"4": print (f"Salir:",())
    
opcion = input("Indique que opción desea realizar: ").upper()