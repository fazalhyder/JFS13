final class customer{
	private final String name;
	public customer (String name){
		this.name=name;
		System.out.println("the name of customer is "+name);
	}
}
public class immut{
	public static void main (String [] args){
		customer c = new customer("fazal");
		System.out.println("the address of customer class is "+c);
		customer c1=c.modify("fazal");
		System.out.println("the address of customer class is "+c1);
		System.out.println(c1.equals(c));
		
}}