package com.sap.cap.bookstore7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sap.cds.Result;
import com.sap.cds.Row;
import com.sap.cds.ql.Select;
import com.sap.cds.ql.Upsert;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.ql.cqn.CqnUpsert;
import com.sap.cds.services.ErrorStatuses;
import com.sap.cds.services.ServiceException;
import com.sap.cds.services.persistence.PersistenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cds.gen.sap.capire.bookstore7.Books;
import cds.gen.sap.capire.bookstore7.Books_;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
//@PreAuthorize("isAuthenticated()")
// @RequestMapping("/test-api")
@RequestMapping(value ="/rest")
public class StudentRetrieveController {
    @Autowired
    PersistenceService db;

    // @RequestMapping(method = RequestMethod.GET, value="/allstudent")
    @PreAuthorize("permitAll()")
    @GetMapping("/test-api")
    // @ResponseBody
    public String getAllStudents(@AuthenticationPrincipal User user) {

        return "Hello Rest:" + user.getUsername();
    }
    
    @PreAuthorize("permitAll()")
    @RequestMapping( value = "/test-cds", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    // @ResponseBody
    public List<Books> getAllBooks(@AuthenticationPrincipal User user) {

        System.out.print(user);
        List<Books> rtn = new ArrayList();
        CqnSelect sel = 
            Select.from(Books_.class);
                 

         Result rs = db.run(sel);
        
         for (Row row : rs) {
              Books tmp = row.as(Books.class);
              rtn.add(tmp);
            }
              //rtn = rs.listOf(Books.class);
         
      
     
    return rtn;
                  
  }
  @PreAuthorize("isAuthenticated()")
    @GetMapping("/test-pdf")
    // @ResponseBody
    public List<Books> getPdf() {

        List<Books> rtn = new ArrayList<>();
        CqnSelect sel = Select.from(Books_.class);

         Result rs = db.run(sel);
        rtn = rs.listOf(Books.class);
     
    return rtn;
                  
  }
   @PreAuthorize("permitAll()")
    @GetMapping("/test-job")

    // @ResponseBody
    public List<Books> getJobScheduler() {

        List<Books> rtn = new ArrayList<>();
        CqnSelect sel = Select.from(Books_.class);

         Result rs = db.run(sel);
        rtn = rs.listOf(Books.class);
     
    return rtn;
                  
  }
   @PreAuthorize("permitAll()")
    @RequestMapping( value = "/create-book", method = RequestMethod.POST, 
     consumes = MediaType.APPLICATION_JSON_VALUE, 
     produces = MediaType.APPLICATION_JSON_VALUE)
     @ResponseBody     
    public String createBooks(@RequestBody Books a) {

       
        /*
        CqnUpsert upsert = Upsert.into(Books_.class).entry(myBook);
                 

          Result rs = db.run(upsert);
        
          if(rs.rowCount()>0)
          {
                return rs.single(Books.class);
          }
          else
          {
                return null;
          }
         */
        return "OK:"+a;
      
     
  
  }
}