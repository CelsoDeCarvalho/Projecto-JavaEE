/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.sidratech;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author celso
 */
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
    
    public MyApplication(){
        packages("mz.com.sidratech.controller");
    }
    
}
