package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = reduce(n);
        System.out.println(steps);}
        public static int reduce(int n){
        int count = 0;
        while(n > 0){
            if (n % 2 == 0){
                n = n / 2;}
            else{
                n = n - 1;
            }
    count++;
            }
        return count;
    }
}
