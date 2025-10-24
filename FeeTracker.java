public class FeeTracker {
    class Node {
        int amount;
        String studentId;
        Node left, right;
        Node(int amount, String studentId) { this.amount = amount; this.studentId = studentId; }
    }
    Node root;
    Node insert(Node root, int amount, String id) {
        if (root == null) return new Node(amount, id);
        if (amount < root.amount) root.left = insert(root.left, amount, id);
        else root.right = insert(root.right, amount, id);
        return root;
    }
    void addPayment(String id, int amount) { root = insert(root, amount, id); }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.studentId + " paid: " + root.amount);
            inorder(root.right);
        }
    }
    void viewPayments() { inorder(root); }
}