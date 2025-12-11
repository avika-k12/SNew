public class Array {

    public int[] intArray = new int[5]; //Declaring integer array with length of 5
    public String[] stringArray = new String[4]; //Declaring string array with length of 4

    public char[] myCharArray = new char[6];
    public boolean[] myBooleanArray = new boolean[6];

    public static void main(String[] args){
        //Example of integer array
        int[] intArray = {1, 2, 3, 4, 5}; //Defining array declared earlier
        System.out.println("Integer Array: ");
        for (int i : intArray) {
            System.out.print(i + " "); //Printing each element of the integer array
        }
        System.out.println();

        //Example of String array
        String[] stringArray = {"Hello", "World", "Java" , "Arrays"}; //Defining array declared earlier
        System.out.println("String Array:");
        for (String str : stringArray){
            System.out.print(str + " "); //Printing each element of the string array
        }

        System.out.println();
        System.out.println();

        //Own arrays
        char[] myCharArray = {'A', 'A', 'C', 'E', 'O', 'S'};
        System.out.println("Initials of class:");
        for (char chr : myCharArray){
            System.out.print(chr + " ");
        }

        System.out.println();

        boolean[] myBooleanArray = {true, true, true, false, false, false};
        System.out.println("Are they sitting on the right?");
        for (boolean bool : myBooleanArray){
            System.out.print(bool + " ");
        }
    }

}
