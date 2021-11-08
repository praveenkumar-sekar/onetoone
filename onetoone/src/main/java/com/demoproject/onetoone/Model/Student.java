package com.demoproject.onetoone.Model;

import javax.persistence.*;

@Entity
@Table(name ="Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToOne
    @JoinColumn(name ="address_id",referencedColumnName = "id")
    private Address address;

    public Student(String name,Address address){
        this.name=name;
        this.address=address;
    }




}
