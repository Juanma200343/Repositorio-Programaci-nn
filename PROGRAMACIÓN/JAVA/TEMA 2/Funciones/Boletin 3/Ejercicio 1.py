#Ejercicio 1 Boletin 3

def ordeninverso(lista):
    print(lista)
    for lista in range (len(lista),0-1):
        print(lista)

def construyelista(numlen):
    lista_num = []
    for veces in range(0,numlen,1):
        num = int(input("Dame un num"))
        lista_num.append(num)
    return lista_num

veces = int(input("¿Cuantos numeros quieres?"))
lista1= construyelista(veces)

assert (len(lista1) == veces)

ordeninverso(lista1)

lista2 = ordeninverso(lista1) 
assert (len(lista1) == len(lista2))



