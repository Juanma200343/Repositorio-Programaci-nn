#Juan Manuel Dominguez Garcia Examen de Recuperacion 10 de Enero 2025

#APARTADO 0

#La funcion imprime menu sirve para saber que opcion del menu elige el usuario. (APARTADO 1)
#La funcion registrorPuntuaciones tenemos las diferentes fases los equipos que tiene cada fase (Inicial,Semifinal y Final) con sus nombres y puntuaciones. (APARTADO 2)
#La funcion listarPuntuacionesEquipo tenemos que hacer lo anterior y a parte poner en que fase estan y tambien si falta alguna fase sin registrar. (APARTADO 3)
#La funcion calculaClasificados recibirá la fase en la que se ecuentra con los diferentes equipos y puntuaciones previamente conseguidas, después nos indicará cual es la fase que queda por registrar. (APARTADO 4)

def registroPuntuaciones():
    inicial = int(input(8))
    semifinal = int(input(4))
    final =  int(input(2))
    nombre = ""
    puntuacion = ""
    datos = input(nombre + ":" + puntuacion)

    if datos == 8 :
        print("Dime 8 equipos y sus puntuaciones: ")
    
    elif datos == 4:
        print("Dime 4 equipos y sus puntuaciones: ")

    else:
        print("Dime 2 equipos y sus puntuaciones: ")

    print ("Datos registrados correctamente")

    return datos

def listarPuntuacionesEquipo():
    inicial = int(input(8))
    semifinal = int(input(4))
    final =  int(input(2))
    nombre = ""
    puntuacion = ""
    datos = input(nombre + ":" + puntuacion)

    return datos

def calculaClasificados():
    semifinal = int(input(4))
    final =  int(input(2))
    nombre = ""
    puntuacion = ""
    datos = input(nombre + ":" + puntuacion)

    return datos

def imprimeMenu():
    print("R.Registrar puntuaciones de equipos")
    print("L.Listar equipos y su puntuación por fases")
    print("C.Clasificados por fase")
    print("S.Salir.")
    while not(opcion=="A" or opcion=="L" or opcion=="C" or opcion=="S"):
        print("R.Registrar puntuaciones de equipos ")
        print("L.Listar equipos y su puntuación por fases")
        print("C.Clasificados por fase")
        print("L.Salir. ")
    return opcion

respuesta = ""

while respuesta != 4:
 
    respuesta=imprimeMenu()  
    match respuesta:
        case "1": print (f"Registrar puntuaciones de equipos"())
        case "2": print (f"Listar equipos y su puntuación por fases"())
        case "3": print (f"Clasificados por fase:"())
        case"4": print (f"Salir:"())
    
opcion = input("Indique que opción desea realizar: ")

if opcion != respuesta:
    print("Opcion incorrecta.")


nombre = ""
puntuacion = ""
datos = input(nombre + ":" + puntuacion)


while datos != 8 or datos != 4 or datos != 2:
    print("Error")

    if datos == 8 :
        print("Dime 8 equipos y sus puntuaciones: ")
    
    elif datos == 4:
        print("Dime 4 equipos y sus puntuaciones: ")

    else:
        print("Dime 2 equipos y sus puntuaciones: ")

print ("Datos registrados correctamente")