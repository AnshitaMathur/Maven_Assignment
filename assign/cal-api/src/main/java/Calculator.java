public class Calculator {
    /**
     * @param a
     * @param b
     */
    final void add(int a, final int b) {
        int result;
        result = a + b;
        System.out.println("the addition is\t" + result);
    }


    /**
     * @param a
     * @param b
     */
    final void sub(int a, final int b) {
        int result;
        result = a - b;
        System.out.println("the subtraction is\t" + result);
    }


    /**
     * @param a
     * @param b
     */
    final void mul(int a, final int b) {
        int result;
        result = a * b;
        System.out.println("the multiplication is\t" + result);
    }

    final void div(double a, final double b) {
        double result;
        result = a / b;
        System.out.println("the division is"  + result);
    }


}