package basicDataStructure;



public class sampleSingleLinkedList {

	static class Node{
		int d;
		Node next;
		Node prev;
		public Node(int d) {
			this.d = d;
			this.next = null;
			this.prev=null;
		}
	}
	public static void main(String[] args) {
		
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		one.next=two;
		two.next=three;
		two.prev=one;
		three.next = four;
		three.prev=two;
		
		Node n = one;
		while(n !=null){
			System.out.println(n.d);

			if(n.next==null){
				
				n.next = one;
			}
			n = n.next;			
		}
		
		
	}

}
