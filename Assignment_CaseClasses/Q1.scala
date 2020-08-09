object caseClass extends App{

    case class point(a : Int , b :Int){
        def x : Int = a
        def y : Int = b
        //question 1
        def +(p:point) = new point(this.x+p.x,this.y+p.y)
        //question 2
        def move(dx:Int , dy:Int)= point(this.x+dx, this.y+dy)
        //question 3
        def distance(p:point) = (Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2)))
        //question 4
        def invert() = new point(this.y, this.x)
        
    }
     val p1=point(1,2) 
     val p2=point(2,3)
     val p3=point(5,6)
     val p4=point(7,1)
     val p5=point(6,1)
     
     println("Add 2 points p1+p2")
     println(p1)
     println(p2)
     println(p1+p2)

     println("\n")
     println("Move point (5,6) by dx=3 and dy=7")
     println(p3)
     println(p3.move(3,7))

    println("\n")
    println("Distance between two poinrs (6,1) and (7,1) ")
    println(p5)
    println(p4)
    println(p5.distance(p4))
    println("\n")
    println("Invert point (5,6)")
    println(p3)
    println(p3.invert())

     
     


    
   
}