def shareCookies(c):
    if c % 2 == 0:
        return "Alex and Joey can share the cookies equally."
    else:
        return "Alex and Joey cannot share the cookies equally"
cookies = int(input())
print(shareCookies(cookies))
