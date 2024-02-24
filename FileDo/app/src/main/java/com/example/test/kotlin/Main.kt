package com.example.test.kotlin

import kotlin.random.Random

var coures  = arrayOf(18 , 19 , 20 ,21 ,22);
var specializeds : ArrayList<Specializeds> = ArrayList()


fun main(){
    specializeds.add(Specializeds("CE" , "computer engineering"))
    specializeds.add(Specializeds("IT" , "Information Technology"))

    var courseSinhvien: Int = randoms(coures.size)
    var specialized: Int = randoms(specializeds.size)

    println("Học sinh")
    var sinhVien: Student = Student("Hồ Bảo Nguyên" , coures.get(courseSinhvien).toString()+specializeds.get(specialized).id , getSpecialized(specialized))
    sinhVien.inThongTin()
    sinhVien.inEmail()
    println("Giáo viên")
    var giaovien: Teacher = Teacher("Nguyễn Văn A")
    giaovien.inThongTin()
    giaovien.inEmail()
}
fun randoms(sizeArray :Int): Int {
    var rd = Random;
    return rd.nextInt(0 , sizeArray-1) ;
}
fun getSpecialized(i :Int): String{
    return specializeds.get(i).nameSpecialized
}
