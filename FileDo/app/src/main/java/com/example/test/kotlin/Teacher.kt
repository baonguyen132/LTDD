package com.example.test.kotlin

import java.text.Normalizer
import java.util.regex.Pattern

class Teacher: Person, TaoThongTin {
    private var congviec: String ;
    constructor(fullnames: String , congviec: String  = "giangvien") : super(fullnames) {
        this.congviec = congviec
        this.email = taoEmail()
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
        return  email+"@vku.udn.vn"
    }
    override fun inEmail(){
        println("Email của giáo viên " + this.fullnames + "là: " +this.email)
    }
    override fun inThongTin(){
        println(this.fullnames+"-" + this.email + "-" + "công việc: " +this.congviec)
    }


}