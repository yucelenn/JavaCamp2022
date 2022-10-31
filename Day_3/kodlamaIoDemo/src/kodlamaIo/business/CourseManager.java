package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.course.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {

    private Logger logger;
    private CourseDao courseDao;

    public CourseManager(Logger logger, CourseDao courseDao) {
        this.logger = logger;
        this.courseDao = courseDao;
    }
    
    public void add(Course course){
        //buradan devam et
    }
}
