public class Challenge_Two {

    void challenge(int N) {
        if (N % 2 == 0 && N <= 5) {
            System.out.println("Not Weird");
        }else if (N % 2 != 0){
            System.out.println("Weird");
        } else if (N <= 20) {
            System.out.println("Weird");

        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");

        }
    }
}
