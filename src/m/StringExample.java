package m;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Let's \nplay with Strings!";
		System.out.println(s1);
		String s2 = "What if I'm quoting \"inside\" a string";
		System.out.println(s2);
		// The backslash in a string means a control character
		String s3 ="What is my\nlength?";
		System.out.println(s3.length());
		String phrase = "String objects store text.";
        int len = phrase.length();
        System.out.printf("There are %d characters in the phrase.\n", len);
        String part = phrase.substring(3,7);
        System.out.printf("The characters between positions 3 and 7 are %s.\n", part);
        String allCaps = phrase.toUpperCase();
        System.out.printf("In all caps, the phrase is %s.\n", allCaps);
        int foundAt = phrase.indexOf("obj"); 
        System.out.printf("The string obj was found at position %d.", foundAt);
        

		
	}

}
