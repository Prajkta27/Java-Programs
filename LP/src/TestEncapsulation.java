
// Java program to demonstrate encapsulation
class Encapsulate {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String geekName;
	private int geekRoll;
	private int geekAge;

	// get method for age to access
	// private variable geekAge
	public int getAge() { return geekAge; }

	// get method for name to access
	// private variable geekName
	public String getName() { return geekName; }

	// get method for roll to access
	// private variable geekRoll
	public int getRoll() { return geekRoll; }

	// set method for age to access
	// private variable geekage
	public void setAge(int newAge) { geekAge = newAge; }

	// set method for name to access
	// private variable geekName
	public void setName(String newName)
	{
		geekName = newName;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setRoll(int newRoll) { geekRoll = newRoll; }
}

public class TestEncapsulation  {
	public static void main(String[] args)
	{
		TestEncapsulation obj = new TestEncapsulation();

		// setting values of the variables
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);

		// Displaying values of the variables
		System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());
		// Direct access of geekRoll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.geekName);
	}


	private String getRoll() {
		// TODO Auto-generated method stub
		return null;
	}


	private String getAge() {
		// TODO Auto-generated method stub
		return null;
	}


	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	private void setRoll(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}