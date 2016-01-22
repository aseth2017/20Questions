public class LinkedListRunner
{
	public static void main(String[] args)
	{
		LinkedList<Integer> x = new LinkedList<Integer> ();
		x.add(2);
		System.out.println(x.removeFirst());
		x.add(1);
		System.out.println(x);
	}
}
