object rat extends App{
    val r1 = new rational(4)
    val x = r1.neg
    println(x)
} 
class rational(n:Int,d:Int){
    require(d>0, "d must be greater than 0 ")
    def numer=n/gcd(Math.abs(n),d)
    def denom=d/gcd(Math.abs(n),d)
    def this(n:Int) = this(n,1)
    def neg = new rational(-this.numer,this.denom)
    private def gcd(a:Int,b:Int):Int = if (b==0) a else gcd(b,a%b)
    override def toString = numer+"/"+denom     
}