num1 = 48
num2 = 180



def gcd(num1, num2):
    maxim = max(num1, num2)
    minim = min(num1, num2)
    list = []
    rem = maxim%minim
    while(rem!=0):
            rem = maxim%minim
            q = maxim//minim
            maxim = minim*q+rem
            maxim = minim
            minim = rem
            list.append(rem)
    return list[-2]
            
gcd(num1, num2)
