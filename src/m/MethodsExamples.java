package m;

import java.lang.reflect.Method;

public class MethodsExamples {
	static int  x = 10;
	int y =20;
	
    int f1(int x, int y) {
       return ++MethodsExamples.x+x;	
    }
    static int f2(int x, int y) {
    	return MethodsExamples.x+ y;
    }
	public static void main(String[] args) {
		MethodsExamples ref = new MethodsExamples();
       System.out.println(ref.f1(10,20));
       System.out.println("static x = "+x);
       System.out.println(f2(10,20));
       
       
	}

}
