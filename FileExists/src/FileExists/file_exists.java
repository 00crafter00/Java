package FileExists;

public class file_exists {

	public static void main(String[] args) {
		java.io.File file = new java.io.File("C:/Scores.txt");
		System.out.println("Does it exist? " + file.exists());

	}

}
