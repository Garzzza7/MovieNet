package com.example.movienet

class MovieDao: Dao {
    var hashMap : HashMap<String, Float>

    constructor(){
            hashMap= HashMap()
            hashMap.put("geas",0f)
            hashMap.put("jojo1",0f)
            hashMap.put("jojo5",0f)
    }


    override fun get_value(id:String): Float? {
        return hashMap.get(id);
    }
    override fun getAll(id:String): HashMap<String, Float> {
        return hashMap;
    }
    override fun save(s:String,i:Float){
        hashMap[s] = i;
    }
    override fun update(s:String,i:Float){
        hashMap.replace(s,i);
    }
    override fun delete(s:String){
        hashMap.remove(s);
    }
}