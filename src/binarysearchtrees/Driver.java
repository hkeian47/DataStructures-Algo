package binarysearchtrees;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree myBTS = new BinarySearchTree();
       myBTS.insert(47);
        myBTS.insert(21);
        myBTS.insert(76);
        myBTS.insert(18);
        myBTS.insert(52);
        myBTS.insert(82);
        System.out.println(myBTS.root.right.left.value);
    }
}