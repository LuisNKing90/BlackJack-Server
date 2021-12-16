package mainGame;

import javax.swing.JFrame;

public class PlayerConnect {

	public static void main(String[] args) {
		Players application; // declare client application

	      // if no command line args
	      if ( args.length == 0 )
	         application = new Players( "127.0.0.1" ); // connect to localhost
	      else
	         application = new Players( args[ 0 ] ); // use args to connect

	      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      application.runClient(); // run client application
	   } // end main

	}
