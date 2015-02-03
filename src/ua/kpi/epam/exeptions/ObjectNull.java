package ua.kpi.epam.exeptions;

public class ObjectNull {

	public static void main(String[] args) {
//		try{
//			Object obj = null;
//			obj.equals(new Object());
//		}catch(Exception e){
//			System.out.println(e.getClass());
//		}
		
		ClassWithExceptions c = new ClassWithExceptions();
		c.catchException(null);
		
//		Overflow o = new Overflow();
//		
//		o.memoryLack();
//		o.overflow();
	}

}
