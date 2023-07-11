package L3_Static;

public class P4_StaticBlocks {
	static int a =10;
	static int age,marks;	
	  int x ,z;
	  
	  
	//static block
	{
		 age = 29;
		 marks= 300;
	}
	
	//non-Static block
			{
				 z= 11;
				 x = 30;
			}
	
	public static void main(String[] args) {
		System.out.println(P4_StaticBlocks.age);
		
		P4_StaticBlocks p = new P4_StaticBlocks();
		System.out.println(p.x);
	}
	
	
	static
	{
		age = 50;
		
	}

}
