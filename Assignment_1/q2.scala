import scala.math

object volume extends App{
    def calculateVol(x:Double):Double=(4/3)*math.Pi*x*x*x

    println(calculateVol(5))
}