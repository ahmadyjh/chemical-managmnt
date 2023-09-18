package com.project.chemical.management.service;

import com.project.chemical.management.model.Customer;
import com.project.chemical.management.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CustomerServices {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer, MultipartFile businessLicenceFile, MultipartFile tinNOFile) throws IOException {
        // Set customer fields
        customer.setBusinessLicence(businessLicenceFile.getBytes());
        customer.setTinNO(tinNOFile.getBytes());

        customerRepository.save(customer);
    }
}
