import java.util.Scanner;
import java.io.*;
/**
@author Anish Seth
@version 1.12.15
*/
public class TwentyQuestions
{
	/**
	main
	*/
	public static void main(String [] args)
	{
		BinaryTree<String> tree = initTree(); 
		System.out.println("Please think of an object: ");
		Scanner keyboard = new Scanner(System.in); 
		while(!tree.isLeaf())
		{
			System.out.println(tree.value());
			String input = keyboard.nextLine(); 
			if(input.equalsIgnoreCase("yes"))
				tree = tree.right();
			else if(input.equalsIgnoreCase("no"))
				tree = tree.left();
			else
				System.out.println("please enter yes or no: ");
		}
		System.out.println("Is your thing a " + tree.value() + "?\n");
		String input = keyboard.nextLine();
		if(input.equalsIgnoreCase("yes"))
		{
			System.out.println("GOT EM!!!!");
			return;
		}
		else if(input.equalsIgnoreCase("no"))
		{
			tree.setLeft(new BinaryTree<String>(tree.value()));
			System.out.println("Please enter your object : ");
			input = keyboard.nextLine();
			tree.setRight(new BinaryTree<String>(input));
			System.out.println("Please enter a question that would distinguish your thing/person from a " + tree.value() + ": ");
			input = keyboard.nextLine();
			tree.setValue(input);
		}
	}
	
	/**
	initializes tree with base question 
	@return tree containing question and object for response
	*/
	public static BinaryTree<String> initTree()
	{
		BinaryTree<String> tree = new BinaryTree<String>("Is it alive: ");
		tree.setLeft(new BinaryTree<String>("chair"));
		tree.setRight(new BinaryTree<String>("dog"));
		return tree;
	}
	
}