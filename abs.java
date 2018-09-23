import java.util.*;


abstract class A {
 public abstract void methodA();
}

interface B {
 public void printB();
}

class C extends A implements B {
   public void methodA() {
        System.out.print("I am abstract implementation");
    }

  public void printB() {
       System.out.print("I am interface implementation");
   }
}
public class abs extends C{
	public static void main(String[] args) {
		
	}
}
