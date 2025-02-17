
print ("Habitacion 1 : azul")
print ("Habitacion 2 : roja")
print ("Habitacion 3 : verde")
print ("Habitacion 4 : rosa")
print ("Habitacion 5 : gris")

habitacion = int(input("Selecciona una Habitacion {1,2,3,4,5}"))
while habitacion != 0 :
    match "habitacion" :
        case "1" : 
            print ("La habitacion tiene 2 camas y esta en la primera planta")
        case "2" : 
            print ("La habitacion tiene 1 cama y esta en la primera planta")
        case "3" : 
            print ("La habitacion tiene 3 camas y esta en la segunda planta")
        case "4" : 
            print ("La habitacion tiene 2 camas y esta en la segunda planta")
        case "5" : 
            print ("La habitacion tiene 1 cama y esta en la tercera planta")
        case _ :
            print ("No existe")

    habitacion = int(input("Selecciona una Habitacion {1,2,3,4,5}"))

