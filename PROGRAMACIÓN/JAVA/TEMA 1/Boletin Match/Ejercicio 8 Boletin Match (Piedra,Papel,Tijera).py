
import random
ganador = False
while not ganador :
    humano = input("Humano elije piedra,papel,tijera").upper()
    maquina = random.randint (0,2)
    
    match maquina : 
        case 0 : 
            elec_maquina = "PIEDRA"

        case 1 : 
            elec_maquina = "PAPEL"
        
        case 2 : 
            elec_maquina = "TIJERA"


    match humano :
        case 0 :
            print ("Piedra")
            if elec_maquina == "PIEDRA" :
                print ("Maquina elije piedra. Has empatado") 
            elif elec_maquina == "PAPEL" :
                print ("Maquina elije papel. Has ganado")
            else : 
                ganador = True
                print ("Maquina elije tijera. Has perdido")

        case 1 : 
            print ("Papel")
            if elec_maquina == "PIEDRA" :
                print ("Maquina elije Piedra. Has PERDIDO") 
            elif elec_maquina == "PAPEL" :
                print ("Papel. Has empatado")
            else :   
                ganador = True
                print ("Maquina elije tijera. Has GANADO")
        case 2 :     
            print ("Tijera")
            if elec_maquina == "PIEDRA" :
                print ("Maquina elije piedra. Has ganado") 
            elif elec_maquina == "PAPEL" :
                print ("Maquina elije papel. Has perdido")
            else : 
                ganador = True  
                print ("Maquina elije tijera. Has empatado")
                
    

