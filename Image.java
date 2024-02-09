package ump;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Image {
	public static void main(String args[]) {
		Tesseract tr=new Tesseract();
		try {
			tr.setDatapath("D:\\JavaProject\\Tess4J");
			String text=tr.doOCR(new File("D:\\trailjava\\l.png"));
			System.out.println("output :"+text);
		}
		catch(TesseractException e) {
			System.out.println(e.toString());
		}
	}

	
}

	

