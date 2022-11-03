package kodlamaIo;

import java.util.ArrayList;
import java.util.List;
import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.category.JdbcCategoryDao;
import kodlamaIo.dataAccess.course.HibernateCourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;

public class Main {

    public static void main(String[] args) throws Exception {

        Course course1 = new Course("Java Kampı", 300);
        Course course2 = new Course("C# Kampı", 250);
        Course course3 = new Course("Javascript Kampı", 200);
        List<Course> courses = new ArrayList<>();

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
        courseManager.add(course1);

        System.out.println("*************************************");

        Category category1 = new Category("Web Yazılım");
        Category category2 = new Category("Mobil Yazılım");
        List<Category> categories = new ArrayList<>();

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
        categoryManager.add(category2);
    }
}
