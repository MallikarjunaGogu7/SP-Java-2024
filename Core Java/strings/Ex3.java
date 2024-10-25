package strings;

public class Ex3 {

	public static void main(String[] args) {
		
		String name = "Canada";
		String fname = "   peter";
		
		System.out.println(name.length());  // length() method used to find the length of the String
		System.out.println(name.charAt(0)); // charAt() method used to find the character at given index of the String
		System.out.println(name.charAt(3)); // 
		System.out.println(name.codePointAt(1)); // codePointAt() method is used to find the code Value at the given index
		System.out.println(name.codePointBefore(2)); // codePointBefore() method is used to find the code Value at just before the given index
		System.out.println(name.compareTo("mexico")); // compareTo() method compares the difference between characters 
		System.out.println(name.compareTo("Canada"));
		System.out.println(name.compareTo("canada"));
		System.out.println(name.concat("ian"));         // concat() method concatenates given value to the String at end
		System.out.println(name.contains("anada"));     // contains() method checks the given word has present or not and gives boolean expression true or false
		System.out.println(name.equalsIgnoreCase("cAnADa")); // checks equal or not and ignores the case type and gives boolean expression
		System.out.println(name.toUpperCase());   // toUpperCase() method converts String to Upper case
		System.out.println(name.toLowerCase());   // toLowerCase() method converts String to Lower case
		System.out.println(fname.trim());         // trim() method removes the whitespace at start and end position in string
		System.out.println(name.indexOf("a"));     // indexOf() method  gives the index value of entered Character
		System.out.println(name.lastIndexOf("a")); // lastIndexOf() method gives the index value of entered Character which is located at last of string
		System.out.println(name.hashCode());       // hashCode() method gives the hashCode value of string
		System.out.println(name.endsWith("a"));    // endsWith() method checks the string ending with entered value or not
		System.out.println(name.isEmpty());        // idEmpty() method checks the string is empty or not
		System.out.println(name.replace("da", "cola")); // replace() method used for replace the Characters with new value;
		
	}
}
