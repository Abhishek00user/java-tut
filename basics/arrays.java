class Student
{
	int rollno;
	String name;
	int marks;	
}
public class arrays {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        
        // int nums[][]=new int [3][4]; multidimensional array
        // Drawbacks:-
        // - The memory allocation is contiguous.
        // - The size of an array is fixed. Array size cannot be expand.
        // - Searching takes time.
        // - Array can store values of only same type. It can store homogeneous type value only.
    }
}
