package org.robert.DAO;

import org.robert.Model.UserProfile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 17/9/22
 * Time: 3:05 p. m.
 */

public class DataBaseClass {
  private static Map<Long, UserProfile> messages = new HashMap<Long,UserProfile>();

  public static Map<Long,UserProfile> getUsers(){
    return messages;
  }

}
