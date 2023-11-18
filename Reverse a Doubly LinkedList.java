public static Node reverseDLL(Node  head)
{
    Node p = head;
    Node temp = null;
    while(p!=null){
        
        temp = p.next;
        
        //just swap the pointer
        Node left = p.prev;
        p.prev = p.next;
        p.next = left;
        if(temp == null){
            break;
        }
        p = temp;
    }
    return p;
}
