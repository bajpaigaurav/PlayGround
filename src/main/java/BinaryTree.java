public class BinaryTree<T extends Comparable<T>> {

//    private class Node {
//        T data;
//        Node left, right;
//
//        public Node(Node left, Node right, T element) {
//            this.data = element;
//            this.left = left;
//            this.right = right;
//        }
//    } // node closed
//
//    private int nodeCount = 0;
//
//    private Node root = null;
//
//    // returns true or false in case of BST empty or not
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//    // returns size of BST - in terms of total numbers of element in a BST
//    public int size() {
//        return nodeCount;
//    }
//
//    public boolean add ( T element) {
//        // check if the value already exist
//        if(contains(element)) {
//            return false;
//        } else {
//            root = add(root, element);
//            nodeCount++;
//            return true;
//        }
//    }
//
//    private Node add(Node node, T element) {
//        if(node == null) {
//            node = new Node(null, null, element);
//        } else {
//            if( element.compareTo(node.data) < 0) {
//                node.left = add(node.left, element);
//            } else {
//                node.right = add(node.right, element);
//            }
//        }
//        return node;
//    }
//
//    public boolean remove(T element) {
//        if(contains(element)) {
//            root = remove(root, element);
//            nodeCount--;
//            return true;
//        }
//        return false;
//    }
//
//    private Node remove(Node node, T element) {
//        if(node == null) return null;
//
//        int cmp = element.compareTo(node.data);
//        if(cmp < 0) {
//            node.left = remove(node.left, element);
//        } else if(cmp > 0) {
//            node.right = remove(node.right, element);
//        } else {
//            if(node.left == null)
//        }
//    }


}