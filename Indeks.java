class Indeks{
	public static void main(String args[]){
		int[] Student = new int[6];

		Student[0]= 2;
		Student[1]= 3;
		Student[2]= 4;
		Student[3]= 1;
		Student[4]= 2;
		Student[5]= 1;

		System.out.println("---------------------");
		
		System.out.print("Student: ");	
		System.out.print(Student[0]);
		System.out.print(Student[1]);
		System.out.print(Student[2]);		
		System.out.println(Student[3]);	
		
		
		double[] Rate = new double[6];
		
		Rate[0]= 5;
		Rate[1]= 1;
		Rate[2]= 3.5;
		Rate[3]= 1;
		Rate[4]= 6;
		Rate[5]= 4.5;
		
		System.out.print("Oceny z informatyki: ");	
		System.out.print(Rate[0]+", ");
		System.out.print(Rate[1]+", ");
		System.out.print(Rate[2]+", ");	
		System.out.print(Rate[4]+", ");		
		System.out.println(Rate[5]);	
		
		
		System.out.println("---------------------");
		
		}
}