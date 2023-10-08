n = int(input())
for i in range(n):
    #get size
    size = int(input())

    # making farm
    farm = []
    for j in range(size):
        farm.append([0]*size)


    count = 1 # rising number

    x = 0 # x index
    y = 0 # y index

    x_way = 1 # x way num, it will be added to x
    y_way = 0 # y way num, it will be added to y

    way = 1 # now way, right is 1, down is 2, left is 3, up is 4

    # 4way's limit
    up = 0
    right = size-1
    down = size-1
    left = 0

    # write list
    while True:
        farm[y][x] = count # now num

        # if my location reach wall(last empty area) then change way
        if x == right and way == 1:
            # change x,y way num
            x_way = 0
            y_way = 1
            # change up limit
            up += 1
            # change way
            way = 2
        elif y == down and way == 2:
            x_way = -1
            y_way = 0
            right -= 1
            way = 3
        elif x == left and way == 3:
            x_way = 0
            y_way = -1
            down -= 1
            way = 4
        elif y == up and way == 4:
            x_way = 1
            y_way = 0
            left += 1
            way = 1

        # update location
        x += x_way
        y += y_way

        # if count is last num then break
        if count == size*size:
            break

        # rising count num
        count+=1

    # print
    for j in farm:
        print(*j)
'''
 Farmer John had a very large square farm. John wanted to manage the farm in more granular ways.
After much thought, he installed several vertically intersecting fences on the farm,
dividing the farm into n x n equally sized sections.
John wanted to give each section of his farm a different section number, and the rules were as follows

1. Start from the most northwest (top left) area, looking east (right).
2. Assign number 1 to the first position and proceed forward, assigning larger numbers
one by one.
3. If there is a numbered farm in front of you or at the end of the farm, turn 90 degrees
to the right and move forward.
4. It ends when there are no more farms left to number.

Farmer John, exhausted from installing the fence, passed the task of assigning numbers to his cow Bessie and then walked away. Cow Bessie must assign a number to each farm using rules handed down to her by Farmer John. Help Bessie get the job done!
===================================================================== INPUT FORMAT
The first line contains T, the number of test cases. Each test case contains input as following.
The first line contains n(1<=n<=1,000) representing the size of the farm as a single integer.
===================================================================== OUTPUT FORMAT
For each test case, print the numbers according to the farm layout across n lines, separated by spaces.
===================================================================== SAMPLE INPUT1
5
1
2
3
4
5
SAMPLE OUTPUT1
1
12
43
123
894
765
1234
12 13 14 5
11 16 15 6
10 9 8 7
12345
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
'''