//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Random;

public class dz2 {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            enqueue(lin, getRandomNumber());
            // int val = rd.nextInt(0, 100);
        }
        System.out.println(lin);

        System.out.println(dequeue(lin));
        System.out.println(lin);

        System.out.println(first(lin));
        System.out.println(lin);
    }

    public static void enqueue(LinkedList<Integer> lin, int num) {
        lin.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> lin) {
        int num = lin.get(0);
        lin.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> lin) {
        int num = lin.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;

    }
}

