class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
          if(head == null || head.next == null)
        {
            return head;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        while(head != null && head.next != null)
        {
            Node first = head;
            Node second = head.next;
            
            // Swape the nodes
            
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            // Move the pointers
            
            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
}
