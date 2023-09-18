package com.project.chemical.management.model;

import com.project.chemical.management.enums.CustomerType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerID;
    private String name;
    private String phoneNo;
    @Lob
    private byte[] businessLicence;
    @Enumerated
    private CustomerType CustomerType;
    @Lob
    private byte[] tinNO;

    @ManyToOne // Many customers can have one role
    @JoinColumn(name = "role_id") // Define the foreign key column name
    private Roles role;

}
