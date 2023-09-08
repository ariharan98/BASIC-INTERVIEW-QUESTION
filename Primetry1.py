from sympy import *

str =int(input("Enter the no: "))

Prime = isprime(str)

if Prime:
  print(Prime,str,"It is Prime ...")
else:
  print(Prime,str,"Its not a Prime ....")
