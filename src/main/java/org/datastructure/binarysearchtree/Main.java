package org.datastructure.binarysearchtree;

public class Main {
	public static void main(String[] args) {
//		BinarySearchTree myBST = new BinarySearchTree();

		RBST myBST = new RBST();
		System.out.println("Root = " + myBST.root);
		myBST.rInsert(47);
		System.out.println("Root = " + myBST.root.value);
		myBST.rInsert(21);
		myBST.rInsert(76);

		myBST.rDelete(21);

// 		myBST.insert(47);
//		myBST.insert(21);
//		myBST.insert(76);
//		myBST.insert(18);
//		myBST.insert(52);
//		myBST.insert(82);
//
//		myBST.insert(27);

		System.out.println(myBST.root.left.value);

//		System.out.println(myBST.rContains(52));
//		System.out.println(myBST.rContains(13));

	}

}
