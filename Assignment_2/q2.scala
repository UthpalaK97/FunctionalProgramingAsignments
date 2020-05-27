object movieTeator extends App{
    def attendence(tktPrice:Int)=120+(15-tktPrice)*(20/5)

    def income(tktPrice:Int)={val att=attendence(tktPrice); att*tktPrice}

    def cost(tktPrice:Int)={val att=attendence(tktPrice);500+(att*3)}

    def profit(tktPrice:Int)=income(tktPrice)-cost(tktPrice)

    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}

    val tktPrice = readIntP("Ticket price : ")

    println(profit(tktPrice))

   

}