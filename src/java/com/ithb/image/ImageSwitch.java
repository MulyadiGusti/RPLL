/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.image;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mulyadi
 */

@ManagedBean
public class ImageSwitch {
    
    
    private List<String> images;  
  
    public ImageSwitch() {  
        images = new ArrayList<String>();  
        images.add("gambar1.png");  
        images.add("gambar2.png");  
        images.add("gambar3.png");  
       
        
        System.out.println(images);
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
}
