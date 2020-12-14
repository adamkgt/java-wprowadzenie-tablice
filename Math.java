class Math{
	public static void main(String args[]){
		int[] Rate = new int[5];

		Rate[0]= 3;
		Rate[1]= 2;
		Rate[2]= 1;
		Rate[3]= 2;
		Rate[4]= 3;

	System.out.print("Trzy ostatnie oceny to: ");
	System.out.print(Rate[4]+", ");
	System.out.print(Rate[3]+", ");
	System.out.println(Rate[2]+", ");
	
	System.out.println(" ");
	
		Rate[1]= 5;
	System.out.println("Porawa drugiej oceny na: "+Rate[1]);
	System.out.println(" ");
	
	System.out.print("Oceny od najmniejszej do najwiekszej: ");
	System.out.print(Rate[2]+", ");
	System.out.print(Rate[3]+", ");
	System.out.print(Rate[4]+", ");
	System.out.print(Rate[0]+", ");
	System.out.print(Rate[1]+", ");
	
	
	
	
		}
}