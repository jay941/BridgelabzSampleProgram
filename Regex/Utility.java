package com;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Utility{

	private final String NAME = "<<name>>";
	private final String FULLNAME = "<<full name>> ";
	private final String MOBILE_NO = "xxxxxxxxxx";
	private final String DATE = "01/01/2016";

	BufferedReader bufferedReader,br;
	public Utility(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	//take input word
	public String inputWord(){
		try{
			return bufferedReader.readLine();
		}
		catch(IOException exception){
			System.out.println(exception.getMessage());
		}
		return "";
	}
	
	public String getFileText(String fileName){

		try{

			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception exception){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException exception){
			}	
		}
	}
	
	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(NAME);
       		Matcher m = p.matcher(message); 
       		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}

}
