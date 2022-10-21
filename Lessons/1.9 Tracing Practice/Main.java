    public static void main (String[] args)
    {
        int x = 7, y = 27, z;
        double p = 12.4, q = 2.5;
 
        C(x, x+1);
        System.out.print(" ");
        y = A(y);
        z = y / 4;
        C((int)p, z);
        System.out.print(" ");
        y -= q*4 + 1;
        C(y,y);
        System.out.print(" ");
        System.out.print(B());
    }

    public static int A(int offset)
    {
        int value;
        double r = Math.random();
        value = (int) (r%1 + offset);
        return value;
    }
  
public static String B()
    {
        String value = "";
        String word = "all";
 
        value = value + word;
        return value;
    }
    
    public static void C(int start, int stop)
    {
        String w = "University High School";
        int z = 5;
        start -= z;
        System.out.print(w.substring(start, start+1));
        System.out.print(w.substring(stop, stop+1));
    }
}
