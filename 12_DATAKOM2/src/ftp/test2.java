package ftp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownHostException;

import ftp.Exceptions.NoInputException;

public class test2 {
	static String response = "";
	static newFTPClient ftpC = new newFTPClient();
	
	public static void main(String args[]) throws UnknownHostException, IOException, NoInputException, InterruptedException{
		ftpC.connect("130.226.21.129",21);
		ftpC.login("modbus","336699");
		String remoteFile1 = "/best.txt";
        File downloadFile1 = new File("C:/Users/Mads/best.txt");
        OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
		ftpC.retrieveFile(remoteFile1, outputStream1);
		outputStream1.close();
	}
	
}