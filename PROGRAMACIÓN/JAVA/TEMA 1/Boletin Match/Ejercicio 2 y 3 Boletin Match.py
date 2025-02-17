
estaciones = int(input("Introduce un mes: "))
dia = int(input("Introduce un dia: "))

match estaciones : 
    case 1|2|3 : 
       
        if estaciones == 3 and dia <=20 :
            print ("INVIERNO")
        elif estaciones == 3 and dia >=20 :
         print ("PRIMAVERA")
        else :
             print ("INVIERNO")

    case  4|5|6 : 
       
        if estaciones == 6 and dia <=20 :
            print ("PRIMAVERA")
        elif estaciones == 6 and dia >=20 :
            print ("VERANO") 
        else :
            print ("VERANO")

    case  7|8|9 : 
      
        if estaciones == 9 and dia <=20 :
            print ("VERANO")
        elif estaciones == 9 and dia >=20 :
            print ("OTOÑO")
        else :
            print ("OTOÑO")

    case 10|11|12 : 
      

        if estaciones == 12 and dia <=20 :
            print ("OTOÑO")
        elif estaciones == 12 and dia >=20 :
            print ("INVIERNO")