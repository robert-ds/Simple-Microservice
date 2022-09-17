package org.robert.Model;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 17/9/22
 * Time: 3:07 p. m.
 */

public class UserProfile {

  private long ProId;
  private String FName;
  private String LName;
  private String Add;

  public UserProfile(){}

  public UserProfile(long ProId, String FName, String LName, String Add){
    this.ProId = ProId;
    this.FName = FName;
    this.LName = LName;
    this.Add = Add;
  }

  // Getters and Setters

  public long getProId(){
    return this.ProId;
  }

  public void setProId(long ProId){
    this.ProId = ProId;
  }

  public String getFName(){
    return this.FName;
  }

  public void setFName(String FName){
    this.FName = FName;
  }

  public String getLName(){
    return this.LName;
  }

  public void setLName(String LName){
    this.LName = LName;
  }

  public String getAdd(){
    return this.Add;
  }

  public void setAdd(String Add){
    this.Add = Add;
  }

}
