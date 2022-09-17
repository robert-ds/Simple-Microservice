package org.robert.Resource;

import org.robert.Model.UserProfile;
import org.robert.Service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 17/9/22
 * Time: 3:08 p. m.
 */

@Path("/Profile")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class ProfileResource {

  ProfileService messageService = new ProfileService();

  @GET
  public List<UserProfile> getProfile(){
    return messageService.getAllProfile();
  }

  @GET
  @Path("/{ProID}")
  public UserProfile getProfile(@PathParam("ProID")long Id){
    return messageService.getProfile(Id);
  }

  @POST
  public UserProfile addProfile(UserProfile profile){
    return messageService.addProfile(profile);
  }

  @PUT
  @Path("/{proID}")
  public UserProfile UpdateProfile(@PathParam("proID")long Id, UserProfile UserProfile){
    UserProfile.setProId(Id);
    return messageService.UpdateProfile(UserProfile);
  }

  @DELETE
  @Path("/{ProID}")
  public void deleteProfile(@PathParam("ProID")long Id){
    messageService.RemoveProfile(Id);
  }

}
