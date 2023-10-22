h, w = map(int,input().split())
datas = []
for i in range(h): datas.append(input())
r,c = 0,0
for i in range(h):
    cnt = 0
    for j in range(w):
        if datas[i][j] == 'X':cnt+=1
    if cnt == 0:r+=1
for i in range(w):
    cnt = 0
    for j in range(h):
        if datas[j][i] == 'X':cnt+=1
    if cnt == 0:c+=1
print(max(r,c))