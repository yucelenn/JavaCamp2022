package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;


public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır.
        System.out.println("hibernate ile veritabanına eklendi.");
    }
}
