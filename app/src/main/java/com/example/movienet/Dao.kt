package com.example.movienet

interface Dao {
    fun get_value(id:String): Float?
    fun getAll(id:String): HashMap<String, Float>
    fun save(s:String,i:Float)
    fun update(s:String,i:Float)
    fun delete(s:String)
}