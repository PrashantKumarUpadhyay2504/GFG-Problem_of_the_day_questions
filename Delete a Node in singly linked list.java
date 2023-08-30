class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	if(x == 1) return head.next;
	    int count = 1;
	    Node curr = head;
	    while(count < x-1 && curr.next != null){
	        curr = curr.next;
	        count++;
	    }
	    curr.next = curr.next.next;
	    return head;
    }
}
