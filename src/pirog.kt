fun main() {
        println("1-пироженки, 2-автомобиль")
        var x = readln()!!.toInt()
        when (x)
        {
        1->{
                val pirog1 = Pirognie("Сдоба с клубникой", "Сдобное", "Клубничный джем", 0.3, 2.3, 30)
                var pirog2 = Pirognie("Сдоба с малиной")
                pirog1.name()
                pirog1.testo1("")
                println(pirog1.Infor())

                pirog2.vvod()
                pirog2.testo1("")
                println(pirog2.Infor())
        }
2-> {
        var auto1 = avto("KIA", 100.0, 3500000)
        var auto2 = avto("")

        auto1.name1()
        auto1.mosh1("")
        println(auto1.Infor())

        auto2.vvod()
        auto2.mosh1("")
        println(auto2.Infor())
}
}
}