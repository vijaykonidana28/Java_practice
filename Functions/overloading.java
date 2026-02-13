/*Method overloading in Java is a feature that allows a class to have multiple 
methods with the same name but different parameter lists. It is an example of 
compile-time polymorphism (also known as static polymorphism or early binding).  */
class overloading
{
    public static int mul(int a,int b)
    {
        return(a*b);
    } 
    public static int mul(int a,int b,int c)
    {
        return(a*b*c);
    } 
    public static int mul(int a,int b,int c,int d)
    {
        return(a*b*c*d);
    } 
    public static float mul(float x,float y)
    {
        return(x*y);
    }
    public static float mul(float x,float y,float z)
    {
        return(x*y*z);
    }
    public static float mul(int a,float x)
    {
        return(x*a);
    }
    public static float mul(float y,int c)
    {
        return(c*y);
    }
    public static float mul(float x,float y,int b, int d)
    {
        return(x*y*b*d);
    }

    public static void main(String args[])
    {
        int a=13,b=15,c=16,d=45;
        float x=25.13f,y=39.7f,z=57.3f;
        System.out.println("The values are : ");
        System.out.println(mul(a,b));
        System.out.println(mul(a,c,d));
        System.out.println(mul(c,a,d,b));
        System.out.println(mul(x,y,z));
        System.out.println(mul(x,y));
        System.out.println(mul(a,z));
        System.out.println(mul(z,x,d,c));
        System.out.println(mul(c,y));
        System.out.println(mul(x,a));  
    }
}