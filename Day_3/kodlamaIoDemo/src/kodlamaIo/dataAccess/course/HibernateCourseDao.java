package kodlamaIo.dataAccess.course;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("hibernate ile veritabanına eklendi: " + course.getCourseName());
    }

}
