import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задачи 1 и 2");
        int [] first = new int [3];
        first[0] = 1;
        first[1]= 2;
        first[2] = 3;
        double [] second = {1.57, 7.654, 9.986};
        int [] third = {8, 3, 9, 6, 0};
        int i = 0;
        do {
            System.out.print(first[i] + ", ");
            i++;
        }
        while (i < first.length);
        for (; i < second.length; i++) {
            System.out.print(second[i] + ", ");

        }




    }

    public static void task2 () {


    }
}