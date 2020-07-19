object CeasarCipher extends App{
    val alphabet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ"
   
    val encryption = (c : Char , key : Int , a : String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    val decryption = (c : Char , key : Int , a : String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
    
    val cipher = (algo : (Char, Int, String)=> Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a))
    
    
    val text = scala.io.StdIn.readLine("Massage : ")
    val keyVal = (scala.io.StdIn.readLine("Key : ").toInt+alphabet.size)%alphabet.size
    val mode= scala.io.StdIn.readLine("Encryption(E) / Decryption(D) : ").toUpperCase()
   
   
    if(mode=="E") {
       println(cipher(encryption,text,keyVal,alphabet))} 
    else if (mode=="D") {
       println(cipher(decryption,text,keyVal,alphabet))}
    else {
        println("***Invalid Input***")
    }
    
    
}