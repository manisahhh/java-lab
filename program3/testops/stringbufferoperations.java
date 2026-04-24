package textops;
public class StringBufferOperations {
private String str;
public StringBufferOperations(String str) {
this.str = str;
}
public void exploreStringBufferMethods(String appendStr) {
System.out.println("\n----- StringBuffer Methods -----");
StringBuffer sb = new StringBuffer(str);
System.out.println("Original StringBuffer: " + sb);
sb.append(appendStr);
System.out.println("After append: " + sb);
sb.insert(0, "Start-");
System.out.println("After insert: " + sb);
sb.replace(0, 5, "Begin");
System.out.println("After replace: " + sb);
sb.delete(0, 6);
System.out.println("After delete: " + sb);
sb.reverse();
System.out.println("After reverse: " + sb);
System.out.println("Capacity: " + sb.capacity());
System.out.println("Length: " + sb.length());
}
}
