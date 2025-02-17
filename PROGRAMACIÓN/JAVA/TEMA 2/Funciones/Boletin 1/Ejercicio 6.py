#Ejercicio 6
from math import pi
def calaculaArea (radio):
    area = radio^2*pi   
    return area

def calculaPerimetro (radio):
    perimetro = 2*pi*radio
    return perimetro

def calculaAreaYPerimetro (radio):
    area =  calaculaArea (radio)
    perimetro = calculaPerimetro(radio) 
    return[perimetro,area]

radioentrada = int(input("Dame un numero"))
resultado = calculaAreaYPerimetro(radioentrada)
print(resultado[0])
print(resultado[1])