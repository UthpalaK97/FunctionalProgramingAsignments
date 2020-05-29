object primeSeq extends App{
    def gcd(a:Int, b:Int): Int = b match{
         case 0=>a
         case b if b>a => gcd(b,a)
         case _ => gcd(b,a%b)
     }

    def prime(p:Int, n:Int=2):Boolean = n match{
         case n if (n==p) => true
         case n if gcd(p,n)>1 => false
         case n => prime (p,n+1)
     }

    def primeSeq(x:Int):Int={
        if(x==1) println(x)
        if(prime(x)==false) primeSeq(x-1)         //println(x)
        println(x)
        primeSeq(x-1)
          
    } 


    //primeSeq(10)
    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}
    val n = readIntP("Enter a number : ")
    println("prime number sequence : ")
    println(primeSeq(n))
    

}