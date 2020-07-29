object Bank extends App{
    var acc1 = new account("918541361V",123456789 , 54239.12)
    var acc2 = new account("971881361V",123456790 , -1254.02)
    var acc3 = new account("941681343V",123456791 , -11000.22)
    var acc4 = new account("984224422V",123456792 , 11230.95)
    var acc5 = new account("951931369V",123456793 , 22345.66)
    var acc6 = new account("971885464V",123456794 , 100.10)
    var acc7 = new account("951531351V",123456795 , -1589.70)
    var bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6,acc7)
    
  
   
    //question 4.1
   val oDaccounts = bank.filter(x=>x.accBalance<0)
   
   println("List of OD accounts->\n ")
   for(element<-oDaccounts){
     println(element)        
   }
   
   println("\n")
   //question 4.2
   var balanceList = bank.map(x=>x.accBalance)
   val totalCredit = balanceList.reduce((x,y) =>x+y)
   println("Total Balance ->\n ")
   println(totalCredit)
   
   println("\n")
   //question 4.3
  
   bank.map(x=>if(x.accBalance>0) x.accBalance=(x.accBalance)*1.05 else x.accBalance=(x.accBalance)*1.1)
   println("Account Balances After Adding Intrest ->\n")
   for(element<-bank){
    println(element)        
   }
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
    
    def transfer(acc:account,amount:Double)= {
        this.accBalance=this.accBalance-amount 
        acc.accBalance=acc.accBalance+amount           
        if (this.accBalance<0) println("account overdraft")
    }             
        
    override def toString = NIC+"  "+accNo+"  "+accBalance

}