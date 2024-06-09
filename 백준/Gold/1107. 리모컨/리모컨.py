def check(a):
    for el in a:
        if el in broken:
            return True
    return False


N = int(input())
M = int(input())
if M == 0:
    broken = set()
else:
    broken = set(input().split())
min_v = abs(N-100)
for i in range(1000000):
    ch = str(i)
    if check(ch):
        continue
    cnt = abs(N - i) + len(ch)
    if min_v > cnt:
        min_v = cnt
print(min_v)
