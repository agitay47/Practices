package Abstraction.OOP;

public abstract class Shape {

    Shape(){
        System.out.println("Shape class constructor");
    }


      int color;

      abstract void drawing();//abstract method

      public void fill(){
          System.out.println("Shape---fill");
      } //non abstract method

      //can not create the object of interface

    }

