public class Main {
    public static void main(String[] args) {
        PrintMsg printMsg = new PrintMsg();
        String resultString = printMsg.printAndReturn();
        resultString = resultString.replace("---", "");
        String finalResult =  "~~~" + resultString + "\"" + "~~~";
        System.out.println(finalResult);
    }
}