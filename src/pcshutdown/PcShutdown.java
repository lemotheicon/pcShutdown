/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcshutdown;

/**
 *
 * @author Maria
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PcShutdown {

   
    public static void main(String[] args)throws IOException {
      Runtime run = Runtime.getRuntime();
      BufferedReader buffreader = new BufferedReader(
      new InputStreamReader(System.in));
      
        System.out.println("Enter the no. of seconds after " +
                " which you want your computer " +
                " to shutdown: ");
        long a = Long.parseLong(buffreader.readLine());
        
        Process pro = run.exec("shutdown -s -t " + a);
        
        System.exit(0);
        
    }
    
}
