import java.io.*;

class Nuke2 {
    public static void main(String[] arg) throws Exception {
      
	BufferedReader keyboard;
        String inputLine, outputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));
        inputLine = keyboard.readLine();
        outputLine = inputLine.charAt(0) + inputLine.substring(2);
        System.out.print(outputLine);
        System.out.flush();
    }
}