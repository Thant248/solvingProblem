import java.util.*;

public class findLeafNodesEqual {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7, null, new TreeNode(9, new TreeNode(8), null))),
                new TreeNode(1, new TreeNode(4), new TreeNode(2)));

        System.out.println(isLeafNodeEqual(root, root2));

    }

    public static boolean isLeafNodeEqual(TreeNode root1, TreeNode root2) {

        List<Integer> firstNode = new ArrayList<>();
        List<Integer> secondNode = new ArrayList<>();

        getLeafNodes(root1, firstNode);
        getLeafNodes(root2, secondNode);

        return firstNode.equals(secondNode);

    }

    public static void getLeafNodes(TreeNode root, List<Integer> nodeList) {

        if (root == null) {
            return;
        }

        if (root.right == null && root.left == null) {

            nodeList.add(root.val);
        } else {
            getLeafNodes(root.right, nodeList);
            getLeafNodes(root.left, nodeList);
        }
    }
}
