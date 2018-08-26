
public class LengthOfLinkedList {
	
	Node head;
	
	 class Node{
		int value;
		Node next;
		Node (int d)
	     {
	         value = d;
	         next = null;
	     }
			
	}
	 
	 public int length(){
		 int count=1;
		 
		 Node node=head;
		 while(node.next!=null){
			
			 node=node.next;
			 count++;
			
		 }
		 
		 return count;
		 
	 }
	 //Add data from the front of the linked list
	 
	//This method adds linked list from the top
	 public void addData(int data){
		
		// for(int i=0;i<count;i++){
			 Node new_node = new Node(data);   //Createa a node before head 
			 new_node.next=head;                //New code adress will point to the 
			 head=new_node;                      //Head will be the  current node added
			 
		// }
		 
	 }
	 public void addDataFromposition(int  n,int data){
			
			     int count=1;
			     Node current=head;
			     
			     Node new_node = new Node(data);
			     
			     while(count <n-1){
			    	 
			    	 current=current.next;
			    	 count++;
			    	 
			     }
			     //Node temp=current.next;
			     //new_node.next=temp;
			     //current.next=new_node;
			   
			     
			     Node temp=current.next;
			     current.next=new_node;
			     new_node.next=temp;
			 
		 }
	 
	 public int nthtolastnode(){
			
		 Node node = head;
         int count=1;
	
		 while(node.next!=null){
			
			 node=node.next;
			 count++;
			
		 }
		 int position=1;
		 Node current = head;
		while(position <count-2){
			
			current=current.next;
			position++;
			
		}
		return (current.value);
		 
	 
 }
	 
	 public void printData(){
			Node current = head;
			//System.out.print(current.value + " ");
			while(current!=null){
				
				System.out.print(current.value + "->> ");
				current=current.next;
				
				
			}
		 }
	 
	
	public static void main(String[] args) {
		
		LengthOfLinkedList len= new LengthOfLinkedList();
		len.addData(1);
		len.addData(10);
		len.addData(88);
		len.addData(1000);
		len.addData(100000);
		len.addData(100);
		
		System.out.println("The length of linked list is" + "....." +len.length());
		len.printData();
		System.out.println("After the data is added");
		len.addDataFromposition(2,188);
		System.out.println("The length of linked list after addition of one node is" + "......"+len.length());
		//len.length();
		
		len.printData();//Add data to the fourth node
		
		System.out.println("nth (here 2nd)to last elemnt in the linked list" + len.nthtolastnode());
		
		
		

	}

}
