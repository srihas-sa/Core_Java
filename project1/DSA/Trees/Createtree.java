package DSA.Trees;

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

public class Createtree {
  public static void main(String[] args) {
    Node head = new Node(1);
    Node left1 = new Node(2);
    Node right1 = new Node(3);
    Node left2 = new Node(4);
    Node right2 = new Node(5);
    Node left3 = new Node(6);
    Node right3 = new Node(7);
    head.left = left1;
    head.right = right1;
    head.left.left = left2;
    head.left.right = right2;
    head.right.left = left3;
    head.right.right = right3;
    Node temp = head;
    System.out.println("InOrder");
    InorderTraversal(temp);
    System.out.println("PreOrder");
    PreOrderTraversal(temp);
    System.out.println("PostOrder");
    PostOrderTraversal(temp);

  }

  public static void InorderTraversal(Node n) {
    if (n == null) {
      return;
    }

    InorderTraversal(n.left);
    System.out.println(n.val);
    InorderTraversal(n.right);

  }

  public static void PreOrderTraversal(Node n) {
    if (n == null) {
      return;
    }

    System.out.println(n.val);
    PreOrderTraversal(n.left);
    PreOrderTraversal(n.right);

  }

  public static void PostOrderTraversal(Node n) {
    if (n == null) {
      return;
    }

    PostOrderTraversal(n.left);
    PostOrderTraversal(n.right);
    System.out.println(n.val);

  }
}
