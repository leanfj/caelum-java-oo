import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PosPreIncremento {
  public static void main(String[] args) {
    int a = 2;

    int z = a++;

    System.out.println(z);
    
    System.out.println(a++);

    int b = 2;
    int x = ++b;

    System.out.println(x);
  }  
}
