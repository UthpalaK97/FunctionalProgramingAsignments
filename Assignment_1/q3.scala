object totalCost extends App{
    def cost(x:Double):Double=x*24.95
    def totaldiscount(x:Double):Double=24.95*0.4*x
    def shipping(x:Double):Double=if(x<=50) 3 else 3+(0.75*(x-50))
    def total(x:Double):Double=cost(x)-totaldiscount(x)+shipping(x)

    println(total(60))
    
}