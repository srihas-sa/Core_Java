package Reflection;

import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

class Aclass {
  public void hello() {
    System.out.println("hello");
  }

  private void hello1() {
    System.out.println("hello12");
  }
}

public class Ref {
  public static void main(String[] args) throws ClassNotFoundException {
    Class obj = Aclass.class;

    System.out.println(obj.getName());
    System.out.println(obj.descriptorString());
    Method[] omet = obj.getMethods();
    for (Method obj2 : omet) {
      System.out.println(obj2.getName());
    }

  }
}
