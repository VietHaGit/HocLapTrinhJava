package DSAA.TreeDataStructure;

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

// Biến đổi một cây thành cây Avl , và đếm số bậc của cây đó .
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

// Tìm kiếm số lần x xuất hiện trong cây.
class  node{
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
    public static int treeLevel(node root){
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left),treeLevel(root.right));
    }
    public static boolean checkAvl(node root){
        if (root == null ) return true;
        if (Math.abs(treeLevel(root.left)-treeLevel(root.right)) > 1) return false;
        return checkAvl(root.left) &&  checkAvl(root.right);
    }
    public static node turnRight(node root){
        node b = root.left;
        node d = b.right;
        root.left = d;
        b.right=root;
        return b;
    }
    public static node turnLeft(node root){
        node b = root.right;
        node c = b.left;
        root.right = c;
        b.left = root;
        return b;
    }
    public static void printTree(node root){
        printTree(root.left);
        System.out.print(root.data + " ");
        if (root.left != null)
            System.out.print(root.left.data);
        if (root.right!=null)
            System.out.print(root.right.data);
        printTree(root.right);
    }
    public static node updateTreeAvl(node root){
        if (Math.abs(treeLevel(root.left) - treeLevel(root.right)) >1){
            if (treeLevel(root.left) > treeLevel(root.right)){
                node p = root.left;
                if (treeLevel(p.left) >= treeLevel(p.right)){
                    root = turnRight(root);
                }
                else {
                    root.left = turnLeft(root.left);
                    root = turnLeft(root);
                }
            }
            else {
                node p = root.right;
                if (treeLevel(root.right) >= treeLevel(root.left)){
                    root = turnLeft(root);
                }
                else {
                    root.right = turnRight(root.right);
                    root = turnLeft(root);
                }
            }
        }
        if (root.left != null) root.left = updateTreeAvl(root.left);
        if (root.right != null) root.right = updateTreeAvl(root.right);
        return root;
    }
    public static int count(node root, int x){
        if (root == null) return 0; // Nếu gốc bằng null thì sẽ trả về x = 0;
        if (root.data == x) return 1 + count(root.left,x) + count(root.right, x); // nếu trong cây có node = x thì sẽ trả về lần xuất hiện của bên trái + bên phải của cây
        else if (root.data < x) return count(root.right,x); // nếu giá trị x lớn hơn gốc thì ta sẽ xét bên phải của cây
        return count(root.left,x);// Ngược lại
    }

    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int x;
        TREE tree = new TREE();
        tree.root = input(tree.root);
        while (!checkAvl(tree.root)) {
            tree.root = updateTreeAvl(tree.root);
        }
        x = Sc.nextInt();
       System.out.print(count(tree.root,x));
    }
}

class node {
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right =null;
    }
}
class TREE{
    node root;

    TREE(){
        this.root = null;
    }
}
class main{
        public static node insert(node root, int data){
          if (root !=null){
              if (root.data > data)
                  root.left = insert(root.left,data);
              else
                  root.right = insert(root.right,data);
              return root;
          }
        return new node(data);
        }
        public static int[] input(Scanner Sc){
            int n = Sc.nextInt();
            int a[] = new int[n];
            for (int i =0; i <n;i++){
                a[i]= Sc.nextInt();
            }
            return a;
        }
        public static void display(node root){
            if (root!= null){
                display(root.left);
                System.out.print(root.data+" ");
                display(root.right);
            }
        }
        public static void deleteNode(node root){
            if (root !=null){
                if (root.left!=null)
                    deleteNode(root.left);
                if (root.right != null)
                    deleteNode(root.right);
            }
        }

        public static node deleteNumber(node root, int x){
            if (root != null){
                if (root.data == x){
                    deleteNode(root.left);
                    deleteNode(root.right);
                    root =null;
                }
                else if (root.data > x) root.left = deleteNumber(root.left,x);
                else root.right = deleteNumber(root.right,x);
            }
            return root;
        }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         int[] a = input(Sc);
         TREE tree =new TREE();
         for (int i = 0; i < a.length;i++){
             tree.root=insert(tree.root,a[i]);
         }
         int x = Sc.nextInt() ;
         tree.root = deleteNumber(tree.root,x);
         if (tree.root == null)
             System.out.print("NULL");
         else
             display(tree.root);
    }
        
}
 */
class node {
    int data;
    node left;
    node right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right =null;
    }
}
class TREE{
    node root;

    TREE(){
        this.root = null;
    }
}
// insert data vao cay
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
//    Duyet trung thu tu
    public static void display(node root){
        if (root != null){
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }

    }
    public static boolean isLeafNode(node root){
        return (root.left==null && root.right==null);
    }
//    Tim so la cua cay
    public static int countLeafNode(node root){
        if (root == null) return 0;
        if (isLeafNode(root)) return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }
//    Tim bac cua cay
    public static int treeLevel(node root){
        if (root == null) return -1;
        return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
    }
//   Check mot cay co phai la cay Avl khong
    public static boolean checkAvl(node root){
        if (root == null) return true;
        if (Math.abs(treeLevel(root.left)) - treeLevel(root.right) > 1) return false;
        return checkAvl(root.left) && checkAvl(root.right);
    }
    public static node turnRight(node root){
        node b = root.left;
        node d = b.right;
        root.left = d;
        b.right = root;
        return b;
    }
    public static node turnLeft(node root){
        node b = root.right;
        node c = b.left;
        root.right = c;
        b.left = root;
        return b;
    }
    public static node updateTreeAvl(node root){
        if (Math.abs(treeLevel(root.left)) - treeLevel(root.right)>1){
            if (treeLevel(root.left) > treeLevel(root.right)){
                node p = root.left;
                if (treeLevel(root.left) >= treeLevel(root.right)){
                    root = turnRight(root);
                }
                else {
                    root.left = turnLeft(root.left);
                    root = turnRight(root);
                }
            }
            else {
                node p = root.right;
                if (treeLevel(root.right)>= treeLevel(root.left)){
                    root = turnLeft(root);
                }
                else {
                    root.right = turnRight(root.right);
                    root = turnLeft(root);
                }
            }
        }
        if (root.left!= null) root.left = updateTreeAvl(root.left);
        if (root.right!=null) root.right = updateTreeAvl(root.right);
        return root;
    }
}