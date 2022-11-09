# For the following list of numbers:

numbers = [1, 6, 2, 2, 7, 1, 6, 13, 99, 7]

# 1. Print out a list of the even integers:
even_integers = []

for number in numbers:
  if number % 2 == 0:
    even_integers.append(number)
print(even_integers)

# 2. Print the difference between the largest and smallest value:
sorted_numbers = sorted(numbers)
difference = sorted_numbers[-1] - sorted_numbers[0]
print(difference)

largest = max(numbers)
smallest = min(numbers)
print(largest - smallest)

# 3. Print True if the list contains a 2 next to a 2 somewhere.
# sorted_numbers = sorted(numbers)
# if numbers.count(2) > 1:
#   print(True)
# else:
#   print(False)

result = False
index = 0

for number in numbers:
  if (number == 2 and numbers[index-1] == 2):
    result = True
  index += 1
print(result)
  

# 4. Print the sum of the numbers, 
#    BUT ignore any section of numbers starting with a 6 and extending to the next 7.
#    
#    So [11, 6, 4, 99, 7, 11] would have sum of 22
# Expecting sum of 2
sum = 0
stop_adding = False
for number in numbers:
  if number == 6:
    stop_adding = True
  elif number == 7:
    stop_adding = False
  elif stop_adding is False:
    sum = sum + number
print(sum)

# 5. HARD! Print the sum of the numbers. 
#    Except the number 13 is very unlucky, so it does not count.
#    And numbers that come immediately after a 13 also do not count.
#    HINT - You will need to track the index throughout the loop.
#
#    So [5, 13, 2] would have sum of 5. 
#  Expecting sum of 32
    # sum = 0
    # unlucky_number = 13
    # unlucky_number_neighbour = 0
    # for index, number in enumerate(numbers):
    #   if number == unlucky_number:
    #     unlucky_number_neighbour = numbers[index+1]
    #   elif number != unlucky_number_neighbour:
    #     sum = sum + number
    # print(sum)


index = 0
total = 0
for number in numbers:
  if number == 13 or numbers[index-1] == 13:
    pass
  else:
    total += numbers
  index += 1
print(total)