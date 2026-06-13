public class reverseLinkedList{
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     private Node Head;
    private Node Tail;
      private int size;


public void reverse(){
        if (Head==null||Head.next == null) {
            return;
        }
        Node prev = Head;
        Node curr = Head.next;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            
          
        }
          Head.next = null;
            Head = prev;
    }
      public void print(){
        Node temp = Head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
      public static void main(String[]args){
       reverseLinkedList   n = new reverseLinkedList();
          n.Head = new Node(1);
    n.Head.next = new Node(2);
    n.Head.next.next = new Node(3);
    n.print();
        n.reverse();
     n.print();
      }


}
