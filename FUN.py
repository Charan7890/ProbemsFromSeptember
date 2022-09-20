s,e = list(map(int,input().split(' ')))

res = [False]*10

for i in range(s,e+1):
	dup = i
	while i!=0:
		rem = i%10
		if res[rem] == True:
			break
		else:
			res[rem] = True
			i = i//10
	res = [False]*10
	if i==0:
		print(dup,end=" ")




