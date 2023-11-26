/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienView;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QLSV {
    List<SinhVien> list = new ArrayList<>();
    public List<SinhVien> getlstSV(){
    return list;
    }
            
    public SinhVien getSVbyID(String ID){
        for (SinhVien sinhVien : list) {
            if (sinhVien.getID().equalsIgnoreCase(ID)) {
                return sinhVien;
            }
        }
    return null;
    }
}
