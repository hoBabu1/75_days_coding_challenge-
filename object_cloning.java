public class object_cloning {
    public static class Human implements Cloneable
    {
        int age;
        String name ;
        public Human(int age , String name )
        {
            this.age = age ;
            this.name = name ;
        }
        public Object clone() throws CloneNotSupportedException
        {
            return super.clone();

        }
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Human obj = new Human(22,"hoBabu");
        Human twin =  (Human)obj.clone();
        System.out.println(twin.name +" "+twin.age);

    }
    
}
