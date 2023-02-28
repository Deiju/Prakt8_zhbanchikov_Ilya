class avto(_name1:String) {
    var name1:String="KIA"
    var mosh:Double=100.0
    var stoimost:Int=3500000
    constructor(_name1:String,_mosh:Double,_stoimost:Int):this(_name1)
    {
        name1=_name1
        mosh=_mosh
        stoimost=_stoimost
    }
    fun vvod(){
        println("Name1")
        name1= readln()!!.toString()
        println("Mosh")
        mosh =readln()!!.toDouble()
        println("stoimost")
        stoimost= readln()!!.toInt()
    }
    fun mosh1(mosh1:String){
        println("$name1 имеет мощность: $mosh")
    }
    fun name1(){
        println("name is \"$name1\"")
    }
    fun Infor():String{
        return "Марка: $name1\nМощность: $mosh\nстоимость: $stoimost"
    }
}