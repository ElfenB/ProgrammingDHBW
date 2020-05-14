package java2.chapter17;
public class BinaryTreeTraversal {

    /**
     * Schreibt alle Knotenwerte des gegebenen Baums in Inorder-Reihenfolge in die Konsole.
     * 
     * @param tree
     */
    public static void printInorder(BinarySearchTree tree) {
        System.out.print("Inorder:");
        printInorder(tree.getRoot());
        System.out.println();
    }

    private static void printInorder(BinaryTreeNode node) {
        if (node != null) {
            printInorder(node.getLeft());
            System.out.print(" " + node.getValue());
            printInorder(node.getRight());
        }
    }

    /**
     * Schreibt alle Knotenwerte des gegebenen Baums in Preorder-Reihenfolge in die Konsole.
     * 
     * @param tree
     */
    public static void printPreorder(BinarySearchTree tree) {
        System.out.print("Preorder:");
        printPreorder(tree.getRoot());
        System.out.println();
    }

    private static void printPreorder(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(" " + node.getValue());
            printPreorder(node.getLeft());
            printPreorder(node.getRight());
        }
    }

    /**
     * Schreibt alle Knotenwerte des gegebenen Baums in Postorder-Reihenfolge in die Konsole.
     * 
     * @param tree
     */
    public static void printPostorder(BinarySearchTree tree) {
        System.out.print("Postorder:");
        printPostorder(tree.getRoot());
        System.out.println();
    }

    private static void printPostorder(BinaryTreeNode node) {
        if (node != null) {
            printPostorder(node.getLeft());
            printPostorder(node.getRight());
            System.out.print(" " + node.getValue());
        }
    }

    /**
     * Schreibt alle Knotenwerte des gegebenen Baums in Levelorder-Reihenfolge in die Konsole.
     * 
     * @param tree
     */
    public static void printLevelorder(BinarySearchTree tree) {
        System.out.print("Levelorder:");
        if (!tree.isEmpty()) {
            BinaryTreeNode[] queue = new BinaryTreeNode[tree.getSize()];
            int nodesCount = 0;
            queue[nodesCount++] = tree.getRoot();
            int currentNode = -1;
            while (++currentNode < queue.length) {
                System.out.print(" " + queue[currentNode].getValue());
                if (queue[currentNode].getLeft() != null) {
                    queue[nodesCount++] = queue[currentNode].getLeft();
                }
                if (queue[currentNode].getRight() != null) {
                    queue[nodesCount++] = queue[currentNode].getRight();
                }
            }
        }
        System.out.println();
    }
}