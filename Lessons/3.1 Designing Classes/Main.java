class Main {
  public static void main(String[] args) {

/*
Cohesion - 
Coupling - dating multiple people at the same time 
Side effects - in code, any time any object is changed, it is a side effect (doesnt mutate object)
main effect - there is none 


Murloc: 
state: list of variables that makes u state 
factors: 
- color 
- health 
- weapon 
- attackType
- attackDamage
- movementSpeed 
- armor 
- aggroDistance
- magicResistance 
- directionFacing 
- position
- sound
- criticalChance
function: 
- attack 
  - parameters
    - target (location & hitbox)   
    - return (amountOfDamage) 
  - access 
    - weapon 
    - attackDamage 
    - criticalChance 
    - directionFacing
- defend 
  - parameters 
    - incomingDamage 
    - target 
  - return 
    - damageTaken 
  - access 
    - health 
    - armor 
    - magicResistance 
  - calls
    - checks for die function
- runAway
  - parameters: 
    - position 
    - directionFacing
    - moveSpeed 
- die 
- patrol
- move 

*/



  }
}
// Nice.