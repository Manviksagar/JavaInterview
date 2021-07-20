package corejava;

class TestClone implements Cloneable{
	
	int id;
	String name;
	TestClone(int id, String name){
		this.id=id;
		this.name= name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}

public class CloningCheck {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		TestClone sag1= new TestClone(1, "Sagar");
		System.out.println(sag1.id + sag1.name);
		//Cloning sag1 object to sag2.
		TestClone sag2 = (TestClone) sag1.clone();
		System.out.println(sag2.id + sag2.name);
		

	}

}
