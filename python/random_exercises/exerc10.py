# Receba 2 números reais. Calcule e mostre a diferença desses valores

n1 = float(input('Informe o valor do 1º número: '))
n2 = float(input('Informe o valor do 2º número: '))

if n1 >= n2:
    d = n1 - n2
else:
    d = n2 - n1
print('A diferença entre os valores é: ', d)