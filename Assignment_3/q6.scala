object seqOfFibb extends App{
    def printFibb(x:Int):Int= {
        if (x==0) 0
        else if (x==1) 1
        else printFibb(x-1)+printFibb(x-2)

    }

    def printFibbSeq(n:Int):Any={
        if (n>0) printFibbSeq(n-1)
        println(printFibb(n))
    }

    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}
    val n = readIntP("Enter a number : ")
    printf("Fibonacci series of first %d caracters\n",n)
    println(printFibbSeq(n))
}