1. Reduce problem instance to smaller instance of the same problem and solve smaller instance
2. Extend solution of smaller instance to obtain solution to original instance
  
Can be implemented:
• top-down (Recursive)
• bottom-up (Iterative)


Recursive
  Factorial (n)
if n = 1 then
return 1
else
return Factorial(n − 1) × n

  
Iterative
  Factorial (n)
F ← 1
for i← 1 to i← n
F ← F *i
return F


