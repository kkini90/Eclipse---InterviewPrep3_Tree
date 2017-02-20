package com.usc.ctcl.tree;

public class MySingleton {
	 //Step1 - static type because myObj is returned by static method getInstance()
	 private static MySingleton myObj;
	    /**
	     * Create private constructor
	     *  A private Constructor prevents any other
	     * class from instantiating.
	     */
	//Step2
	 private MySingleton(){
         
	    }
	    /**
	     * Create a static method to get instance.
	     */
	//Step3 - static method
	    public static MySingleton getInstance(){
	        if(myObj == null){
	            myObj = new MySingleton();
	        }
	        return myObj;
	    }
	     
	    public void getSomeThing(){
	        System.out.println("I am here....");
	    }
	     
	    public static void main(String a[]){
	        MySingleton st = MySingleton.getInstance();
	        st.getSomeThing();
	    }
}
//https://www.youtube.com/watch?v=KUTqnWswPV4

// make synchronized block
//http://www.javacoffeebreak.com/articles/designpatterns/

//thread safe singleton class
//http://crunchify.com/thread-safe-and-a-fast-singleton-implementation-in-java/
//http://www.java67.com/2015/09/thread-safe-singleton-in-java-using-double-checked-locking-pattern.html

//imp
//http://www.javaworld.com/article/2077377/java-concurrency/singletons-with-needles-and-thread.html