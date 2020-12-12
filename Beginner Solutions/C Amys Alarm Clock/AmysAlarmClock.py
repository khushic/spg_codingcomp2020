def booleanConverter(boolean):
    if boolean == "true":
        return True
    if boolean == 'false':
        return False
def booleans(a,b):
    if a:
        if b:
            return "12:00 pm"
        else:
            return "7:00 am"
    elif b:
        return "11:00 am"
    else:
        return "7:00 am"
# isWinter and isBreak must be answered with "true" or "false"
winterIn = (input())
breakIn = (input())
isWinter = booleanConverter(winterIn)
isBreak = booleanConverter(breakIn)
print(booleans(isWinter,isBreak))