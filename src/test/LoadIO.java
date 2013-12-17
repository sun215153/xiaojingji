package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class LoadIO {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://91.bestchic.com/chic.swf?autoplay=false&video_id=NTE3NzU,&mp4=1");
		URLConnection connection = url.openConnection();
		InputStream  in = connection.getInputStream();
		FileOutputStream out = new FileOutputStream("D:/aa.mp3");
		byte[] b = new byte[8192];
		while(in.read(b,0,b.length)>0){
		out.write(b);
		}
	  in.close();
	   out.close();
	}
	
}
