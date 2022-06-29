# Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
# Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).

import math

a = float(input('Informe o valor do coeficiente a: '))
b = float(input('Informe o valor do coeficiente b: '))
c = float(input('Informe o valor do coeficiente c: '))
print()

delta = (b * b) - (4 * a * c)

x1 = (-b + math.sqrt(delta)) / (2*a)
x2 = (-b - math.sqrt(delta)) / (2*a)

print('O valor de x1: ', x1)
print('O valor de x2: ', x2)