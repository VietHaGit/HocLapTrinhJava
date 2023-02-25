package DSAA.TreeDataStructure;
import java.util.Scanner;
/*
// khai bao mot node trong cua cay
class node {
    int data;
    node pLeft;
    node pRight;

    node (int data) {
        this.data = data;
        this.pLeft = null;
        this.pRight = null;
    }
}

class TREE {
    node root;

    TREE() {
        this.root = null;
    }
}

 class Main {
    public static node insert(node root, int data) {
        if (root != null) { // nếu cây khác rỗng: + Nếu data của phần tử thêm vào bé thua data cuat Node thì gọi hàm đệ quy bên Node left và ngược lại
            if (root.data > data)
                root.pLeft = insert(root.pLeft, data);
            else
                root.pRight = insert(root.pRight, data);
            return root;
        }
        return new node(data);
    }

    public static node input(node root) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while ((n--) != 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        return root;
    }

    public static void display(node root) {
//        Duyet Trung Thu tu
        if (root != null) {
            display(root.pLeft);
            System.out.print(root.data + " ");
            display(root.pRight);
        }
// Duyet Tien Thu Tu
        if (root != null){
            System.out.print(root.data+ " ");
            display(root.pLeft);
            display(root.pRight);
        }
// Duyet Hau Thu Tu
        if (root != null){
            display(root.pLeft);
            display(root.pRight);
            System.out.print(root.data);
        }
    }

    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
        display(tree.root);
    }
}
 */
class node {
    int data;
    node pLeft;
    node pRight;
    node(int data){
        this.data = data;
        this.pLeft = null;
        this.pRight = null;
    }
}
class TREE{
    node root;
    TREE(){
        this.root = null;
    }
}
class Main{
    public static node insert(node root, int data){
        if (root != null){
            if (root.data > data)
                root.pLeft = insert(root.pLeft, data);
            else
                root.pRight = insert(root.pRight, data);
            return root;
        }
        return new node(data);
    }
    public static node input(node root){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        while ((n--) != 0){
            int data = Sc.nextInt();
            root = insert(root, data);
        }
        Sc.close();
        return root;
    }
    public static void display(node root){
        if (root != null){
            display(root.pLeft);
            System.out.print(root.data + " ");
            display(root.pRight);
        }
    }
   public static boolean isLeafNode(node root){
        return (root.pLeft == null && root.pRight == null);
    }
    public static int countLeafNode(node root){
        if (root == null) return 0;
        if (isLeafNode(root)) return 1;
        return countLeafNode(root.pLeft) + countLeafNode(root.pRight);
    }
    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
//        display(tree.root);
        System.out.print(countLeafNode(tree.root));
    }
}
