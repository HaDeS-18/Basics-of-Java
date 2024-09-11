// Demonstration of array of objects

class Student45
{
    String name;
    int rollno;
    Student45(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
}

public class Pgm45 
{
    public static void main(String args[]) {
        Student45[] st = new Student45[6];
        st[0] = new Student45("Harsh", 1);
        st[1] = new Student45("Parth", 2);
        st[2] = new Student45("Pratik", 3);
        st[3] = new Student45("Priyanshi", 4);
        st[4] = new Student45("Shubh", 5);
        st[5] = new Student45("Lalit", 6);

        for(int i=0; i<st.length; i++)
        {
            System.out.println("Name : "+st[i].name+" Roll No. : "+st[i].rollno);
        }
    }
}
