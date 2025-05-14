package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

//@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CustomAnnotaion1 {
}

@CustomAnnotaion1
class hello {
}

class hello1 extends hello {

}

public class Retention12 { // <-- renamed class here
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Class<hello1> obj = hello1.class;
    Class obj1 = new hello1().getClass();

    if (obj1.isAnnotationPresent(CustomAnnotaion1.class)) {
      System.out.println("CustomAnnotaion1 is present on class hello.");
    } else {
      System.out.println("CustomAnnotaion1 is NOT present on class hello.");
    }
  }
}
