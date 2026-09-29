# num=list(map(int,input().split()))
# target=int(input())
# def two_sum(num,target):
#     for i in range(len(num)):
#         for j in range(i+1,len(num)):
#             if num[i]+num[j]==target:
#                 return[i,j]
# print(two_sum(num,target))

# s=input()
# t=input()
# def is_anagram(s,t):
#     if sorted(s)==sorted(t):
#        return ("anagram")
#     else:
#         return ("not an anagram")
# print(is_anagram(s,t))

# num=list(map(int,input().split()))
# def contains_duplicate(num):
#     return len(num) != len(set(num))
# print(contains_duplicate(num))

# s=input()
# fre={}
# for ch in s:
#     if ch in fre:
#         fre[ch]+=1
#     else:
#         fre[ch]=1
# print(fre)

# nums=list(map(int,input().split()))
# def move(nums):
#     result=[]
#     for num in nums:
#         if num !=0:
#             result.append(num)
#     while len(result) < len(nums):
#         result.append(0)
#     return result
# print(move(nums))

# prices=list(map(int,input().split()))
# def max(prices):
#     min=prices[0]
#     profit=0
#     for price in prices:
#         if price<min:
#             min=price
#         current=price-min
#         if current > profit:
#             profit=current
#     return profit
# print(max(prices))      

# s=input()
# def valid(s):
#     stack=[]
#     pairs={
#         ')':'(',
#         ']':'[',
#         '}':'{'
#     }
#     for ch in s:
#         if ch in '([{':
#             stack.append(ch)
#         else:
#             if not stack or stack[-1] != pairs[ch]:
#                 return False
#             stack.pop()
#     return len(stack)==0
# print(valid(s))