package com.binarysearchtree;

public class BinarySearch<T extends Comparable<T>> {
	BinaryNodeTree<T> root;

	/**
	 * Method to insert a node in binary search tree
	 * @param data
	 */
	public void insert(T data)
	{
		BinaryNodeTree<T> newNode=new  BinaryNodeTree<>();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			BinaryNodeTree<T> tempNode = root;
			while(tempNode != null)
			{
				if(data.compareTo(tempNode.data) > 0)
				{
					if(tempNode.right == null)
					{
						tempNode.right = newNode;
						break;
					}
					else
					{
						tempNode = tempNode.right;
					}
				}
				else if(data.compareTo(tempNode.data) < 0)
				{
					if(tempNode.left == null)
					{
						tempNode.left = newNode;
						break;
					}
					else
					{
						tempNode = tempNode.left;
					}
				}
				else
				{
					System.out.println("Duplicate data not allowed in binarytrees ");
					break;
				}
			}
		}
	}

	public int numOfNodes()
	{
		return size(root);
	}

	/**
	 * Method to count number of nodes in binary search tree
	 * @param root
	 * @return
	 */
	public int size( BinaryNodeTree<T> root)
	{
		if(null == root)
			return 0;
		int nodesLeftSubtree = size(root.left);
		int nodesRightSubtree = size(root.right);
		return nodesLeftSubtree + nodesRightSubtree + 1;
	}

	/**
	 * Method to search for a node in binary search tree
	 * @param data
	 * @return
	 */
	public boolean searchNode(T data)
	{
		if(root == null)
		{
			return false;
		}
		else
		{
			BinaryNodeTree<T> tempNode = root;
			while (root != null)
			{
				if(data.compareTo(tempNode.data) > 0)
				{
					tempNode = tempNode.right;
				}
				else if (data.compareTo(tempNode.data) < 0)
				{
					tempNode = tempNode.left;
				}
				else
				{
					return true;
				}
			}
			return false;
		}
	}

}


