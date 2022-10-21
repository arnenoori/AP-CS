public class Murloc { 
  // state is declared here as instance field. DO NOT initialize them. Instance fields are normally private.
  private int health; 
  private int attackDamage;
// want to be private to protect the data 

  // Values shared amongst all Murlocs will be static: 
  private static final double DODGE_CHANCE = 0.2;

// write constructors to initiaize the instance fields. 
// Default constructors take no parameters and use default values. 

// example: 
public Murloc() { 
  this.health = 100;
  this.attackDamage = 10;
}

// Custom costructors allow you to change the values
// Constructors also have no return type and must have the same name as the classes
public Murloc(int health, int attackDamage) {
  this.health = health; 
  this.attackDamage = attackDamage;
}

// Mutator methods allow us to control how fields are changed 
public void defend(int damage) { 
  // Every murloc has a chance to dodge the attack 
  if (Math.random() < Murloc.DODGE_CHANCE) { 
    return; 
  }

  this.health = this.health - damage; 
  // shortcut: this.health -= damage;
}

// Accessor methods allow other classes to see the values of the instance fields without changing them. 
public int getHealth() { 
  return this.health; 
}

public int getAttackDamage() { 
  return this.attackDamage; 
}

    // We can change what an object prints by overriding the toString method.
public String toString() { 
  return this.health + " hp & " + this.attackDamage + " ad"; 
}

  // What if we want to check if murlocs are equal? 
  public boolean equals(Murloc otherMurloc) {
    return this.health == otherMurloc.health &&
    this.attackDamage == otherMurloc.attackDamage;
  }

}