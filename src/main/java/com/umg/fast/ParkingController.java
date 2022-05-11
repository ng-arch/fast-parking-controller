/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.fast;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nestor Gaitan
 */
@RestController
public class ParkingController {
    
    @PostMapping("parking/controller/info")
    public Map info(@RequestBody Map request){
        Map response=new HashMap();
        response.put("success", true);
        System.out.println("controller info "+request);
        return response;
    }
    
    

    
    
     @PostMapping("parking/controller/login")
    public Map login(@RequestBody Map request){
        System.out.println("controller login "+request);
        //select hacia la base de datos
        Map response=new HashMap();
        response.put("success", true);
        response.put("mensaje","bienvenido al sistema");
        
        return response;
    }
    

    
}
