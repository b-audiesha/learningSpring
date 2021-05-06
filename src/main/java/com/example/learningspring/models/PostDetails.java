package com.example.learningspring.models;


import javax.persistence.*;

@Entity
@Table(name = "postDetails")
public class PostDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private boolean isAwesome;

  @Column(columnDefinition = "TEXT")
  private String historyOfPost;

  private String topicDescription;

  public PostDetails() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public boolean isAwesome() {
    return isAwesome;
  }

  public void setAwesome(boolean awesome) {
    isAwesome = awesome;
  }

  public String getHistoryOfPost() {
    return historyOfPost;
  }

  public void setHistoryOfPost(String historyOfPost) {
    this.historyOfPost = historyOfPost;
  }

  public String getTopicDescription() {
    return topicDescription;
  }

  public void setTopicDescription(String topicDescription) {
    this.topicDescription = topicDescription;
  }
}
