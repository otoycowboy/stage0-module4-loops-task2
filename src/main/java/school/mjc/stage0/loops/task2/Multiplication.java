package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int currentNumber = 0;
        while (currentNumber <= Math.abs(multiplyByAndToInclusive)) {
            int result = currentNumber * multiplyByAndToInclusive;
            System.out.println(result);
            currentNumber++;
        }
    }
}
