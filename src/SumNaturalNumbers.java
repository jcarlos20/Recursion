public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(recursiveSummation(7));
    }

    public static int recursiveSummation(int inputNumber){
        if(inputNumber <= 1){
            return inputNumber;
        }
        return inputNumber + recursiveSummation(inputNumber-1);
    }
}
