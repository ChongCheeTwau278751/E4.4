package Exe4_4;

public class Apple extends Fruit {

	protected int price;
	protected int quantity;
    
    public Apple(String name, String size, int price, int quantity){		
       super(name,size);  											
       this.price = price;											
       this.quantity = quantity;														
       
       if(this.quantity == 1) {
    	   	System.out.println("Total Amount(purchased) \t= RM" + total());
       	}else if(this.quantity == 12) {
       		System.out.println("Total Amount(1 packet(12 pcs)) \t= RM" + total(12));
       	}else if(this.quantity == 36) {
       		System.out.println("Total Amount(1 box(36 pcs)) \t= RM" + total(36,5));
       	}
     }
    //Overriding method
    public void printData(){ 
        System.out.println("Size \t\t\t= " + super.getSize());
    }
      
     public int getPrice(){
  	    return price;
  	}
     
     public int getQuantity(){
   	    return quantity;
   	}
     	
     //Overloading (no parameter)
     public int total(){
 	    return price*quantity;
    }
     
     //Overloading (1 parameter)
     public int total(int quantity){
 	    return 10*quantity;
    }
     
     //Overloading (2 parameters)
     public int total(int price, int quantity){
    	    return price*quantity;
    }
     
    //method toString as an overriding method(fruit class)
  	public String toString() { 
  	  return super.toString() +
  			  "\nPrice \t\t\t= RM" + price + 
  			  "\nQuantity \t\t= " + quantity;
  	}
}
