/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Outer {
    String msg="Hello world";
    void show(){
        System.out.println("In outer class");
    }
    class Inner{
        void disp(){
            System.out.println(msg);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Outer.Inner ob2=ob1.new Inner();
		ob2.disp();
	}
}
