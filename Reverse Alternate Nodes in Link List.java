class Solution
{
    public static void rearrange(Node odd){
        if(odd.next == null) return ;
        Node temp=odd,last=null,last1=null,head = null;
        
        
        while(temp!=null && temp.next!=null){
            head=temp.next;
            temp.next=temp.next.next;
            head.next=last;
            last=head;
            last1=temp;
            temp = temp.next;
        }
        if(last1.next==null)
        last1.next=head;
        else
        last1.next.next=head;
        
        
    }
}
