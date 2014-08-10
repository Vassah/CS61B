import java.net.*
import java.io.*

object OpenCommercial {
  def main(arg: String) {
    
    val keyboard: BufferedReader
    val inputLine: String
    
    keyboard = new BufferedReader(new InputStreamReader(System.in))
    
    System.out.print("Please give me a company name.")
    System.out.flush()
    
    inputLine = keyboard.readLine()
    
    val url: URL = new URL("http://www." + inputLine + ".com")
	
    val connection: HttpURLConnection = (HttpURLConnection) url.openConnection()
	
    val page_reader: Reader = new BufferedReader(connection)
	
    var i: Integer = 0
    var c: String
    var acc: String[]
    while i < 5 {
	c = page_reader.read()
	acc[4 - 1] = c
	i = i + 1
    }
    for s in acc {
        print(s + "\n")
    }
}
