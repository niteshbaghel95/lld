package testJAVA;

public class test
{
    public static void main(String arg[])
{
    System.out.println("hello world");
    User u1 = new User();
    u1.setId(10);
    u1.setName("Nitesh");
    System.out.println(u1.getName() + u1.getId());
}
}