import java.util.Scanner;
class studentGrade
{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        float avg;
        int total=0,i;
		System.out.println("Enter the number of subjects");
        int n=sc.nextInt();//takes the input of number of subjects
        int marks[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the marks of subject"+(i+1));
            marks[i]=sc.nextInt();
		
        total=total+marks[i];
		}
		System.out.println("Total marks of the student="+total);
        avg=total/n;
		System.out.println("The Average percentage of the student="+avg);
        if(avg>=80)
        {
            System.out.println("A Grade");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.println("B Grade");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("D Grade");
        }

    }

    }

