import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static double rubles = 0;
    static double euros = 0;
    static double dollars = 0;

    public static void main(String[] args) throws IOException {
        Conventer conventer = new Conventer();
        conventer.start();
        System.out.println("Привет! Введи количество рублей");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        rubles = Double.parseDouble(bufferedReader.readLine());
    }

    static class Conventer extends Thread {
        @Override
        public void run() {
            while (rubles < 1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(rubles + " В евро: " + rubles/100);
            System.out.println(rubles + " В долларах: " + rubles/80);
        }
    }
}