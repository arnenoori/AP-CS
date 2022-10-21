public class Person { 
  private int health; 
  private int attackDamage;
  private int getName;
  private static final double DODGE_CHANCE = 0.2;
 
public Person() { 
  this.health = 100;
  this.attackDamage = 10;
}

public Person(int health, int attackDamage) {
  this.health = health; 
  this.attackDamage = attackDamage;
}

public void defend(int damage) { 
  if (Math.random() < Person.DODGE_CHANCE) { 
    return; 
  }
  this.health = this.health - damage; 
}

public int getHealth() { 
  return this.health; 
}

public int getAttackDamage() { 
  return this.attackDamage; 
}

public String toString() { 
  return this.health + " hp & " + this.attackDamage + " ad"; 
}

  public boolean equals(Person otherPerson) {
    return this.health == otherPerson.health &&
    this.attackDamage == otherPerson.attackDamage;
  }

}