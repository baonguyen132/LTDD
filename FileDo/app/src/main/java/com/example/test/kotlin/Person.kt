package com.example.test.kotlin

abstract class Person {
    protected var fullnames: String
    protected lateinit var email: String
    constructor(fullnames : String) {
        this.fullnames = fullnames
    }

    abstract fun inThongTin() ;
    abstract fun inEmail() ;
}