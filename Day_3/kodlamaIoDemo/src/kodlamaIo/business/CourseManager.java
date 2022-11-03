package kodlamaIo.business;

import java.util.List;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.course.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice()< 0) {
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
        }

        for (Course course_ : courses) {
            if (course.getCourseName().equals(course_.getCourseName())) {
                throw new Exception("Kurs ismi aynı olamaz.");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
