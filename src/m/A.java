package m;

public class A extends Object implements IOne, ITwo  {

	@Override
	public int m1() {
		//x++;
		return IOne.x+ IOne.y + 10;
		
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 20;
	}
	public int m3() {
		
		return 30;
	}
	@Override
	public int m4() {
		// TODO Auto-generated method stub
		return 40;
	}
    public static void main(String args[]) {
    	//A a = new A();
    	IOne a1 = new A();
    	//IOne a2 = new IOne(); //will never work, you can't have interface type objects
    	ITwo a2 = new A();
    	
    	
    	
    			
    }

	

}
