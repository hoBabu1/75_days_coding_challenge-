public class comparing_objects {
    public static class Student implements Comparable<Student>
    {
        int roll ;
        int age ;
        public Student(int r , int age )
        {
            this.roll = r;
            this.age = age;
        }
        @Override
        public int compareTo(Student o)
        {
            // replace age with what u want to compare 
            return (int)(this.age-o.age);
        }
    }
    public static void main(String args[])
    {

        Student aman = new Student(03 , 20);
        Student shanu = new Student(1 , 22);
        if(aman.compareTo(shanu)==0)
        {
            System.out.println("same age");
        }
        else if(aman.compareTo(shanu)>0)
        {
            System.out.println("aman is older than shanu");
        }
        else 
        {
            System.out.println("Shanu is older than Aman");
        }
    }
   
    
}
