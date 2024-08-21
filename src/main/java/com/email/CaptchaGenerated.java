//package com.email;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.util.Base64;
//
//import javax.imageio.ImageIO;
//
//import cn.apiclub.captcha.Captcha;
//import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
//import cn.apiclub.captcha.noise.CurvedLineNoiseProducer;
//import cn.apiclub.captcha.text.producer.DefaultTextProducer;
//
//public class CaptchaGenerated {
//	
//	 public  static Captcha generatedCaptcha(Integer width,Integer height) {
//		return new Captcha.Builder(width, height)
//				.addBackground(new GradiatedBackgroundProducer())
//				.addText(new DefaultTextProducer()) 
//				.addNoise(new CurvedLineNoiseProducer())
//				.build();
//	 }
//	 
//	  public static String encodCptchaBinary(Captcha captcha) {
//		  String image=null;
//		  
//		  try {
//			  ByteArrayOutputStream bos=new ByteArrayOutputStream();
//			ImageIO.write(captcha.getImage(),"jpg",bos);
//			byte[] byteArray=Base64.getEncoder().encode(bos.toByteArray());
//			image=new String(byteArray);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		  return image;
//	  }
//
//}
