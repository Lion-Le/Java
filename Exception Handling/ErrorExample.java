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
		throw new Exception("ab��k�o�Ϳ��~");
	}
	
	public void ba() throws Exception{
		// ...
	}
	
	public void bb() throws Exception{
		// ...
	}
}