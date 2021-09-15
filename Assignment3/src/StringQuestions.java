
public class StringQuestions {
	public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1.length());
        String str2 = "Hello,";
        String str3 = "How are you?";
        System.out.println(str2.concat(str3));

        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('a','$'));
        System.out.println(str.contains("collection"));
        System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println(str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
        
     
     	StringBuffer strbuff1= new StringBuffer("String Buffer");
     	strbuff1.append(" is a peer class of String");
     	strbuff1.append(" that provides much of");
     	strbuff1.append(" the functionality of Strings");
     	System.out.println(strbuff1);
     		
     	StringBuffer strbuff2 = new StringBuffer("It is used to _ at the specified index posiion");
     	strbuff2.insert(14, "insert text");
     	
     	System.out.println(strbuff2);
     		
    
     	StringBuffer strbuff3 = new StringBuffer("This method returns the reversed object on which it is called");
     	System.out.println(strbuff3.reverse());
     	
     	StringBuilder strb1 = new StringBuilder("String Builder");
     	strb1.append(" is a peer class of String");
     	strb1.append(" that provides much of");
     	strb1.append(" the functionality of Strings");
		System.out.println(strb1);
		
		
		StringBuilder strb2 = new StringBuilder("It is used to _ at the specified index posiion");
		strb2.replace(14,15, "insert text");
		System.out.println(strb2);
		
		
		StringBuffer strb3 = new StringBuffer("This method returns the reversed object on which it is called");
		
		System.out.println(strb3.reverse());
    }
}
