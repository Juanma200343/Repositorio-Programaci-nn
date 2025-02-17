
operacion = (input ("Introduce la operacion que quieras")) 
numero1 = int(input ("Introduce la operacion que quieras"))
numero2 = int(input ("Introduce la operacion que quieras"))

match operacion : 
    case "+" : 
        print (numero1 + numero2)
    case "-" : 
        print (numero1 - numero2)
    case "*" : 
        print (numero1 * numero2)
    case "/" : 
        print (numero1 / numero2)
    
    