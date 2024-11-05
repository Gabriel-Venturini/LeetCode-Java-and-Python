#   achar o valor mais perto de zero
##  exemplo
### Input: nums = [-4,-2,1,4,8]
### Output: 1

nums = [-4,-2,1,4,8]
print(min(nums, key=lambda x: (abs(x), -x)))