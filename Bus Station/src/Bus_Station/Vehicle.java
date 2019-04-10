/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;

import java.util.Set;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 *
 * @author Lenovo
 */
public class Vehicle {
    private Boolean Available=true;
    private float factor;


    public Boolean getAvailable() {
        return Available;
    }

    public float getFactor() {
        return factor;
    }

    
    public void setFactor(float factor) {
        this.factor = factor;
    }

}

class Limo extends Vehicle
        {

    @Override
    public void setFactor(float factor) {
        super.setFactor((float) 1.2); //To change body of generated methods, choose Tools | Templates.
    }
         
        }
class MiniBus extends Vehicle
        {
    
        }
class Bus extends Vehicle
        {
    
        }   