package basicDataStructure;

class Queue1{
	int arr[] = new int[10];
	int front,rear,size;
	
	public Queue1() {
		this.front = 0;
		this.size = 0;
	}

	public void add(int x){
		rear++;
		size++;
		arr[rear] = x;
	}
	
	public int delete(){
		int x = arr[front];
		front++;
		size--;
		return x;
	}
	
	public void printQ(){
		for(int i=front;i<rear;i++){
			System.out.println("Print "+arr[i]);
		}
		System.out.println("Size "+size);
	}
	
	public void front(){
		System.out.println(arr[front]);
	}
	
	public void rear(){
		System.out.println(arr[rear]);
	}
}

public class sampleQueue {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.delete();
		q.printQ();

	}

}
