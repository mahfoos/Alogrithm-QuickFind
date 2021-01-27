public class QuickFind {
	private int[] id;

	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	public boolean connected(int id1, int id2) {
		return id[id1] == id[id2];
	}

	public void union(int id1, int id2) {
		int id_1 = id[id1];
		int id_2 = id[id2];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == id_1)
				id[i] = id_2;
		}
	}




	public static void main(String[] args) {
		QuickFind quickFind = new QuickFind(10);

		System.out.println("********* Values Of Array *******************");
		for (int i = 0; i < 10; i++)
			System.out.print(quickFind.id[i] + " ");
		System.out.print("\n");

		System.out.println("\n********Processing union of indexes**********");
		System.out.println("\nunion (3,8)");
		quickFind.union(3, 8);
		for (int i = 0; i < 10; i++)
			System.out.print(quickFind.id[i] + " ");
		System.out.print("\n");


		System.out.println("\nunion (5,2)");
		quickFind.union(5, 2);
		for (int i = 0; i < 10; i++)
			System.out.print(quickFind.id[i] + " ");
		System.out.println("\n");

		System.out.println("union (2,3)");
		quickFind.union(2, 3);
		for (int i = 0; i < 10; i++)
			System.out.print(quickFind.id[i] + " ");
		System.out.println("\n");

		System.out.println("***** Check the Connectivity ********");
		System.out.println("Is Index 1 and 2 connected? \n" + quickFind.connected(1,2));
		System.out.println("Is Index 3 and 8 connected? \n" + quickFind.connected(3,8));


	}
}
