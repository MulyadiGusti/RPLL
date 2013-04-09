/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Pengumuman;
import com.ithb.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

/**
 *
 * @author Lydia
 */
@ManagedBean
@RequestScoped
public class DosenController {

    /**
     * Creates a new instance of DosenController
     */
    private Session sess;
    private List<Pengumuman> pengumumanList;
    
    private String output;
    
    public DosenController() {
        
        sess = HibernateUtil.getSessionFactory().openSession();
        pengumumanList = sess.createQuery("from Pengumuman where kodePengumuman like 'PDOS%'").list(); 
    }

    public List<Pengumuman> getPengumumanList() {
        return pengumumanList;
    }

    public void setPengumumanList(List<Pengumuman> pengumumanList) {
        this.pengumumanList = pengumumanList;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
    
    
}
