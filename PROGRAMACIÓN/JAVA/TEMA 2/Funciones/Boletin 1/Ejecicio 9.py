#Ejecicio 9

def convertirSegundos (segundos):
    horas = int(segundos / 3600)
    minutos =int((segundos % 3600) / 60)
  
    return horas, minutos

def convertirSegundosAHoras(segundos):
    horas = int(segundos / 3600)
    return horas 

def convertirSegundosAMinutos(segundos):
    minutos =int((segundos % 3600) / 60)
    return minutos



menu = int (input("Introduce una opción del menú: "))

while menu != 4: 
    segundos = int (input ("Introduce el tiempo en segundos: "))

    if menu == 1: 
        print (segundos, "segundos")
    elif menu == 2:
        print (convertirSegundosAMinutos (segundos), "minutos")
    elif menu ==3: 
        print (convertirSegundosAHoras (segundos), "horas")
    elif menu == 4:
        print ("Saliendo del programa")
    menu =  int (input("Introduce una opción del menú: "))
