package Static;

public class Student {
    String name;
    String major;
    double gpa;

   static String schoolName="Cybertek";


    public void studentInfo(String name,String major,double gpa,String schoolName){
        this.name=name;
        this.major= major;
        this.gpa = gpa;


    }

    public boolean isOnHonorRoll(){
        if(this.gpa>=3.25){
            return true;
        }
        return false;
    }

    public String toString(){
        return "SchoolName: "+schoolName+", Student name: "+name+", Major: "+major+", Gpa: "+gpa+", Honor Students: "+isOnHonorRoll();
    }


}
