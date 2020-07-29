object bank extends App{
  
    var acc1 = new account("971881361V",123456789 , 54239.12)
    var acc2 = new account("971881361V",123456790 , 0)
  
    acc1.transfer(acc2,200000)
    println(acc1)
    println(acc2)
    
}

class account (x:String, y:Int, z:Double){
    val NIC: String = x
    val accNo : Int = y
    var accBalance : Double = z
    def withdraw(amount:Double)= {
        this.accBalance=this.accBalance-amount
        if (this.accBalance<0) println("account overdraft")
    }

    def deposit(amount:Double) = this.accBalance=this.accBalance+amount
    
    def transfer(acc:account,amount:Double)=  {
        this.accBalance=this.accBalance-amount 
        acc.accBalance=acc.accBalance+amount 
        if (this.accBalance<0) println("account overdraft")
    }
    override def toString = NIC+"  "+accNo+"  "+accBalance

}