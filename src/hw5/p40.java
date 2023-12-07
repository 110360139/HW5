package hw5;

import java.io.*;

public class p40 
{
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("test3.txt");
			System.exit(1);
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}
}