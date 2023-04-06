//1) Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class dz1 {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            lin.add(getRandomNumber());
        }
        System.out.println(lin);

        for (int i = 0; i < 5; i++) {
            System.out.print(lin.getLast() + ", ");
            lin.removeLast();

        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 10);
        int num = (int) x;
        return num;
    }
}

