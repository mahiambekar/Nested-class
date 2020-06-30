/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Outer {
    void show(){
        System.out.println("In outer class");
    }
    class Inner{
        void disp(){
            System.out.println("In inner class");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Outer ob1=new Outer();
		ob1.show();
	}
}
