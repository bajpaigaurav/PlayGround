import java.util.*;

public class SpiralPrintLevelOrder {

    private class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

//    ArrayList<Integer> findSpiral(Node root) {
//        ArrayList<Integer> traversal = new ArrayList<Integer>();
//        int direction = 0;
//        Deque<Node> level = new LinkedList<>();
//        level.add(root);
//        while (level.size() != 0) {
//            Deque<Node> nextLevel = new LinkedList<>();
//            while(level.size() != 0) {
//                Node current = null;
//                if(direction % 2 == 0) {
//                     current  = level.removeLast();
//                } else {
//                     current = level.removeFirst();
//                }
//
//                if(current != null) {
//                    traversal.add(current.data);
//                    nextLevel.add(current.left);
//                    nextLevel.add(current.right);
//                }
//
//            }
//            level.clear();
//            level = nextLevel;
//            direction++;
//        }
//
//        return traversal;
//    }
}
