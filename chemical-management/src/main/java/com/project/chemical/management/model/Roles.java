package com.project.chemical.management.model;

import com.project.chemical.management.enums.RoleType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Enumerated
    private RoleType roleType;

    @OneToMany(mappedBy = "role") // One role can have many customers, mappedBy points to the field in Customer class
    private List<Customer> customers; // You can also use Set<Customer> for a collection
}
