package sample;

class Faculty<T,S>
{
   public T salary; 
   private S department;
   private S course;
public void setSalary(T val)
   {
	   this.salary= val;
   }
   
   public void setDepartment(S dept)
   {
	   this.department=dept;
   }
   public void setCourse(S course)
   {
	   this.course=course;
   }
   public T getSalary()
   {
	   return salary;
   }
   public S getDepartment()
   {
	   return department;
   }
   public S getCourse()
   {
	   return course;
   }
}
