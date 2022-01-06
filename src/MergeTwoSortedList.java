public class MergeTwoSortedList {
    static class Node{
        public int val;
        public Node next;
        
        public Node(int val){
            this.val = val;
        }

        public void setNext(Node node){
            this.next = node;
        }

        public Node getNext(){
            return next;
        }
    }

    public Node insertNode(Node head, int data){
        if(head == null){
            head = new Node(data);
            return head;
        }
        if(head.val < data){
            head = insertNode(head, data);
        }else{
            head = insertNode(head, data);
        }
        return head;
    }

    public static void main(String[] args) {
        Node n2_1 = new Node(1);
        Node n2_2 = new Node(5);
        Node n2_3 = new Node(13);
        Node n2_4 = new Node(14);
        Node n2_5 = new Node(550);

        Node n1_1 = new Node(2);
        Node n1_2 = new Node(12);
        Node n1_3 = new Node(130);
        Node n1_4 = new Node(200);
        Node n1_5 = new Node(350);

        n2_1.setNext(n2_2);
        n2_2.setNext(n2_3);
        n2_3.setNext(n2_4);
        n2_4.setNext(n2_5);

        n1_1.setNext(n1_2);
        n1_2.setNext(n1_3);
        n1_3.setNext(n1_4);
        n2_4.setNext(n1_5);

        Node sortedMerge = mergeList(n1_1, n2_1);
        printLinkedList(sortedMerge);
        System.out.println("Done");
    }

    public static Node mergeList(Node n1, Node n2){
        if(n1 == null){
            return n2;
        }

        if(n2 == null){
            return n1;
        }

        if(n1.val <= n2.val){
            n1.next = mergeList(n1.next, n2);
            return n1; 
        }else{
            n2.next = mergeList(n1, n2.next);
            return n2;
        }
    }

    public static void printLinkedList(Node node){
        Node tmp = node;
        while(tmp != null){
            System.out.println(tmp.val + " ");
            tmp = tmp.getNext();
        }
    }
    
}
