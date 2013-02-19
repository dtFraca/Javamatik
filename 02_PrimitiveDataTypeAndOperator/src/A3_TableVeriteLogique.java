/**
 * Table de Verite ET / OU
 *
 * 2013-02-18 - tri
 */
public class A3_TableVeriteLogique {
    public static void main(String[] args) {
        System.out.println();
        System.out.printf( "Table Verite Conditionel ET (&&)\n%s\t: %b\n%s\t: %b\n%s\t: %b\n%s\t: %b\n\n",
                "false && false", (false && false),
                "false && true", (false && true),
                "true  && false", (true && false),
                "true  && true", (true && true)
        );

        System.out.printf( "Table Verite Conditionel OU (||)\n%s\t: %b\n%s\t: %b\n%s\t: %b\n%s\t: %b\n\n",
                "false || false", (false || false),
                "false || true", (false || true),
                "true  || false", (true || false),
                "true  || true", (true || true)
        );
    }
}
