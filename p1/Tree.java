package p1;

public class Tree {
    private Node root; //first node of the tree

    public Tree(){
        root = null;
    }


    public Node minimum(){
        Node current = root;
        Node last = null;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node maximum(){
        Node current = root;
        Node last = null;
        while (current!= null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public void insert(int id, double dd){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if (id < current.iData){//go left
                    current = current.leftChild;
                    if (current == null){//reached the end of the line
                        parent.leftChild = newNode;
                        return;
                    }
                }

                else{
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = newNode;
                        return;

                    }
                }
            }
        }
    }

}
