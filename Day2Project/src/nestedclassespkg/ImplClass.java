package nestedclassespkg;

public class ImplClass { //implements Interface1{

//	@Override
//	public void myMethod() {
//		// TODO Auto-generated method stub
//		
//	}
//	public Interface1 obj = new Interface1() {
//		
//		@Override
//		public void myMethod() {
//			// TODO Auto-generated method stub
//			
//		}
//	};

	public void classMethod() {
		Interface1 obj = new Interface1() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		obj.myMethod();
	}
}
