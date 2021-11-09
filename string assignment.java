ASSIGNMENT OF STRING CLASS:

1.  find length of the String.

   package String_assign;
    public class String1 
     {
     public static void main(String[] args) 
      {
	String str1 = "Hello World";
	int size = str1.length();
	System.out.println(size);
      }
     }

2.  concatenating 2 Strings.

    package String_assign;
       public class String2 {
        public static void main(String[] args) {
		String str1 = "hello";
		String str2 = " how are you?";
		String str3 = str1.concat(str2);
		System.out.println("the concatenated string is: "+str3);
	}
      }

3.  performing few operations on String.

   package String_assign;

    public class String3 {
      public static void main(String[] args) {
		String str1 = "Java string pool refers to the collection "
				+ "of Strings which are stored in heap memory";
		System.out.println("1:To lower case: "+str1.toLowerCase());
		System.out.println("2:To upper case: "+str1.toUpperCase());
		
		String replaceString = str1.replace('a','$');	
		System.out.println("3:Replacing all the a's with $: "+replaceString);
		
		String str2 = "collection";	
		System.out.println("4:does string contains collection: "+str1.contains(str2));
		
		String str3 = "Java string pool refers to the collection "
				+ "of Strings which are stored in heap memory";
		System.out.println("5: "+str1.contains(str3));
		
		if(str1.equals(str3))
		{
			System.out.println("6:String1 is equal to String3");
		}
		else
		{
			System.out.println("6:String1 is not equal to String3");
		}
		
	       }
           }



ASSIGNMENT OF STRINGBUFFER CLASS:


1.  Appending by StringBuffer.

      package String_assign;

       public class StringBuffer1 {
        public static void main(String[] args) {
	  StringBuffer s = new StringBuffer("StringBuffer");
	  s.append(" ,is a peer class of string ");
	  s.append(" ,that provides such of , ");
	  s.append("the functionality of strings ");
	  System.out.println(s);
	  }
        }



2.  Inserting by StringBuffer.

   package String_assign;

    public class StringBuffer2 {
	 public static void main(String[] args) {
		  StringBuffer s = new StringBuffer("It is used to _ at the specified index position");
		  s.insert(14," build");
		  System.out.println(s);
	 }
      }


3.  Reversing by StringBuffer.

   package String_assign;

    public class StringBuffer3 {
	 public static void main(String[] args) {
		  StringBuffer s = new StringBuffer("This method returns the reversed object on which it was called");
		  System.out.println("++++++++++Orginal String+++++++");
		  System.out.println(s);
		  s.reverse();
		  System.out.println("++++++++++Reversed String+++++++");
		  System.out.println(s);
	 }
      }


ASSSIGNMENT ON STRINGBUILDER CLASS:


1.  Reversing by StringBuilder.


  package String_assign;

   public class StringBuilder1 {
	 public static void main(String[] args) {
		  StringBuilder sb = new StringBuilder("This method returns the reversed object on which it was called");
		  System.out.println("++++++++++Orginal String+++++++");
		  System.out.println(sb);
		  sb.reverse();
		  System.out.println("++++++++++Reversed String+++++++");
		  System.out.println(sb);
	 }
      }
