package kodlamaIo.dataAccess.category;

import kodlamaIo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("hibernate ile veritabanına eklendi: " + category.getCategoryName());
    }

}
