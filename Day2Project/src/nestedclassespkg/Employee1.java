package nestedclassespkg;

public class Employee1 {
	private int id;
	private String name;
	
	public class Address {
		private int doorno;
		private String city;
		
		public int getDoorno() {
			return doorno;
		}
		public void setDoorno(int doorno) {
			this.doorno = doorno;
		}
		public String getCity() {
			return city;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
	}
}
