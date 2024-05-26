package ma.enset.customerdataservice.repositories;

import ma.enset.customerdataservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
