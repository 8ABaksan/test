vvod = input()
znach = vvod.split()
first = znach[0]
second = znach[2]
opt = znach[1]
if opt == "+":
    print(float(second) + float(first))
elif opt == "-":
    print(float(first) - float(second))
elif opt == "*":
    print(float(second) * float(first))
elif opt == "/":
    print(float(first) / float(second))
elif opt == "**":
    print(float(first) ** float(second))
else:
    print("НЕПРАВИЛЬНЫЙ ОПЕРАТОР")
