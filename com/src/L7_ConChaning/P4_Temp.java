package L7_ConChaning;

public class P4_Temp {
	//block to be execute before any constructor
	{
		System.out.println("init block");
	}
	
	//no-args constructor
	P4_Temp(){
		System.out.println("default");
	}
	
	//con with args
	P4_Temp(int x){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new P4_Temp();
		new P4_Temp(10);
	}

}
