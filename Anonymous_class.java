/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface A{
    void add(int x,int y);
}
public class Main
{
	public static void main(String[] args) {
		A ob1=new A(){
		    @Override
		    public void add(int x, int y){
		        System.out.println(x+y);
		    }
		};
		ob1.add(100,200);
	}
}
