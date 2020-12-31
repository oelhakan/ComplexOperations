public class Test {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        one.add(1,1);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        System.out.println("----------------------------");
        System.out.println("number real = " + number.getReal());
        System.out.println("number imaginary = " + number.getImaginary());
        number.subtract(one);
        System.out.println("number real = " + number.getReal());
        System.out.println("number imaginary = " + number.getImaginary());
    }
}
