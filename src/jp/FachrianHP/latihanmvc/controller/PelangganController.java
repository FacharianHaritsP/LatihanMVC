/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.FachrianHP.latihanmvc.controller;

import javax.swing.JOptionPane;
import jp.FachrianHP.latihanmvc.model.PelangganModel;
import jp.FachrianHP.latihanmvc.view.PelangganView;

/**
 * NIM   : 10117061
 * NAMA  : Fachrian Harits Pratama
 * KELAS : IF-2
 * 
 * @author Notebook
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
public void resetForm(PelangganView view){

    String nama = view.getTxtNama().getText();
    String email = view.getTxtEmail().getText();
    String noTelp = view.getTxtTelp().getText();
    
    if ( nama.equals("") && email.equals("") && noTelp.equals("") ){
    
    }else{
     model.resetForm();
    }
    
 
}    

public void simpanForm(PelangganView view){

    String nama = view.getTxtNama().getText();
    String email = view.getTxtEmail().getText();
    String noTelp = view.getTxtTelp().getText();

 if(nama.trim().equals("")){
 
     JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
 
 }else if(email.trim().equals("")){
 
     JOptionPane.showMessageDialog(view, "Email Masih Kosong");
 }else if(noTelp.trim().equals("")){
 
     JOptionPane.showMessageDialog(view, "Nomor Masih Kosong");
 }else{
 model.simpanForm();
 }

}

}
