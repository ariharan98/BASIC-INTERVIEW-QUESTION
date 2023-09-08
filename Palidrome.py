str = 'malayalam'
rev = reversed(str)

if list(str) == list(rev):
   print("The string is a palindrome.")
else:
   print("The string is not a palindrome.")