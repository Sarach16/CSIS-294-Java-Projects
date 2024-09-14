public class LinkedList {
    Node headNode = new Node();

    public void addNode(int x, int y){
        Node oNode = new Node();
        oNode.xPosition = x;
        oNode.yPosition = y;
        //Set next to head node
        oNode.nextNode = headNode;
        //Set head node to new node
        headNode = oNode;


    }
    public Node removeNode(){
        //Create temp variable to hold headNode value
        Node temp = headNode;
        //Set head to the head of the nextNode
        headNode = headNode.nextNode;

        return temp; //returns the original head

    }

    public Node getHeadNode(){
        return headNode;
    }

}
