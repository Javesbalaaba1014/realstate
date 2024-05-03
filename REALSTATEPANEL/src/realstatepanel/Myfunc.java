/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realstatepanel;

/**
 *
 * @author My Computer
 */

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Myfunc {
    public ImageIcon resizePic (String picPath,byte[] BLOBpic, int wdth , int hgt){
        
        ImageIcon myImg;
        if(picPath != null){
            myImg = new ImageIcon(picPath);
        }else{
            myImg = new ImageIcon(BLOBpic);
        }
        
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        
        ImageIcon myPicture = new ImageIcon(img);
        return myPicture;
    }
    
    public String browseImage(JLabel lbl ){
        
        String path = "";
    // TODO add your handling code here:
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        
//        file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Image","jpg" , "png", "gif");
        filec.addChoosableFileFilter(fileFilter);
        
        int fileState = filec.showSaveDialog(null);
        
        //is the user select a fileasd
        if (fileState == JFileChooser.APPROVE_OPTION ){
            File seletedFile = filec.getSelectedFile();
            path = seletedFile.getAbsolutePath();
            //pth = path;
                    
            lbl.setIcon(resizePic(path,null , lbl.getWidth(), lbl.getHeight()));
            
//            jLabelPic.setIcon(new ImageIcon(path));
        }
        
        else if (fileState == JFileChooser.CANCEL_OPTION){
            System.out.println("No Image Selected");
        }
        return path;
        
    }
}

