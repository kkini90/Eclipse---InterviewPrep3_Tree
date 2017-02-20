package com.usc.ctcl.tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConnectedDuration {
	public static void main(String[] args){
		SimpleDateFormat ft = new SimpleDateFormat ("(MM/dd/yyyy-hh:mm:ss)"); 
		Date s = null,e=null,c=null,d=null;
		long con = 0;
		try {
			File file = new File("/Users/kkini/Documents/workspace/Interview_Prep_3/src/com/usc/ctcl/tree/input2.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String[] sp = line.split(" :: ");
				if(sp!=null && sp.length>1){
					if ("START".equals(sp[1])){
						s=ft.parse(sp[0]);
					}else if("CONNECTED".equals(sp[1])){
						c=ft.parse(sp[0]);
					}else if("DISCONNECTED".equals(sp[1])){
						d=ft.parse(sp[0]);
						con +=d.getTime()-c.getTime();
						c=null;
					}
					else if("SHUTDOWN".equals(sp[1])){
						e=ft.parse(sp[0]);
						if (c!=null){
							con +=e.getTime()-c.getTime();
						}						
					}
				}
				
				
			}	
		 
			br.close();
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		long total = e.getTime()-s.getTime();
		double x = con*1.0/total*100;
		System.out.println((int)x+"%");
	}
}