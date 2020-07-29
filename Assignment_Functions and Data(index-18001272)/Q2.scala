object rat extends App{
    val x = new rational(3,4)
    val y = new rational(5,8)
    val z = new rational(2,7)
    println(x.sub(y).sub(z))    

}

class rational(n:Int,d:Int){
    require(d>0, "d must be greater than 0")

    def numer = n/gcd(Math.abs(n),d)
    def denom = d/gcd(Math.abs(n),d)
    private def gcd(a:Int,b:Int): Int = if(b==0) a else gcd(b,a%b)
    def neg = new rational (-this.numer,this.denom)
    def add(r:rational) = new rational(this.numer*r.denom+r.numer*this.denom,r.denom*this.denom)
    def sub(r:rational) = this.add(r.neg) 
    override def toString(): String = numer+"/"+denom

}