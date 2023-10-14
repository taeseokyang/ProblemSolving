import sys
n = int(input())
for i in range(n):
    nums_a = list(map(int,sys.stdin.readline().strip().split()))[1:]
    nums_b = list(map(int,sys.stdin.readline().strip().split()))[1:]
    nums_a.sort(reverse=True)
    nums_b.sort(reverse=True)
    if nums_a>nums_b:print('A')
    elif nums_a<nums_b:print('B')
    else: print('D')