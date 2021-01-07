/*
 * Function overriding
 * same function name in two different classes where these classes have
 * parent child relationship among them
 * 
 * the child method is the overridden method.
 * this is represented by an annotation @overrides in the child
 * 
 * here the parent and the child should maintain same return type and same 
 * access specifier
 */
class Base 
{
	protected void display()
	{
		
	}
}
class Derived extends Base
{
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
public class Demo3 {

}
