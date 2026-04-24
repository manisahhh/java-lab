package textops;
public class StringOperations {
private String str1;
private String str2;
public StringOperations(String str1, String str2) {
this.str1 = str1;
this.str2 = str2;
}
public void exploreStringMethods() {
System.out.println("----- String Methods -----");
System.out.println("Length of str1: " + str1.length());System.out.println("Uppercase str1: " + str1.toUpperCase());
System.out.println("Lowercase str1: " + str1.toLowerCase());
System.out.println("Concatenation: " + str1.concat(str2));
System.out.println("Equals: " + str1.equals(str2));
System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
System.out.println("Contains str2 in str1: " + str1.contains(str2));
System.out.println("Substring of str1 (0,3): " +
(str1.length() >= 3 ? str1.substring(0, 3) : "Too short"));
System.out.println("Replace 'a' with 'x' in str1: " + str1.replace('a', 'x'));
System.out.println("Index of str2 in str1: " + str1.indexOf(str2));
System.out.println("Trim str1: '" + str1.trim() + "'");
}

}