public class perhitungan2 {

    public static void main(String[] args) {
        System.out.println("+++++++++++++");

        int a =1;
        for(int p = 1; p < 5; p++ ){
                for(int j = 1; j < 5; j+=1){
                    System.out.print(a +" ");
                    a+= 1;
                }
                System.out.println();
            }
            
        System.out.println("+++++++++++++++");
                a = 24; 
        for(int p = 0; p < 5; p++ ){
            for(int j = 0; j < 5; j+=1){
                System.out.print(a +" ");
                a-= 1;
            }
            System.out.println();
        }
    }
}
    

