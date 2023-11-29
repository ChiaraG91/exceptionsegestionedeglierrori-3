public class Main {

    public static void main(String[] args){

        System.out.println(division(5));
    }


    public static int division(int num){
        int result = 0;
        try{
            result = num / 0;
        } catch (ArithmeticException e){
            System.out.println("Errore:" + e);
        }
            return result;
    }
}
