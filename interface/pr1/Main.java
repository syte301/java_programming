public class Main {
    public static void main() {
        DefaultCash five = new DefaultCash(5);
        System.out.println("привет мир!");
        //System.out.println("usd = " + five.usd());
        System.out.println(String.format("mult %d", five.multiply(5)));
    }
}
