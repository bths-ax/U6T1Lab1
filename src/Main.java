public class Main {
	public static void main(String[] args) {
		// question 1
		int[] heights = new int[3];

		System.out.println(heights[0]);
		System.out.println(heights[1]);
		System.out.println(heights[2]);

		heights[0] = 78;
		heights[1] = 72;
		heights[2] = 69;

		System.out.println(heights[0]);
		System.out.println(heights[1]);
		System.out.println(heights[2]);

		// question 2
		boolean[] bools = new boolean[6];

		for (int i = 0; i < 6; i++)
			bools[i] = i % 2 == 0;
		bools[0] = bools[3];

		System.out.println(bools.length);
		System.out.println(bools[0]);
		System.out.println(bools[bools.length - 1]);

		// question 3
		String[] alphabeticalNames = { "Abby", "David", "Charlie", "Lauren" };

		String tmp = alphabeticalNames[1];
		alphabeticalNames[1] = alphabeticalNames[2];
		alphabeticalNames[2] = tmp;

		for (int i = 0; i < 4; i++)
			System.out.println(alphabeticalNames[i]);

		// question 4
		double[] array1 = { 7.5, 10.0 };
		double[] array2 = { 8.2, 14.8 };
		double[] array3 = {
			array1[0] + array2[0],
			array1[1] * array2[1]
		};

		System.out.println(array3[0]);
		System.out.println(array3[1]);

		// question 5
		String[] animals = new String[4];
		
		for (int i = 0; i < 4; i++)
			System.out.println(animals[i]);

		animals[0] = "dog";
		animals[1] = "camel";
		animals[2] = "aardvark";
		animals[3] = "bunny";

		for (int i = 0; i < 4; i++)
			System.out.println(animals[i]);

		//System.out.println(animals[4]);

		animals[2] += "s";

		System.out.println(animals.length);
		System.out.println(animals[2]);

		// question 6
		Dog d1 = new Dog("Sparky", 4);
		Dog d2 = new Dog("Toby", 7);
		Dog d3 = new Dog("Fiona", 12);

		Dog[] dogs = { d1, d2, d3 };

		for (int i = 0; i < 3; i++)
			System.out.println(dogs[i].getName());
	}
}
