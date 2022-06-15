**DIRECTIONS:** Translate the following Java code to Python to achieve the same results

```java
class G{

   private int x;

   public G() { x=3;}

   public void setX(int val){
      x=val;
   }

   public String toString(){
      return ""+x;
   }
}

class H extends G{

   private int y;

   public H() { y=4;}

   public void setY(int val){
      y=val;
   }

   public String toString() {
      return ""+y+" "+super.toString();
   }
}
```

```java
//test code in the main method

G one = new G();

out.println(one);

one.setX(5);

out.println(one);

H two = new H();

two.setX(-2);

two.setY(11);

out.println(two);
```
