public class Example{
	public static void main(String argv[]){
		try{
			new ErrorExample();
		}catch(Exception e){
			//最外層main方法統一處理Exception
			e.printStackTrace();
			System.out.println("程式發生錯誤");
		}
	}
}