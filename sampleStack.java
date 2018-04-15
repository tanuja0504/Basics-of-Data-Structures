package basicDataStructure;

class Stack1{
	int max=10;
	int top=-1;
	int a[] = new int[max];
	
	public int pop(){
		System.out.println("Top"+top);
		return a[top--];
		
	}
	
	public void push(int x){
		a[++top] = x;
		//System.out.println("Top"+top);
	}
	public int peek(){
		System.out.println("Top"+top);
		return a[top];
		
	}
	
	public void printArray(){
		for(int i=0;i<top;i++){
			System.out.println(a[i]+" "+i);
		}
	}
	
}

public class sampleStack {

	public static void main(String[] args) {
		Stack1 s = new Stack1();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(7);
		s.pop();
		//System.out.println(s.peek());
		
		s.printArray();
	}

}
