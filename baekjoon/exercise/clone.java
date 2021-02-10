
public class clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		xx temp=new xx(new String("4"));
		xx deeptemp=(xx)temp.clone();
		System.out.println(temp.i);
		System.out.println(deeptemp.i);
		System.out.println(temp.i==deeptemp.i);
		deeptemp.i=new String("4");
		System.out.println(temp.i);
		System.out.println(deeptemp.i);
		System.out.println(temp.i==deeptemp.i);
		deeptemp.i=new String("4");
		System.out.println(temp.i);
		System.out.println(deeptemp.i);
		System.out.println(temp.i==deeptemp.i);
		Integer q=new Integer(3);
		int w=3;
		System.out.println(w==q);
		
		String name = "Amazing";
		ImmutableString immutableString = new ImmutableString(name);
		name=name.concat("Day");
		System.out.println(immutableString);
		System.out.println(name);
	}

}
class xx implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String i;
	public xx(String i) {
		this.i=i;
	}
}
class ImmutableString {
    
    private final String name;
     
    ImmutableString(String name){
        this.name = name;
    }
     
    @Override
    public String toString(){
        return this.name;
    }
 
}