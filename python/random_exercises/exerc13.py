# Receba a quantidade de alimento em quilos. 
# Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia

qtda = float(input('informe a quantidade de alimento em quilos: '))

qtda_g = qtda * 1000
dias = qtda_g / 50

print('o alimento durará ', dias, ' dias')