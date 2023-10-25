import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float i, j, n, m, a, b;
        float s = 0;
        float c = 2;

        boolean flag;
        do {
            flag = false;
            System.out.print("a = ");
            a = validate(-Float.MAX_VALUE);

            System.out.print("n = ");
            n = validate(a);

            if (a <= c && n >= c && (a - (int) a == c - (int) c)) {
                System.out.println("will divide by zero, change the input values");
                flag = true;
            }
        } while (flag);

        System.out.print("b = ");
        b = validate(-Float.MAX_VALUE);

        System.out.print("m = ");
        m = validate(b);

        System.out.println("\na = " + a + "\nn = " + n + "\nb = " + b + "\nm = " + m);

        for (i = a; i <= n; i++) {
            for (j = b; j <= m; j++) {
                s += (i * j) / (i - c);
            }
        }
        System.out.println("\nS = " + s);
    }

    public static float validate(float min) {
        String reenterValue = "Enter your value again: ";
        Scanner in = new Scanner(System.in);
        boolean flag;
        float value = 0;
        do {
            flag = false;
            try {
                value = in.nextFloat();
                if (value <= min) {
                    System.out.println("The value must be greater than the initial value");
                    System.out.print(reenterValue);
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println("Type of variable must be float!");
                System.out.print(reenterValue);
                in.next();
                flag = true;
            }
        } while (flag);
        return value;
    }
}
