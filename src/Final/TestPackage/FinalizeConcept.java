package Final.TestPackage;


public class FinalizeConcept {
    public void finalize(){
        System.out.println("finalize method");}//cleaning up processing before garbage collection process

        public static void main(String[] args) {
        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1 = null;
        f2 = null ;

        System.gc();

    }


}
