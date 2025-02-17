#Ejercicio 2 Simulacro Examen
def asignasur(tipo):
    numsur = 
    litros =


    return numsur,litros


def devuelvesur(numlitro):

    return numlitro

def consulsur():



    return surtidor


def asignapre():




    return precio


def recargasur():



    return recarga


def cerrarmen():




    return cerrar


def imprimeMenu():
    print("1.Asignar coche a surtidor y repostar ")
    print("2.Consultar estado de surtidores ")
    print("3.Asignar precio al surtidor.")
    print("4.Recargar surtidor.")
    print("5.Cerrar el programa y salir. ")
    while not(opcion=="1" or opcion=="2" or opcion=="3" or opcion=="4" or opcion=="5"):
        print("1.Asignar coche a surtidor y repostar ")
        print("2.Consultar estado de surtidores ")
        print("3.Asignar precio al surtidor.")
        print("4.Recargar surtidor.")
        print("5.Cerrar el programa y salir. ")
    return opcion

while respuesta != 5:
    respuesta = ""
    respuesta=imprimeMenu()  
    match respuesta:
        case "1": print (f"Asigna al surtidor:",asignasur())
        case "2": print (f"Consulta de surtidor:",consulsur())
        case "3": print (f"Asigna precio:",asignapre())
        case"4": print (f"Recarga surtidor:",recargasur())
        case"5": print (f"Cerrar menu:",cerrarmen())
    
opcion = input("Indique que opción desea realizar: ").upper()