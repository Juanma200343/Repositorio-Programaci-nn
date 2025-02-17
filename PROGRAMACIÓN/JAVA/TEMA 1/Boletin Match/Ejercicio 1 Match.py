
ClaveU = int (input ("Dame una contraseña"))
match ClaveU  :
    case 1 :
        ClaveU = 1234 | 4321 
        print ("Es la contraseña")

    case _ :
      print ("No es la contraseña") 