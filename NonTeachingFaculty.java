package sample;


class NonTeachingFaculty<T,S> extends Faculty<T,S>
{
	
	public  T ShowSalary()
	   {
		   return super.getSalary();
	   }
	
	public  S ShowDepartment()
	   {
		   return super.getDepartment();
	   }
}