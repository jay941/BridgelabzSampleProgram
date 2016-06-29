package com.bridgelab.task;

import java.sql.Date;
import java.util.ArrayList;

public class Find 

{ //finding doctor by Id
	public ArrayList<Doctor> FindById( ArrayList<Doctor> al,int did)
	{  Doctor dc=new Doctor();
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
	for(Doctor d:al)
	{
		if(d.getDid()==did)
		{
			temp.add(d);
		}
	}
		return temp;
		
	}
//finding doctor by name
	public ArrayList<Doctor> FindByName(ArrayList<Doctor> al, String dn) 
	{   
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		
	for(Doctor d:al)
	{
		if(d.getDname().equals(dn))
		{
		temp.add(d)	;
		}
	}
	
		return temp;
	}
	
	
 //finding doctor by availability
	public ArrayList<Doctor> FindByava(ArrayList<Doctor> al, String as) {
		
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		for(Doctor d:al)
		{
			if(d.getAvailable().equals(as))
			{
				temp.add(d);
			}
		}
			return temp;
			
		}
//finding patients by Id
	public ArrayList<Patients> FindById1(ArrayList<Patients> al1, int fdid1) {
		
		Patients p=new Patients();
		ArrayList<Patients> temp=new ArrayList<Patients>();
		for(Patients p1:al1)
		{
			if(p1.getPid()==fdid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
////finding patients by name
	public ArrayList<Patients> FindByName1(ArrayList<Patients> al1, String dn1) {
		
		Patients p=new Patients();
		ArrayList<Patients> temp=new ArrayList<Patients>();
		for(Patients p1:al1)
		{
			if(p1.getPname().equals(dn1))
			{
				temp.add(p1);
			}
		}
		return temp;
	}
////finding patients by mobile number
	public ArrayList<Patients> FindByava1(ArrayList<Patients> al1, int as1) {
		
		Patients p=new Patients();
		ArrayList<Patients> temp=new ArrayList<Patients>();
		for(Patients p1:al1)
		{
			if(p1.getMobile()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

}
