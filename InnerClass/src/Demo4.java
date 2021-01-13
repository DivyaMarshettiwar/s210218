interface calcArea
{
	int area();
}

public class Demo4 {

	public static void main(String[] args) {
		calcArea a= new calcArea() {
		@Override
			public int area() {
				return 0;
				
			}
		};
		a.area();		
	}
}
