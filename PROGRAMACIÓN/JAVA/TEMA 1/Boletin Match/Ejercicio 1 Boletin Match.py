
dia = input ("Dia de la semana").upper()

match dia : 
    case "LUNES" :
        print ("De 8:00 - 11:00 LEMGUAJE DE MARCAS")

    case "MARTES" :
        print ("De 8:00 a 10:00 PROGRAMACION y de 10:00 a 11:00 ENTORNO")

    case "MIÉRCOLES" :
        print ("De 8:00 a 10:00 PROGRAMACION y de 10:00 a 11:00 BASE DE DATOS")

    case "JUEVES" :
        print ("De 8:00 a 10:00 PROGRAMACION y de 10:00 a 11:00 IT.PERSONAL")

    case "VIERNES" :
        print ("De 8:00 a 10:00 PROGRAMACION y de 10:00 a 11:00 BASE DE DATOS")

    case "SABADO | DOMINGO" :
        print ("Dia de Descanso")

     