package kodlamaIo.dataAccess.category;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("jdbc ile veritabanına eklendi: " + category.getCategoryName());
    }

}
