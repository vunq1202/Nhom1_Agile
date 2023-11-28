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
            public QLSV(){
            list.add(new SinhVien("Ph45620", "SD18405","Nguyễn Văn A", "0123453789", "11/02/2004", "anh4.jpg", "HN", "Nam", "APH45620@gmail.com"));
            list.add(new SinhVien("Ph45621", "SD18403","Nguyễn Văn B", "0123345789", "12/06/2004", "NO AVATAR", "HN", "Nam", "BPH45621@gmail.com"));
            list.add(new SinhVien("Ph45622", "SD18405","Nguyễn Thị C", "012345589", "13/05/2004", "anh1.PNG", "HCM", "Nữ", "CPH45622@gmail.com"));
            list.add(new SinhVien("Ph45623", "SD18403","Nguyễn Văn D", "0123456789", "13/02/2004", "anh2.jpg", "HP", "Nam", "DPH45623@gmail.com"));
            list.add(new SinhVien("Ph45624", "SD18403","Nguyễn Văn E", "01234344789", "05/05/2004", "anh3.jpg", "VP", "Nam", "EPH45624@gmail.com"));
            list.add(new SinhVien("Ph45625", "SD18404","Nguyễn Trần F", "0123636789", "02/07/2004", "NO AVATAR", "ND", "Nam", "FPH45625@gmail.com"));
            
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
