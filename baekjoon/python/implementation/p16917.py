a, b, c, d, e = map(int,input().split())
all_half = max(d,e)*2*c
no_half = a*d+b*e
half_half = (min(d,e)*2*c)+(max(d,e)-min(d,e))*(a if d>e else b)
print(min(all_half,no_half,half_half))