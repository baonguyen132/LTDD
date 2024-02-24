package com.example.test.kotlin
import java.text.Normalizer
import java.util.regex.Pattern
class Student: Person,TaoThongTin {
    private  var classSinhVien: String
    private  var specialized: String
    private var chucVuTrongLop: String ;

    constructor(fullnames: String, classSinhVien: String ,specialized: String , chucVuTrongLop: String = "không có" ) : super(fullnames) {
        this.classSinhVien = classSinhVien
        this.specialized = specialized
        this.email = taoEmail()
        this.chucVuTrongLop = chucVuTrongLop
    }
    override fun taoEmail(): String {
        var sChange: String = this.fullnames
        sChange = sChange.lowercase()
        //xoá dấu
        sChange = Normalizer.normalize(sChange , Normalizer.Form.NFD)
        var p: Pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
        sChange = p.matcher(sChange).replaceAll("")

        var sArray = sChange.split(" ")
        var email = sArray[sArray.size-1]
        if(sArray[1] != null){
            for (i in 0 .. sArray.size -2){
                email += sArray[i].first()
            }
        }
        return  email+"."+classSinhVien.lowercase()+"@vku.udn.vn"
    }
    override fun inEmail(){
        println("Email của học sinh " + this.fullnames + "là: " +this.email)
    }
    override fun inThongTin(){
        println(this.fullnames+"-"+this.classSinhVien+"-"+this.specialized + "-" + this.email + "-" + "chức vụ: " +this.chucVuTrongLop)
    }
}