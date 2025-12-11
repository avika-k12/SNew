public class bothVoidAndReturns {

    public static void printHello() { //method to print hello
        System.out.println("Hello");
    }

    public static void printName(String name){ //method to print a name, will take a String parenthesis called name
        System.out.print(name +"\n");
    }

    public static int addTwoNumbers( int a, int b){ //method to add two numbers, will take two int parenthesises
        int sum = a + b;
        return sum;
    }

    public static String concatStrings(String a, String b){ //method to concatenate strings, will take two strings
        String fullResponse = a + b;
        return fullResponse;
    }

    public static void main(String[] args){
        printHello();
        printName("Avika");
        System.out.println(addTwoNumbers(12, 24));
        System.out.print(concatStrings("Hello my name is ","Avika!"));
    }

}
