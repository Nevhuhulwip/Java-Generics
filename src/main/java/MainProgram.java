public class MainProgram {
    public static void main(String[] args) {
        GenericMethod GM = new GenericMethod();
        GM.print();

        GenericClass<Integer> gen = new GenericClass<>();
        gen.setT(1000);
        gen.getT();

        GenericClass<String> Gen2 = new GenericClass<>();
        Gen2.setT("Test");
        Gen2.getT();

        System.out.println(gen.getT() + "\n" + Gen2.getT());
    }
}
