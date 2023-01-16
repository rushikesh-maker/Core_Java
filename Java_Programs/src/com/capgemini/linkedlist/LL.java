package com.capgemini.linkedlist;

class LL {

    //Creating refference type of Node class
    Node head;

    class Node {
        String data;
        Node next;

        //Constructor of node class to instantiate variables
        Node(String data){
            this.data = data;
            this.next = next;
        }
    }

        //Add at first
        public void addFist(String data) {

            //Creating object of Node class to store data
            //and calling Node constructor
            Node newNode = new Node(data);

            //Correner case
             if(head == null) {
                head = newNode;
                return;
             }

             newNode.next = head; //assingning new node to head
             head = newNode; //assingning head to new node
        }

        //Add at last
        public void addLast(String data) {

            //Creating object of Node class to store data
            //and calling Node constructor
            Node newNode = new Node(data);

            //Correner case
            if(head == null) {
                System.out.println("List is empty!");
                head = newNode;
            }

            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next; 
            }

            currNode.next = newNode;
        }

        //printing list
        public void printList() {

            //correner case
            if(head == null) {
                System.out.println("List is empty !");
                return;
            }

            Node currNode = head;
            while(currNode != null) {
                System.out.print(currNode.data+" ->");
                currNode = currNode.next; 
            }

            System.out.println("NULL");
        }

        //Deleting Node from first
        public void deleteFirst() {
            
            if(head == null) {
                System.out.println("The list is empty !");
                return;
            }

            head = head.next; //assigning head to second node to delete first node
        }

        //Delete Node from last
        public void deleteLast() {
            //correner case if head is null
            if(head == null) {
                System.out.println("The list is empty !");
                return;
            }

            //correner case if second node of list is null
            if(head.next == null) {
                head = null;
                return;
            }

            Node secondLast = head; //creating refference type for head
            Node lastNode = head.next; //creating refference type for second node of list

            while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }

        //Reverse a List through iterate
        public void reverseIterate() {

            if(head == null || head.next == null) {
                return;
            }
            
            Node preNode = head;
            Node currNode = head.next;
            while(currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = preNode;

                //update
                preNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = preNode;
        }

        public Node reverseRecursive(Node head) {
            if(head == null || head.next == null) {
                return head;
            }

            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }
    public static void main(String[] args) {

        LL list = new LL(); //creating object of LL class

        list.addFist("a"); //Adding element in list from first
        list.addFist("is");
        list.addFist("This");
        list.addLast("Rushikesh"); //Adding element in list from last
        list.printList();

        // list.deleteFirst(); //deleting element in list from first
        //list.printList();

        //list.deleteLast(); //deleting element in list from last
        //list.printList();

        //list.reverseIterate();
        //list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
