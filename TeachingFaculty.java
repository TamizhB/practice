package sample;


class TeachingFaculty<T,S> extends Faculty<T,S>
{
	@Override
	public void setSalary(T val) {
		System.out.println("Hi i am in teaching faculty");
		salary = val;
		//super.setSalary(val);
		//super.setSalary(val);
	}
	public  T ShowSalary()
	   {
		   return super.getSalary();
	   }
	
	public  S ShowCourse()
	   {
		   return super.getCourse();
	   }
}
