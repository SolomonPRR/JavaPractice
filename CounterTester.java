public class CounterTester {
    public static void main(String args[]) {
        Counter counter1 = new Counter();

        for (int i = 0; i < 4; i++){
        counter1.click();
        }

        System.out.println(counter1.getClicks());

        for (int i = 0; i < 6; i++){
        counter1.click();
        }

        System.out.println(counter1.getClicks());

        counter1.reset();

        System.out.println(counter1.getClicks());
    }
}
