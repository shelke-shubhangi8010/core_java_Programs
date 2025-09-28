public class variableSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping: a= " + a + " ,b=" + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping: a= " + a + " ,b=" + b);
    }
}
