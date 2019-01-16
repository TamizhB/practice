package sample;



public class College {
	    public static void main(String args[]) {
	    TeachingFaculty<Integer,String> tf = new TeachingFaculty<Integer,String>();
	    NonTeachingFaculty<Double,String> ntf = new NonTeachingFaculty<Double,String>();
	    tf.setSalary(25000);
	    ntf.setSalary(15000.00);
	    ntf.setDepartment("Logistics");
	    tf.setCourse("Java");
	    System.out.println(tf.ShowCourse());
	    System.out.println(tf.ShowSalary());
	    System.out.println(ntf.ShowDepartment());
	    System.out.println(ntf.ShowSalary());
	    
	 }
	}