/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Outer {
    static class Inner{
        void show(){
            System.out.println("In static nested class");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Outer.Inner ob1= new Outer.Inner();
		ob1.show();
	}
}
