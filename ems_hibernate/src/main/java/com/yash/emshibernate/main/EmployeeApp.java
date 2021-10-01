package com.yash.emshibernate.main;

import java.util.Scanner;

import com.yash.emshibernate.dao.DeleteData;
import com.yash.emshibernate.dao.InsertData;
import com.yash.emshibernate.dao.UpdateData;

public class EmployeeApp {

	public static void main(String[] args) 
	{
		InsertData indt = new InsertData();
		UpdateData updt = new UpdateData();
		DeleteData ddt = new DeleteData();
		int option;
		System.out.println("*************WELCOME TO EMS APP******************");
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(true)
		{
			System.out.println("Press 1 for insert data ");
			System.out.println("Press 2 for update data");
			System.out.println("Press 3 to delete data");
			System.out.println("Press any key(except 1-6) to exit...");

			option = sc.nextInt();
			switch(option)
			{
			case 1:
				indt.insert();
				System.out.println("Insert Success!!");
				break;

			case 2:
				updt.update();
				System.out.println("Update Success!!");
				break;
				
			case 3:
				ddt.delete();
				System.out.println("Delete Success!!");
				break;	

			default:
				flag = true;
				break;	
			}

			if(flag)
				break;
		}

	}

}
