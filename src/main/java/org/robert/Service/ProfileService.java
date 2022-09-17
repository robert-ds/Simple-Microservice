package org.robert.Service;

import org.robert.DAO.DataBaseClass;
import org.robert.Model.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 17/9/22
 * Time: 3:09 p. m.
 */


public class ProfileService {

  private Map<Long, UserProfile> Userprofiles = DataBaseClass.getUsers();

  // Predefine profile and populating the same in the map
  public ProfileService(){

    UserProfile m1 = new UserProfile(1L,"Robert","Vásquez","MyService.com");
    UserProfile m2 = new UserProfile(2L,"Paola","Perez","MyService.com");
    UserProfile m3 = new UserProfile(3L,"Gabriel","Martinez","MyService.com");
    UserProfile m4 = new UserProfile(4L,"Juana","Campos","MyService.com");

    Userprofiles.put(1L, m1);
    Userprofiles.put(2L, m2);
    Userprofiles.put(3L, m3);
    Userprofiles.put(4L, m4);

  }

  // Method to fetch all profile
  public List<UserProfile> getAllProfile(){
    List<UserProfile> list = new ArrayList<UserProfile>(Userprofiles.values());
    return list;
  }

  // Method to fetch only one profile depending on the ID Provided
  public UserProfile getProfile(long id){
    return Userprofiles.get(id);
  }

  // Method to add profile
  public UserProfile addProfile(UserProfile UserProfile){
    UserProfile.setProId(Userprofiles.size() +1);
    Userprofiles.put(UserProfile.getProId(), UserProfile);
    return UserProfile;
  }

  // Method update Profile
  public UserProfile UpdateProfile(UserProfile UserProfile){

    if(UserProfile.getProId() <= 0){
      return null;
    }else{
      Userprofiles.put(UserProfile.getProId(), UserProfile);
      return UserProfile;
    }
  }

  // Method to delete Profile
  public void RemoveProfile(long Id){
    Userprofiles.remove(Id);
  }

}
