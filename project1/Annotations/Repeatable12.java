package Annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Customers.class)
@interface Custom {
  String name();
}

@interface Customers {
  Custom[] value();
}

@Custom(name = "bird")
@Custom(name = "bird")
class eagle {
}

public class Repeatable12 {
  public static void main(String[] args) {
    Class<eagle> obj = eagle.class;

    Custom[] annotations = obj.getAnnotationsByType(Custom.class);

    for (Custom annotation : annotations) {
      System.out.println(annotation.name());
    }
  }
}
