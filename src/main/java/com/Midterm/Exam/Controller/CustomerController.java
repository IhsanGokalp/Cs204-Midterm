package com.Midterm.Exam.Controller;

import com.Midterm.Exam.Dao.CustomerCreateDao;
import com.Midterm.Exam.Dao.CustomerReturnDao;
import com.Midterm.Exam.Dao.CustomersDao;
import com.Midterm.Exam.Entity.Customer;
import com.Midterm.Exam.Service.CustomerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @ModelAttribute(name = "customer")
    public CustomersDao customersDao() {
        return new CustomersDao();
    }

    @GetMapping
    private String listCustomers(Model model) {
        System.out.println("there");
        List<CustomerReturnDao> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/newCustomer")
    private String newCustomer() {
        return "newCustomerForm";
    }
    @PostMapping("/newCustomer")
    private String save(@Valid CustomerCreateDao customer, Errors errors) {
        if (errors.hasErrors())
            return "newCustomerForm";
        System.out.println("here");
        customerService.save(customer);
        return "redirect:/customers";
    }
}