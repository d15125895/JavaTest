package ie.dit;


import java.io.BufferedReader;
import java.util.ArrayList;


public class Tune // must be same as file name
{
	
	
	private int X;
	private char Title;
	private char AltTitle ;
	private char Notation;
	
	
		public int getX()
		{
			return X;
		}
		
		public char getTitle()
		{
			return Title;
		}
		
		public char getAltTitle()
		{
			return AltTitle;
		}
		
		public char getNotation()
		{
			return Notation;
		}
		
		
	
		
			public String toString()
			{
				
				StrBuffer sb = new StrBuffer();
				
				for(String word:words)
				{
					sb.append(word + ", ");
				}

				return sb.toString();

		
					public class TuneBook 
					
					{
						ArrayList<String> words = new ArrayList<String>();

							public tunes()
							{
								loadTunes ();
							}
												
						
					}
					
					
							
						public void loadTunes()
						{

										   
						   BufferedReader inputStream = null;

							 try {
							   inputStream = new BufferedReader(new FileReader("abc.txt"));
												
								String l;
								   while ((l = inputStream.readLine()) != null) {
										abc.add(l);
										}
											
											
								  catch (IOException e)
								{
										e.printStackTrace();
								} 
								  finally 
								{
								  if (inputStream != null) {
													
									 try
										   {
												inputStream.close();
											}
													
									}
							}
					}
			}
			
					public static void main (String[] args) 
			{
				
								TuneBook tb = new TuneBook("jig.abc");
										System.out.println(tb);

										Tune t = tb.findTune("Up in the Air");
											t.play();
				
			}
}	
