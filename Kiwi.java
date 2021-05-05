package Exe4_4;

public class Kiwi extends Fruit {

	private String brand;
	private double mass;
	private String packet;
    
    public Kiwi(String name, String size, String brand, double mass, String packet){ 			
       super(name,size);  										
       this.brand = brand;
       this.mass = mass;
       this.packet = packet;
       
       switch(packet) {
       case "Piece" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass() + " kg.");
    	   break;
       case "Packet" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass(12) + " kg.");
    	   break;
       case "Box" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass(36,0.10) + " kg.");
    	   break;
       }
     }
    //Overriding method
    public void printData(){ 
    	System.out.println("Size \t\t\t= " + super.getSize());
    }
  	
  	public String brand(){
      return this.brand;
    }
  	
  	//Overloading without parameter
  	public double mass(){
        return this.mass;
    }
  	
  	//overloading with 1 parameter
  	public double mass(int quantity){
		   return this.mass*quantity;
	}
  	
  	//overloading with 2 parameters
  	public double mass(int quantity, double mass){
		   return mass*quantity;
	}
  	
  	//method toString as an overriding method(Fruit class)
  	public String toString() {									
  	  return super.toString() + 
  			  "\nBrand \t\t\t= " + brand();

  	}
	
}
