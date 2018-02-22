package com.automation;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageComparisonExample {
	@Test
	public void imageComaprison() throws IOException {

		File inputImage= new File("images.jpg");
		
		File outPutImage= new File("Rajesh.jpg");
		
		
		BufferedImage bufferedReader = ImageIO.read(inputImage);
		
		DataBuffer dataBuffer = bufferedReader.getData().getDataBuffer();
		
		int Size1=dataBuffer.getSize();
		

		BufferedImage bufferedReader1 = ImageIO.read(outPutImage);
		
		DataBuffer dataBuffer1 = bufferedReader1.getData().getDataBuffer();
		
		int Size2=dataBuffer1.getSize();
		
		
		
		Assert.assertEquals(Size1, Size2 ,"Size are not equal");
	}

}
