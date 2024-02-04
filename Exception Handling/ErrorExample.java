public class ErrorExample{
	public ErrorExample() throws Exception{
		a();
		b();
	}
	
	public void a() throws Exception{
		aa();
		ab();
	}
	
	public void b() throws Exception{
		ba();
		bb();
	}
	
	public void aa() throws Exception{
		// ...
	}
	
	public void ab() throws Exception{
		throw new Exception("ab方法發生錯誤");
	}
	
	public void ba() throws Exception{
		// ...
	}
	
	public void bb() throws Exception{
		// ...
	}
}