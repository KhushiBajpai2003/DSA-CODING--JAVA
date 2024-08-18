package Trees;

public class FindValueintheTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        TreeNode root;
        public BinaryTree() {
            this.root = null;
        }
        public boolean findValue(TreeNode node, int value) {
            if (node == null) {
                return false;
            }
            if (node.value == value) {
                return true;
            }
            boolean foundInLeftSubtree = findValue(node.left, value);
            boolean foundInRightSubtree = findValue(node.right, value);
            return foundInLeftSubtree || foundInRightSubtree;
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        int valueToFind = 5;
        boolean result = tree.findValue(tree.root, valueToFind);
        System.out.println(result);

    }
}
