package p1;

public class Demo {
    public static void main(String[] args){
        Tree myTree= new Tree();
        myTree.insert(100,100.1);
        myTree.insert(50,50.1);
        myTree.insert(25,125.1);
        myTree.insert(125,120.1);
        myTree.insert(200,200.1);
        myTree.insert(10,10.1);
        myTree.maximum().displayNode();
        myTree.minimum().displayNode();
    }
}
