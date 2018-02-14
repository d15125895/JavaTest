package ie.dit;

import java.io.IOException;
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
						ArrayList<String> Title = new ArrayList<String>();

							public tunes()
							{
								loadTunes ();
							}
												
						
					}
					
					
					public Tune findTune(String Title)
					{
						
						int matchTune = Integer.MAX_VALUE;
								String matchTitle = ""; 
									for(String w:Title)
									{
										int ed = EditDistance.MinimumEditDistance(Title, w);
										if (ed == 0)
										{
											return Title;
										}
										if (ed < matchTune)
										{
											matchTune = ed;
											matchTitle = w;
										}
									}
									return matchTitle]];
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
			
					public static void main (String[] args) // main methode
			{
				
								TuneBook tb = new TuneBook("jig.abc");
										System.out.println(tb);

										Tune t = tb.findTune("Up in the Air");
											t.play();
				
			}
}	
