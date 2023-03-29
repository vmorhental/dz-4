public class PrintMsg {
    public static void main(String[] args) {
        String result = printAndReturn();
    }
    public static String printAndReturn(){
        String a = "---";
        int b = 10;
        String result = a + b + a;
        System.out.println(result);
        return result;
    }
}
