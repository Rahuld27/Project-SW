package com.company.Assignment;

class Source{

   public static void main(String[] args) {
	   Square s = new Square();
	   s.printNameOfClass();
	   s.oldPrintNameOfClass();
	   
   }
}
@Deprecated
class Rectangle{
	public void printNameOfClass() {
		System.out.println("Rectangle");
	}
	@Deprecated
	public void oldPrintNameOfClass() {
		System.out.println("This was a Rectangle");
	}
}

class Square extends Rectangle{
	@Override     // Will override if conflict is there between super and subclass function
	public void printNameOfClass() {
		System.out.println("Square");
	}
	
	@Deprecated  //Will remove the method from the execution
	public void oldPrintNameOfClass() {
		System.out.println("This was a Square");
	}
}