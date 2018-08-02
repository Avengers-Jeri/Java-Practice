public class Total {

    public static void main(String[] args){
        int j = 0;
        for (int i =9; i<=50; i++){
            j += i;
        }

        if (j>900) {
            System.out.println("900より大きい");
        }
        else{
            System.out.println("900以下");
        }
    }
}
