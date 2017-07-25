//package com.example.demo.model;
//
//import javax.persistence.*;
//import java.util.Set;
//
///**
// * Created by indianic on 24/7/17.
// */
//@Entity
//@Table(name = "role")
//public class Role {
//    private Long id;
//    private String name;
////    @ManyToMany(mappedBy = "roles" , targetEntity = User.class)
////    private Set<User> users;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
////    @ManyToMany(mappedBy = "roles", targetEntity = User.class)
////    public Set<User> getUsers() {
////        return users;
////    }
////
////    public void setUsers(Set<User> users) {
////        this.users = users;
////    }
//}
