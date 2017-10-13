# 파일 쓰기
f = open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", 'w')
for i in range(1,11) :
    data = "%d번째 줄입니다.\n" % i
    f.write(data)
f.close()

# readline함수
f = open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", 'r')
line = f.readline()
print(line)

print("*" * 30)
while True :
    line = f.readline()
    if not line : break
    print(line)
    
print("*" * 30)
f.close()

# readlines함수
f = open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", 'r')
lines = f.readlines()
print(lines)

f.close()

print("*" * 30)

# read함수
f = open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", 'r')
data = f.read()
print(data)
f.close()

print("*" * 30)

# 파일에 새로운 내용 추가
f = open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", 'a')
for i in range(11,15) :
    data = "%d번째 줄입니다.\n" % i
    f.write(data)
f.close()

# with
with open("C:/Users/cosmos/Documents/GitHub/Rapport/김민범/Python/파일 읽고 쓰기 실습.txt", "w") as f :
    f.write("Life is too short, you need python")

