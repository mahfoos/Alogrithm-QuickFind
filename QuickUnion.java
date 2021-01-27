public class QuickUnion
{
	private int[] id;

	public QuickUnion(int N)
	{
		id = new int[N];
		for (int i = 0; i < N ; i++) // set id of each objects to itself
			id[i] = i;
	}

	private int root (int i)
	{
		while (i != id[i])  // choose parent pointers until match root
			i = id [i];		// (depth of i array access)
		return i;

	}

	public boolean connected (int p, int q)
	{
		return root(p) == root(q); // check if p and q have same root
	}

	public void union(int p, int q)
	{
		int i = root(q);
		int j = root(q);	// change root of p to root of q
		id[i] = j;			// (depth of p and q array accesses)
	}


}
