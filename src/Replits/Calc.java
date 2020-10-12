package Replits;
/* x, y and results are all private attributes of int type.

3 Instance variables:
  1) names: x, y, result
      type: int
      Visibility/Access modifier: private

Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result */

public class Calc {
      private int x;
      private int y;
      private int result;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void plus(int x, int y){
        result = x + y ;
    }
    public void minus(int x, int y){
        result = x - y ;
    }

    public int getResult() {
        return result;
    }
}
