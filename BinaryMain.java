package com.binarysearchtree;

public class BinaryMain<T> {

	public static void main(String args[])
	{
		/**UC1
		 * Create binary search tree
		 */
		BinarySearch<Integer> searchTree = new BinarySearch<>();
		searchTree.insert(56);
		searchTree.insert(30);
		searchTree.insert(70);

		/**UC2
		 * Create binary search tree with given nodes
		 */
		BinarySearch<Integer> searchTree1 = new BinarySearch<>();
		searchTree1.insert(56);
		searchTree1.insert(30);
		searchTree1.insert(70);
		searchTree1.insert(22);
		searchTree1.insert(40);
		searchTree1.insert(60);
		searchTree1.insert(95);
		searchTree1.insert(11);
		searchTree1.insert(65);
		searchTree1.insert(3);
		searchTree1.insert(16);
		searchTree1.insert(63);
		searchTree1.insert(67);

		//print size of the binary search tree
		int size = searchTree1.numOfNodes();
		System.out.println("Size of the binary search tree is " + size);

		/**UC3
		 * Search for a node 63 in binary search tree1
		 */
		if (searchTree1.searchNode(63))
		{
			System.out.println("Node found");
		}
		else
		{
			System.out.println("Node not found");
		}

	}
}


