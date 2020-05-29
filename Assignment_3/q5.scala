object sumOfEven extends App{
    def isEven(x:Int):Boolean = x match{
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(x:Int):Boolean = !(isEven(x))

    def sumOfEven(x:Int):Int = x match{
        case x if(x==0) => 0
        case x if (isEven(x)) => x+sumOfEven(x-1)
        case _ => sumOfEven(x-1)

    }
    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}
    val n = readIntP("Enter a number : ")
    println("Sum of Even numbers : ")
    println(sumOfEven(n))
} 