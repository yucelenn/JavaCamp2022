package kodlamaIo.dataAccess.course;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("jdbc ile veritabanına eklendi: " + course.getCourseName());
    }

}
