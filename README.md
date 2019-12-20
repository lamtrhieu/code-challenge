# code-challenge answer

### A

1a I mock the PrintStream and set it to System and verify it using Mockito. I will apply the same technique for all other classes\
1b I will segregrate it into an interface Singable.

2 I will override sing method to provide specific sound for each type of Bird. And for Chicken, I will throw exception when method fly is called. 

3a Override method sing()\
3b Rooster is just a specific kind of Chicken, I can extends from Chicken.\
3c I can use composition instead of inheritance. Inside a rooster can contain a chicken to delegate the method call to.\

- 4. I use a Bridge pattern here so that a Parrot can have friend variable. And parrot will immitate friend sound. 
I just use friend sing method. 

### B 
1a. Will implements specific interface here 
1b. Add specific property for each kind of fish
1c. I use specifice interface Swimmable so Dolphin don't need to extends Fish

### D
1a Just need to implement Flyable\
2 I use state pattern and have 2 kind of state (caterpillar and butterfly). So depend on the state, some method can be call, other will throw exception.\

### E

Because I have refactor the code to specific interface like Flyable, Walkable, Singable, Swimmable so I just need to do the check
- The class is instance of the interface
- The method can be call successfully without exception.
and count for the total number. 

### Bonus

Again, I add a private Tone into the class and sing will get the specific tone from the tone to sing.
Tone will be injected by constructor when create object (or can be change to using setter).

I would design the API as : 

URL 
/api/v1/animals/ ? type=xxxx

param:
type: animal type like fish,dog,cat...

return : 
200 : json string represent the animal information 

exception :
500 : internal server error
503 : service unavailable
404 : bad request, animal type is not valid





 
