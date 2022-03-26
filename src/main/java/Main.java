public class Main {
    public static void main(String[] args) {
        System.out.println("Started !!!");
        System.out.println(addNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    public static int addNumbers(int i, int j){
        return i+j;
    }
}
