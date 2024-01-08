

/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
     Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        
        while(curr!=null){
       Node agla = curr.next;
        curr.next = prev;
        prev = curr;
        curr = agla;
    }
    return prev;
    }
    Node mergeResult(Node t1, Node t2)
    {
        Node head = new Node(-1);
        Node t = head;
// Your code here
  while(t1 != null && t2!= null){
    if(t1.data < t2.data){
       t.next = t1;
       //t = t1;
        t1 = t1.next;
        
    }
    else{
        t.next = t2;
       // t = t2;
        t2 = t2.next;
    }
    t = t.next;
  }
    if(t1==null){
    t.next = t2;
    }
    else if(t2 == null) {
    t.next = t1;
}
 
return reverse(head.next);
// Your code here
}
}
