package m;

/**
 * Naming convention: start the interface name with I
 */
public interface IOne {
   int m1();  //m1 is public and also abstract
  // int m2() {} no concrete methods in interfaces
   public abstract int m2();    
   int m3();
   int x = 20;  //public, static, and also final!
   int y=30;
   
}
