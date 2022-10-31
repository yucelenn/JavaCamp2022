package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.instructor.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {

    private Logger[] loggers;
    private InstructorDao instructorDao;

    public InstructorManager(Logger[] loggers, InstructorDao instructorDao) {
        this.loggers = loggers;
        this.instructorDao = instructorDao;
    }
    
    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getInstructorName());
        }
    }
}
