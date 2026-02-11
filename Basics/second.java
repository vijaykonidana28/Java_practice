// This is for command line arguments
class second
{
    //public static void main(String args[]) can be written like this also
    public static void main(String[] args)
    {
        //length = args.length used for optimization
        // if we use this, then forloop should be for(int i=0; i<length;i++) 
        for(int i=0; i<args.length;i++)
        {
            System.out.println(i+1+" "+args[i]);
        }
    }
}