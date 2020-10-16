first = float(input("Введите первое: " ))
second = float (input("Введите второе : "  ))

opt = input("Выберите действие (+,-,/,*)")
if opt == "/":
    if second != 0:
       res = first / second
       print (res)
elif opt == "*":
    res = first * second
    print (res)
elif opt == "+":
    res = first + second
    print(res)
elif opt == "-":
    res = first - second
    print (res)
else:
    print("Неверное действие")
