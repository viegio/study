# Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

x = int(input('digite um valor x: '))
y = int(input('digite um valor y: '))

aux = x
x = y
y = aux

print('x: ', x, '\ny: ', y)