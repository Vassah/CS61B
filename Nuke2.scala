import java.io.*;

class Nuke2() {
  def main() {
    keyboard: BufferedReader
    inputLine, outputLine: String

    keyboard = new BufferedReader(new InputStreamReader(System.in))
    inputLine = keyboard.readLine()
    outputLine = inputLine.charAt(0) + inputLine.substring(2)
    System.out.print(outputLine)
    System.out.flush()
  }
}
