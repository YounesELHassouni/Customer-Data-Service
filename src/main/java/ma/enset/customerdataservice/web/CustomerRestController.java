package ma.enset.customerdataservice.web;

import lombok.AllArgsConstructor;
import ma.enset.customerdataservice.entities.Customer;
import ma.enset.customerdataservice.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerRepository customerRepository;
    //private Customer customer;

    @GetMapping("/customers")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
    @GetMapping("/customers/{id}")
    public Customer customerById(@PathVariable Long id){
        return customerRepository.findById(id).get();
    }
    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        //this.customer = customer;
        customerRepository.save(customer);
        return customer;
    }
}
