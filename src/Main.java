//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
//task 2
        for (int g = 10; g >= 1; g--) {
            System.out.println("g = " + g);
        }
//task 3
        for (int f = 0; f <= 17; f= f + 2) {
            System.out.println("f = " + f);
        }
//task 4
        for (int e = 10; e >= -10; e--) {
            System.out.println("e = " + e);
        }
//task 5
        for (int y = 1904; y <= 2096; y= y + 4) {
            System.out.println(y + " год является високосным");
        }
//task 6
        for (int s = 7; s <= 98; s= s + 7) {
            System.out.println("s = " + s);
        }
//task 7
        for (int t = 1; t <= 512; t= t * 2 ) {
            System.out.println("t = " + t);
        }
//task 8
    int accumulation = 29000;
    int total = 0;
    for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей" );
        }
//task 9
    int contribution = 29000;
    float rate = 0.12f;
    float sum = 0f;
    for (int m = 1; m <= 12; m++) {
        sum = sum + sum * rate + contribution;
        System.out.println("Месяц " + m + ", сумма накоплений равна " + sum +" рублей" );
        }
//task 10
    int w = 0;
    for (int r = 1; r <= 10; r ++ ) {
        w =  r * 2;
        System.out.println("2 * " + r + " = " + w);
        }
    }
}