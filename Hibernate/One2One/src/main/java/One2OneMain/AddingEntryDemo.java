package One2OneMain;
import OneToOne.Student;
import OneToOne.StudentGfgDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class AddingEntryDemo {

	public static void main(String[] args)
	{

		// Create session factory
		SessionFactory factory
			= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentGfgDetail.class)
				.buildSessionFactory();

		// Create session
		try ( Session session = factory.getCurrentSession()) {
			// Get the current session

			// Create relevant object.
			Student student = new Student("keerthi", "Ettamsethi","keerthi@gmail.com");
			
			StudentGfgDetail studentGfgDetail = new StudentGfgDetail("PES College", 20);

			student.setStudentGfgDetail(studentGfgDetail);

			// Begin the transaction
			session.beginTransaction();

			// Save the student object.
			// This will also save the StudentGfgDetail
			// object as we have used CascadeType.ALL
			session.save(student);

			// Commit the transaction
			session.getTransaction().commit();

			System.out.println(
				"Transaction Successfully Completed!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}