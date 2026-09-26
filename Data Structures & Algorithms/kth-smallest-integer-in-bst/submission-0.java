class Solution {
    TreeNode element;
    int counter = 0;

    public int kthSmallest(TreeNode root, int k) {
        getElement(root, k);
        return element.val;
    }

    private void getElement(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        getElement(root.left, k);

        counter++;

        if (counter == k) {
            element = root;
            return;
        }

        getElement(root.right, k);
    }
}