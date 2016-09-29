package p2;

public class Skeleton {}

 /**
  * @author xionglei
  */

  class A {
	void take(B b){}
  }

  class B{}
 
  /**
   * C depends on D
   */
  
  class C extends A{
	  void take(D d){}
  }
  
  
  /**
   * D associates with B, has composition with F 
   */
  class D {
	  B b;
	  F[] f= new F[5];
  }

  
  class E extends C{ }
  
 /**
   * F has composition with D
   */
  class F{
       D[] d= new D[2];
  }
  
