package M12_Encapsulation;

public class P3_Car {
    private int cost;
    
    public P3_Car(int cost) {
    	
    	if(cost>0) {
    		this.cost=cost;
    	}
    }
    	
    	public int getCost() {
    		return cost;
    	}
    	
    	
    	public void setCost(int cost) {
    		if(cost>0) {
    			this.cost=cost;
    		}
    	
        }
}
