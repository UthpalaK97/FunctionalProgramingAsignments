object additionOfN extends App{
    def sumOfN(x:Int):Int= x match {
        case x if (x==1) => 1
        case _ => x+sumOfN(x-1)
    }
    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}
    val n = readIntP("Enter a number : ")


    println(sumOfN(n))

}