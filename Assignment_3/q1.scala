object primeNum extends App{
    def gcd(a:Int, b:Int): Int = b match{
         case 0=>a
         case b if b>a => gcd(b,a)
         case _ => gcd(b,a%b)
     }

  //  println(gcd(5,15))
     def prime(p:Int, n:Int=2):Boolean = n match{
         case n if (n==p) => true
         case n if gcd(p,n)>1 => false
         case n => prime (p,n+1)
     }

     //println(prime(10))
     //println(prime(5))
     def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}

     val p = readIntP("enter prime number : ")
     println(prime(p))
}