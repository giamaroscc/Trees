package p1;

public class Node {
    public int iData; // data item key
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public void displayNode(){
        System.out.print("(" + iData);
        System.out.print(", ");
        System.out.print(dData + ")");
    }
}
