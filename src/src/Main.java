public class Main {
    public static void main(String[] args) {
            int balance = 100;
            int payment = 1100;
            double bonus = payment * 0.01;
            if (payment >= 1000) {
                bonus = payment * 0.01;
            } else {
                bonus = 0;
            }
            double total = balance + payment + bonus;
            System.out.println(total);
        }
}
