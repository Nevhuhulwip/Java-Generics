public class GenericMethod {

    public static <T> void printArrayContent (T[] lst){
        for (T arr:lst){
            System.out.println(arr + "");
        }
    }

    public void print(){
        System.out.println("..........Integer array...............");
        Integer [] integer = {12, 324, 6, 7900};
        printArrayContent(integer);


        System.out.println("...............String array...........");
        String[] string = {"Pfano", "Pfan", "Pfa"};
        printArrayContent(string);


    }
}
