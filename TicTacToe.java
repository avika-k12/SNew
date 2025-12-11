public class TwoDimensionArrays {

    String[][] stringArray1 = new String[3][3];
    String[][] stringArray2 = new String[3][3];
    String[][] stringArray3 = new String[3][3];

    public static void main(String[] args){
        String[][] stringArray1 = {{"-","-","-"}, {"-","-","-"}};
        String[][] stringArray2 = {{"-","-","-"}, {"-","-","-"}};
        String[][] stringArray3 = {{"-","-","-"}, {"-","-","-"}};

        for (String[] str : stringArray1) {
            for (String element : str){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        for (String[] str : stringArray2) {
            for (String element : str){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        for (String[] str : stringArray3) {
            for (String element : str){
                System.out.print(element + " ");
            }
        }
    }
}
