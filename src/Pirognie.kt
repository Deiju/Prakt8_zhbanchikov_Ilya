class Pirognie(_name: String) {
    var name:String="Сдоба с клубникой"
    var testo:String="Сдобное"
    var krem:String="Клубничный джем"
    var ves:Double=0.3
    var kal:Double=2.3
    var cena:Int=30
    constructor(_name: String,_testo:String,_krem:String,_ves:Double,_kal:Double,_cena:Int):this(_name)
    {
        testo=_testo
        krem=_krem
        ves=_ves
        kal=_kal
        cena=_cena
    }
    fun vvod(){
        println("Name")
        name= readln()!!.toString()
        println("Testo")
        testo= readln()!!.toString()
        println("Krem")
        krem= readln()!!.toString()
        println("Ves")
        ves= readln()!!.toDouble()
        println("Kal")
        kal= readln()!!.toDouble()
        println("Cena")
        cena= readln()!!.toInt()
    }
    fun testo1(testo1:String){
        println("$name состоит из $testo")
    }
    fun name(){
        println("name is \"$name\"")
    }
    fun Infor():String{
        return "Пирожное: $name\nТесто: $testo\nКрем: $krem\nВес: $ves\nКалории: $kal\nЦена: $cena"
    }
}