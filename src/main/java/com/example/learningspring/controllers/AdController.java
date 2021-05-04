package com.example.learningspring.controllers;
import com.example.learningspring.models.Ad;
import com.example.learningspring.repositories.AdRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
// look up more on dependency injection
@Controller
public class AdController {
//refactor with GetPostMapping or Request Mapping
  // Constructor dependency injection (instance of repo to have access to methods within this controller
  private final AdRepo adsDao; //look up the uses of FINAL.
//doesnt have to be adsDao but its basically equal to DAO in JAVA && SQL. It is how you access and make changes to the database.
  public AdController(AdRepo adsDao) {
    this.adsDao = adsDao;
  }

  @GetMapping("/ads")
  @ResponseBody
  public List<Ad> getAllAds() {
    return adsDao.findAll();
  }
// this will give JSON formatted list of all of your adds printed.  You dont want to do that.

  @GetMapping("/ads/{id}")
  public String getOneAd(@PathVariable long id, Model vModel) { //passed model object a parameter
    // get ad from dao then put in vModel
    Ad ad = adsDao.getOne(id); //got ad by ID and passed into a method
    //review this and then retry roll dice exercise.
    vModel.addAttribute("ad", ad);
    return "ads/show";
  }
// Model is not needed it can be called anything
  @GetMapping("/ads/delete")
  public String deleteAd( ) { //make sure that delete button has correct form action for delete.
    // delete ad
    adsDao.deleteById(4L);
    return "redirect:/ads"; // redirect to "/ads"
  }

  @GetMapping("/ads/create")
  public String createAd() {
    Ad ad = new Ad(
      "Unicorn",
      "It is a very small unicorn",
      2000
    );
    adsDao.save(ad);
    return "redirect:/ads";
  }

  @GetMapping("/ads/update")
  public String updateAd() {
    Ad updatedAd = new Ad(
      101,
      "Dragon",
      "It is a dragon.",
      200
    );
    adsDao.save(updatedAd);
    return "redirect:/ads";
  }



}
