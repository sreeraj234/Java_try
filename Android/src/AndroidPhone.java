
public class AndroidPhone {
	int phonePrice,screenSize;
	double thickness;
	boolean	isAudioJackPresent;
	String phoneName,phoneBrand;
	public void myAwesomePhone() {
		System.out.println("Price: "+phonePrice);
		System.out.println("Screen size: "+screenSize);
		System.out.println("Thickness: "+thickness);
		System.out.println("Audio jack present: "+isAudioJackPresent);
		System.out.println("Phone name and brand: "+phoneName+" "+phoneBrand);
	}
	public void buildPhone(int a,int b,double c,boolean d,String e,String f) {
		phonePrice = a;
		screenSize = b;
		thickness = c;
		isAudioJackPresent = d;
		phoneName = e;
		phoneBrand = f;
	}
}
