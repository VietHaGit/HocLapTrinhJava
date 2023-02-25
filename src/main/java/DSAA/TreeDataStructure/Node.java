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
// bài đếm nút lá của cây ( nút lá là nút mà không có bất kỳ nút con nào)
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


// bài 3: tìm bậc của cây " Bậc của một node biểu diễn số con của một node
class node {
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class TREE{
    node root;

    TREE(){
        this.root = null;
    }
}

class main{
    public static node insert(node root, int data) {
        if (root != null) {
            if (root.data > data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);
            return root;
        }
        return new node(data);
    }
    public static node input(node root){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        while ((n--) !=0){
            int data = Sc.nextInt();
            root = insert(root,data);
        }
        Sc.close();
        return root;
    }
    public static void display(node root){
        if (root != null){
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }
    }
    public static boolean isLeafNode(node root){
        return (root.left == null && root.right == null);
    }
    public static int treeLevel(node root) {
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
    }

    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
//        display(tree.root);
        System.out.print(treeLevel(tree.root));

    }
}

// kiểm tra AVL : kiểm tra độ cao của cây con bên trái và cây con bên phải
class node {
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class TREE{
    node root;

    TREE(){
        this.root = null;
    }
}

class main {
    public static node insert(node root, int data) {
        if (root != null) {
            if (root.data > data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);
            return root;
        }
        return new node(data);
    }

    public static node input(node root) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        while ((n--) != 0) {
            int data = Sc.nextInt();
            root = insert(root, data);
        }
        Sc.close();
        return root;
    }

    public static void display(node root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }
    }
    public static int treeLevel(node root){
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left),treeLevel(root.right));
    }
    public static boolean checkAVL(node root){
        if (root == null) return true;
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) > 1) return false;
        return checkAVL(root.left) && checkAVL(root.right);
    }

    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
        System.out.print(checkAVL(tree.root));
    }
}
 */
class node{
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class TREE{
    node root;

    TREE(){
        this.root = null;
    }
}
class main {
    public static node insert(node root, int data) {
        if (root != null) {
            if (root.data > data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);
            return root;
        }
        return new node(data);
    }
    public static node input(node root) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        while ((n--) != 0) {
            int data = Sc.nextInt();
            root = insert(root, data);
        }
        Sc.close();
        return root;
    }

    public static int treeLevel(node root) { // kiểm tra bậc của cây
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
    }

    public static boolean checkAvl(node root) { // kiểm tra có phải là môt cây Avl không ?
        if (root == null) return true;
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) > 1) return false;
        return checkAvl(root.left) && checkAvl(root.right);
    }

    public static node turnRight(node root) { // Kỹ thuật xoay phải
        node b = root.left;
        node d = b.right;
        root.left = d;
        b.right = root;
        return b;
    }

    public static node turnLeft(node root) { // Kỹ thuật xoay trái
        node b = root.right;
        node d = b.left;
        root.right = d;
        b.left = root;
        return b;
    }

    public static void printTree(node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.data + " ");
            if (root.left != null)
                System.out.print(root.left.data + " ");
            if (root.right != null)
                System.out.print(root.right.data + " ");
            printTree(root.right);
        }
    }

    public static node updateTreeAvl(node root) {
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) > 1){ // kiểm tra có phải là một cây Avl không ?
            if (treeLevel(root.left) > treeLevel(root.right)) { // kiểm tra xem bậc của cây con trái có lớn hơn cây con phải k?
                node p = root.left;
                if (treeLevel(p.left) >= treeLevel(p.right)) {
                    root = turnRight(root); // nếu lớn hơn thì mình xoay phải cây
                } else {
                    root.left = turnLeft(root.left);// còn ngược lại thì xoay trái cây
                    root = turnRight(root);
                }
            } else {
                node p = root.right;
                if (treeLevel(root.right) >= treeLevel(root.left)) { // nếu phải lớn hơn thì xoay trái cây
                    root = turnLeft(root);
                } else {
                    root.right = turnRight(root.right); // ngược lại thì xoay phải
                    root = turnLeft(root);
                }
            }
        }
        if (root.left != null) root.left = updateTreeAvl(root.left);
        if (root.right != null) root.right = updateTreeAvl(root.right);
        return root;
    }

    public static void main(String[] args) {
        TREE tree = new TREE();
        tree.root = input(tree.root);
        while (!checkAvl(tree.root)){
            tree.root = updateTreeAvl(tree.root);
        }
        System.out.print(treeLevel(tree.root));
    }
}