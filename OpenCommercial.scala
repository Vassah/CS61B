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
    
    val connection: HttpURLConnection
	  connection = new HttpURLConnection("http://www." + inputLine + ".com")
	
	  val content: String
	  content = connection.getContent()
	
	  val page_reader: Reader;
	  page_reader = new Reader(content);
	
	  var i: Integer
	  i = 0
	  var c: String
	  var acc: String[]
	  while i<5 {
	    while ((c = page_reader.read()) != "\n") {
	    	acc.append(c)
	    }
	    System.out.print(acc)
	    i = i + 1
    }
}
