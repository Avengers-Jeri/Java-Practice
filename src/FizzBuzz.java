public class FizzBuzz {

    public static void main(String args[]){

//            int num1 = 1;
//            int num2 = 2;
//
//            int total;
//
//            total = num1 + num2;
//            System.out.println(total);


        for ( int i = 0; i < 100; ++i ) {

            if (i%15==0){
                System.out.println("FizzBuzz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }

        }

    }


}
