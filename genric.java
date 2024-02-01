class Shape<T>
{
private T data;

Shape(T data) 
{
this.data = data;
  }

public T getData() 
{
return this.data;
  }
 }

class T
{
public static void main(String[] args) 
{


Shape<Integer> obj = new Shape<Integer>(5);
System.out.println(obj.getData());

Shape<String> ob = new Shape<String>("Ram");   // Compile Time Error
System.out.println(ob.getData());
  }
}
