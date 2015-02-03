package ua.kpi.epam.exeptions;

public class ClassWithExceptions {
	public void throwException() throws Exception {
		throw new Exception();
	}
	public void catchException(String str) {
		try{
			if(str == null){
				throw new NullPointerException();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Exception catched");
		}
	}
}
