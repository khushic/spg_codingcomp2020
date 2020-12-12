def mathOperation(a,b,operation):
    if operation == "+":
        return a + b
    if operation == "-":
        return a - b
    if operation == "*":
        return a * b
    if operation == "/":
        return a / b

num1 = float(input())
num2 = float(input())
math = input()
print(mathOperation(num1,num2,math))
