package kodlamaIo.dataAccess.instructor;

import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("hibernate ile veritabanına eklendi: " + instructor.getInstructorName());
    }

}
