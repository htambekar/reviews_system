package com.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "displayName")
  private String displayName;
  @Column(name = "emailAddress")
  private String emailAddress;
  @Column(name = "firstName")
  private String firstName;
  @Column(name = "lastName")
  private String lastName;
  @Column(name = "createdAt")
  private Date createdAt;

  public Integer getId() {
    return id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

}