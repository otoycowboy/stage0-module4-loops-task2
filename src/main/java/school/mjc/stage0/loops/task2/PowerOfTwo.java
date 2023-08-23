package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0)
            System.out.println("too much power");
        else {
            int currentPower = 0;
            while (currentPower <= power) {
                int result = (int) Math.pow(2, currentPower);
                System.out.println(result);
                currentPower++;
            }
        }
    }
}
