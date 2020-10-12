package ThisSuperKeywords;

public class ConstructorConcept {

    public ConstructorConcept(){ //default constructor

        System.out.println("Default constructor");
    }

    public ConstructorConcept(int i){
        System.out.println("Single parameter constructor");
        System.out.println("the value of i is: "+i);
    }
    public ConstructorConcept(int i,int j){
        System.out.println("two parameter constructor");
        System.out.println("the value of i is: "+i);
        System.out.println("the value of j is: "+j);
    }


    public static void main(String[] args) {

        ConstructorConcept obj = new ConstructorConcept();
        System.out.println();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        System.out.println();
        ConstructorConcept obj2 = new ConstructorConcept(10,20);

    }
}
