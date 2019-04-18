package com.philomath.basic;
/**
 * compiling with javac creates the byte code that runs on the JVM.
 *  See bytecode is just a bunch of instructions that the JVM interprets. Each bytecode opcode is one byte in length, hence the name bytecode.
 *  
 *  Serialization on the other hand, converts the state of a Java object into a stream of bytes. These bytes are not instructions like bytecode. Primary purpose of Java Serialization is to write an object into a stream, so that it can be transported through a network and that object can be rebuilt again. When there are two different parties involved, you need a protocol to rebuild the exact same object again. Java serialization API just provides you that. Other ways you can leverage the feature of serialization is, you can use it to perform a deep copy.
 *  
 *  https://www.javaworld.com/article/2072752/the-java-serialization-algorithm-revealed.html
 *  https://www.geeksforgeeks.org/externalizable-interface-java/
 *  https://stackoverflow.com/questions/1025513/serialization-and-externalization-in-java
 *  
 *  Externalizable: 
 *  There might be times when you have special requirements for the serialization of an object. For example, you may have some security-sensitive parts of the object, like passwords, which you do not want to keep and transfer somewhere. Or, it may be worthless to save a particular object referenced from the main object because its value will become worthless after restoring.
  
You can control the process of serialization by implementing the Externalizable interface instead of Serializable. This interface extends the original Serializable interface and adds writeExternal() and readExternal(). These two methods will automatically be called in your object's serialization and deserialization, allowing you to control the whole process.

https://dzone.com/articles/are-marker-interfaces-dead
https://stackoverflow.com/questions/1624084/why-is-it-not-possible-to-extend-annotations-in-java
 * @author Anuj Sharma
 *
 */
public class Test extends Employee{
	// base class contructor if not parametrized, is called automatically by child class
		
	{
		System.out.println("Just a block");
	}
	
	Employee e = new Employee();
	
	static {
		System.out.println("Stack block up");
	}
	
	{
		System.out.println("Just a block 2");
	}
	public Test() {
		this("hello"); // this can be used to call an overloaded constructor.
		// this/super must the first statement of the constructor, and can't both this and super
		// be the first statement.
		System.out.println("Inside constructor");
		// uncommenting this will throw stackoverflow error
		//Test t = new Test();
	}
	public Test(String s) {
		System.out.println("Inside constructor with parameter "+s);
		// uncommenting this will throw stackoverflow error
		//Test t = new Test();
		Test.nestedstaticclass t = new Test.nestedstaticclass();
		System.out.println("nested class value : "+t.nestedstaticclassvalue);
	}
	public static void main(String[] args) {
		Test x = new Test();
	
	}
	
	{
		System.out.println("Just a block 3");
	}
	static {
		System.out.println("Stack block down");
	}
	
	class innerclass{
		public innerclass() {
			System.out.println("Inner class is initialized");
			// accessing outer class from inner class even though private variable
			System.out.println("outer class value is: "+Test.this.e.getClass());
			
		}
	}
	
	static class nestedstaticclass{
		int nestedstaticclassvalue = 1;
		public int getValueOfStaticClass() {
			// can't access outside class from static context
			return 1;
		}
	}

}
