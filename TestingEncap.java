package Encapsulation;

public class TestingEncap extends GetSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingEncap te= new TestingEncap();
		String val = te.getval();
		int val2=te.getval2();
		
		System.out.println(te.getval());
		System.out.println(te.getval2());
		
		te.setval("here it is used to set the value");
		te.setval2(900);
		System.out.println(te.getval());
		System.out.println(te.getval2());
	
	}

}
