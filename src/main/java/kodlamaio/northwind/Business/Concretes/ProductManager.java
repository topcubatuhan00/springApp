package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.DataAcess.Abstracts.ProductDao;
import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
