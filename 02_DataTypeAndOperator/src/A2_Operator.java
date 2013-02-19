/**
 * Review of Java operators
 *
 * 2013-02-18 - tri
 */
public class A2_Operator {
    public static void main(String[] args) {
        int n1 = 5, n2 = 22;
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        System.out.printf("%d / %d = %d\n", n2, n1, n2 / n1);

        System.out.println();
        System.out.printf("n1   = %d\n", n1);
        System.out.printf("++n1 = %d\n", ++n1); // Pre-Increment
        System.out.printf("n1++ = %d\n", n1++); // Post-Increment
        System.out.printf("n1   = %d\n", n1);
        System.out.printf("--n1 = %d\n", --n1); // Pre-Decrement
        System.out.printf("n1-- = %d\n", n1--); // Post-Decrement
        System.out.printf("n1   = %d\n", n1);


        int n3 = 10, n4 = 2;
        System.out.println();
        System.out.printf("(n3 = %d)\tn3 += %d = %d\t(n3 = n3 + %d)\n", n3, n4, n3 += n4, n4);

        n3 = 10;
        System.out.printf("(n3 = %d)\tn3 -= %d = %d\t\t(n3 = n3 - %d)\n", n3, n4, n3 -= n4, n4);

        n3 = 10;
        System.out.printf("(n3 = %d)\tn3 *= %d = %d\t(n3 = n3 * %d)\n", n3, n4, n3 *= n4, n4);

        n3 = 10;
        System.out.printf("(n3 = %d)\tn3 /= %d = %d\t\t(n3 = n3 / %d)\n", n3, n4, n3 /= n4, n4);
    }
}
