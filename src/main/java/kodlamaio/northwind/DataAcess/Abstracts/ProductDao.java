package kodlamaio.northwind.DataAcess.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
