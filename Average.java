public class Average {
    public static void main(String[] args) {
        int number[] = { 5, 10, 15 };
        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        double average = (double) sum / number.length;
        System.out.println("Average =" + average);
    }
}
