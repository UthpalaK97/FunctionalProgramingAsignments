object totalSalary extends App{
    def mainSalary(workHrs:Double,otHrs:Double)=workHrs*150+otHrs*75
    def tax(salary:Double)=salary*0.1
    def totalSalary(workHrs:Double,otHrs:Double)= {val sal = mainSalary(workHrs,otHrs);sal-tax(sal)}

  //  printf("%d",totalSalary(40.20))
    

    def readIntP(s:String)={printf("%s",s);scala.io.StdIn.readInt()}
    val workHrs=readIntP("work hours : ")
    val otHrs=readIntP("ot hours : ")
    println(totalSalary(workHrs,otHrs))
}

