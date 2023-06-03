
public class StringArray {

	public static void main(String[] args) {
		String fourthName = "Abir";
		String name[] = stringArrayMethod("Haque",fourthName);	
		System.out.println("First Name="+name[0]);
		System.out.println("Second Name="+name[1]);
		System.out.println("Third Name="+name[2]);
		System.out.println("Fourth Name="+name[3]);
	}

	public static String[] stringArrayMethod(String thirdName, String fourthName) {
		String[] name= new String[4];
		name[0] ="Mohammad";
		name[1] = "Ashraful";
		name[2] = thirdName;
		name[3] = fourthName;
		return name;
	}
}
