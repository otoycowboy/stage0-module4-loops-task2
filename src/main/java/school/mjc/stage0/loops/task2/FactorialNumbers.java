package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 1;
        int result = 1;
        System.out.println(result);
        while (currentNumber <= printToInclusive) {
            result *= currentNumber;
            System.out.println(result);
            currentNumber++;
        }
    }
}
