class Main {
  public static void main(String[] args) {
    Murloc marquis = new Murloc(); 

    // COMPILE ERROR occurs - you cannot access private fields from outside the class. 
    // System.out.println(marquis.health); 

    System.out.println(marquis.getHealth()); 
    System.out.println(marquis.getAttackDamage()); 

    Murloc marquess = new Murloc(145, 7); 
    System.out.println(marquess.getHealth());
    System.out.println(marquess.getAttackDamage());

    // They will fight to the death: 
    while (marquis.getHealth() > 0 && marquess.getHealth() > 0) { 
        marquis.defend(marquess.getAttackDamage()); 
        marquess.defend(marquis.getAttackDamage());
        System.out.println("Marquis: " + marquis.getHealth()); 
        System.out.println("Marquess: " + marquess.getHealth()); 
    }


    System.out.println("Marqis: " + marquis); 
    System.out.println("Marquess " + marquess);

    System.out.println(marquis.equals(marquess)); 
    System.out.println(marquis.equals(marquis)); 

    Murloc chad = new Murloc(marquis.getHealth(), marquis.getAttackDamage());

    System.out.println(marquis.equals(chad)); 
    System.out.println(marquis == chad); 
  }
}