/* create an applet and compile it. After that create an html file and place the applet code in html file. Now click the html file. */

import  java.awt.Graphics;
import java.applet.Applet;
public class HelloJava extends Applet {
	public void paint (Graphics g ) {
            g.drawString (  Hello Java ! 50, 25 ); 
	}
}

// Html code

< html>  
< body>  
< applet code=" HelloJava.class" width="200" height="100">  
< / applet>  
< / body>  
< / html>