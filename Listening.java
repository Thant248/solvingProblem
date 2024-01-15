import java.util.*;

/**
 * Listening
 */
public class Listening {

  public static void main(String[] args) {
    TreeNode tree = new TreeNode();
    tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.left.right = new TreeNode(5);

    System.out.println(leafSimilar(tree, tree));
  }

  public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

    int Rlength = 12;
    int R2length = 12;
    List<Integer> Rlist = new ArrayList<>();

    List<Integer> R2list = new ArrayList<>();

    for (int i = 0; i < Rlength; i++) {

      if (root1.right == null && root1.left == null) {
        Rlist.add(root1.val);
      }

    }

    for (int i = 0; i < R2length; i++) {

      if (root2.right == null && root2.left == null) {
        R2list.add(root2.val);
      }
    }

    if (Rlist.contains(R2list)) {
      return true;
    } else
      return false;
  }

}
