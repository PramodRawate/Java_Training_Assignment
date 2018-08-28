
public class wrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		float f=i;
		long l=i;
		
		f=12.34f;
		i=(int)f;
		System.out.println(f);
		System.out.println(i);
		
		l=40L;
		i=(int)l;		
		System.out.println(l);
		System.out.println(i);
		
		Integer intObj=new Integer(12);		//Boxing
		Integer intObj2=20;					//AutoBoxing
		
		
		int x=intObj.intValue();			//Unboxing
		int y=intObj2;						//AutoUnboxing
	
		Float floatObj1=new Float(34.54f);
		Float floatObj2=85.67f;
	
		float fx=floatObj1.floatValue();
		float fy=floatObj2.floatValue();
	}

}
