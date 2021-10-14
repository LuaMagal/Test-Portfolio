#setnlist
stringada = ["a", "j", "g", "w","c", "f", "k", "b", "b", "b", "b","c","c","c","f","g","g","a"]
tuple = 1, 2, 3
stringada_set = set(stringada)
print(type(stringada))
print(type(stringada_set))
stringada_set.add('rola')
print(stringada_set)
stringada_set.pop()
print(stringada_set)


#dictionaries
stringdarie = {'a':0, 'b':1, 'c':3 }
print(type(stringdarie))
mario = {
    'cris':{'name':'cris prat', 'age': 39, 'charisma':False}, 
    'jack':{'name':'jack blac', 'age':52, 'charisma':True}
}
print(mario['jack']['charisma'])

#if|else
phone_balance=4
bank_balance=100
if phone_balance < 5:
    phone_balance += 10
    bank_balance -= 10
print(phone_balance, bank_balance)

#elif
season = 'winter'
if season == 'spring':
    print('plant the garden!')
elif season == 'summer':
    print('water the garden!')
elif season == 'fall':
    print('harvest the garden!')
elif season == 'winter':
    print('stay indoors!')
else:
    print('unrecognized season')


#for_loop
cities = ['new york city', 'mountain view', 'chicago', 'los angeles']
for city in sorted(set(stringada)):
    print(city)
print("Done!")

names = ["Joey Tribbiani", "Monica Geller", "Chandler Bing", "Phoebe Buffay"]
usernames = []
for i in names:
    usernames.append(i.replace(' ', '_').lower())   

print(usernames)

#creating dictionaires with for_loops
book_title =  ['great', 'expectations','the', 'adventures', 'of', 'sherlock','holmes','the',
               'great','gasby','hamlet','adventures','of','huckleberry','fin']
word_counter = {}
for word in book_title:
    if word not in word_counter:
        word_counter[word] = 1
    else:
        word_counter[word] += 1

print(word_counter)
for word in book_title:
    word_counter[word] = word_counter.get(word, 0) + 1
print(word_counter)

#items method
cast = {
           "Jerry Seinfeld": "Jerry Seinfeld",
           "Julia Louis-Dreyfus": "Elaine Benes",
           "Jason Alexander": "George Costanza",
           "Michael Richards": "Cosmo Kramer"
       }

print("Iterating through keys:")
for key in cast:
    print(key)

print("\nIterating through keys and values:")
for key, value in cast.items():
    print("Actor: {}    Role: {}".format(key, value))

#while_loops
start_num = 10
end_num = 101
count_by = 2
break_num = start_num

if break_num > end_num:
        result = "Oops! Looks like your start value is greater than the end value. Please try again."

else:
    while break_num < end_num:
         break_num += count_by
         result = break_num
print(result)

#zip function

