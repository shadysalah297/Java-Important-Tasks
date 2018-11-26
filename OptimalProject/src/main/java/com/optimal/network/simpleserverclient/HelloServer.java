package com.optimal.network.simpleserverclient;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 * Simple server that waits for someone to connect on port 4242, and then
 * repeatedly asks for their name and greets them. Connect either by "telnet
 * localhost 4242" or by running HelloClient.java
 *
 * @author Chris Bailey-Kellogg, Dartmouth CS 10, Fall 2012
 */
public class HelloServer {

    public static void main(String[] args) throws IOException {
        
        Scanner console = new Scanner(System.in);
        
        // Listen on a server socket for a connection
        System.out.println("waiting for someone to connect");
        ServerSocket listen = new ServerSocket(4242); //between 1024 and 65535
        // When someone connects, create a specific socket for them
        Socket sock = listen.accept();
        System.out.println("someone connected");

        // Now talk with them
        PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        out.println("who is it?");
        String line;
        while ((line = in.readLine()) != null) {
           // System.out.println("received:" + line);
           
            String name = console.nextLine();
           
            //out.println("hi " + line + "!  anybody else there?");
            out.println(name);
        }
        System.out.println("client hung up");

        // Clean up shop
        out.close();
        in.close();
        sock.close();
        listen.close();
    }
}
