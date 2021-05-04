package com.example.learningspring.models;
import javax.persistence.*;
// data base table, basically the same as your MYSQL tables.
@Entity
@Table(name = "ads")
public class Ad {
// line 8 thru 18 is creating a table, the @ is JPA annotation
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
// all tables with an ID will look like lines 8 & 9 ^^ same as defining Primary Key in Java
  @Column(nullable = false)
  private String title;

  @Column(nullable = false, columnDefinition = "TEXT")
  private String description;

  @Column(nullable = false)
  private int priceInCents;

  public Ad() {
  }
//have to have an empty constructor to prevent an error

  public Ad(String title, String description, int priceInCents) {
    this.title = title;
    this.description = description;
    this.priceInCents = priceInCents;
  }
  //at least one constructor with every property besides the ID


  public Ad(long id, String title, String description, int priceInCents) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.priceInCents = priceInCents;
  }
  //at least one constructor with every property

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public void setPriceInCents(int priceInCents) {
    this.priceInCents = priceInCents;
  }
}
