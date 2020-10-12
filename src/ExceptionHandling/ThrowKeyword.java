package ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("ABC");

        try {
            throw new Exception("Agit Exception"); //Unhandled exception
        }catch(Exception e){
            e.printStackTrace();
        }



        System.out.println("PQR");

        String Exec_Flag = " ";
        if(Exec_Flag.equals(" ")){

            try {
                throw new Exception("Exec flag is Blank exception");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        System.out.println("test");



    }
}
