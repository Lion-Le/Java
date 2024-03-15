import java.util.Queue;
import java.util.LinkedList;

public class Example{
	public static void main(String argv[]){
		new Example().queueExample();
	}
	
	public void queueExample(){
		//定義資料型別
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Panda");
		queue.offer("Koala");
		System.out.println("Queue: " + printQueue(queue));
		
		//call size()
		System.out.println("Queue.size(): " + queue.size());
		
		//call offer(value)/add(value)
		queue.offer("Penguin");
		System.out.println("Queue.offer(\"Penguin\"): " + printQueue(queue));
		
		//call peek()/element()
		System.out.println("Queue.peek(): " + queue.peek());
		
		//call poll()/remove()
		System.out.println("Queue.poll(): " + queue.poll());
		System.out.println("Queue: " + printQueue(queue));
	}
	
	public String printQueue(Queue<String> queue){
		String result = "";
		for(String data : queue){
			if(!result.isEmpty()){
				result += ", ";
			}		
			
			result += data;
		}
		
		return result;
	}
}