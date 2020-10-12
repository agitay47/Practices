package Inheritance.Practice7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TeslaObjects {
    public static void main(String[] args) {

        Model3 car1 = new Model3("Muhammed", "Model3", 2021, 40000, "White", "316 mil", true);

        car1.engine();
        car1.leaseCar();
        car1.oilChange();
        car1.start();
        car1.testDrive();


        System.out.println(car1);

        System.out.println("====================================================================================");

        ModelX car2 = new ModelX("Agit", "MODELX", 2020, 65000, "Black", 7, "351 mil");

        car2.charge();
        car2.leaseCar();
        car2.oilChange();
        car2.start();
        car2.testDrive();

        System.out.println(car2);

        System.out.println("====================================================================================");

        ModelY car3 = new ModelY("Murat", "MODEL Y", 2021, 75000, "Red");

        car3.engine();
        car3.start();
        car3.leaseCar();
        car3.testDrive();

        System.out.println(car3);


        System.out.println();
        System.out.println();
        System.out.println("              THANK YOU FOR YOUR BUSINESS                         ");
        System.out.println("                      ELON MUSK                                   ");

    }
}
