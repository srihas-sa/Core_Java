package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CustomAnnotaion1 {
}

@CustomAnnotaion1
class hello {
}

public class Retention12 { // <-- renamed class here
  public static void main(String[] args) {
    Class<hello> obj = hello.class;

    if (obj.isAnnotationPresent(CustomAnnotaion1.class)) {
      System.out.println("CustomAnnotaion1 is present on class hello.");
    } else {
      System.out.println("CustomAnnotaion1 is NOT present on class hello.");
    }
  }
}
