package Abstraction.Employee;


import java.util.List;
class ReportContext{

}

public class EmployeeReport implements Report
{
    @Override
    public List<Object> run(ReportContext reportContext) {
        //Custom Logic
        System.out.println("Executing employee report");
        return null;
    }

        public static void main(String[] args) {

            ReportContext reportContext = new ReportContext();
            //Populate context

            Report eReport = new EmployeeReport();
            eReport.run(reportContext);

            Report sReport = new EmployeeReport();
            sReport.run(reportContext);
        }


}
