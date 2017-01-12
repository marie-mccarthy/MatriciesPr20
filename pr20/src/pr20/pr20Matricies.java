package pr20;
import java.util.*;
import java.io.*;

public class pr20Matricies
	{

		public static void main(String[] args) throws IOException
			{
			 Scanner file = new Scanner(new File( "pr20.dat" ));
		      int times = file.nextInt();      
		      file.nextLine();
		     
			int[][] myMatrix = {{1,2,3,4,5},
								{6,7,8,9,0},
								{6,7,1,2,5},
								{6,7,8,9,0},
								{5,4,3,2,1}};
			
			 int sum = 0;
		      int a = 0;
		      int b = 0;
		      int d = 0;
		      int e = 0;
		      int f = 0;
		      int g = 0;
		     
			for( int zz = 0; zz < times; zz++ )
				{
				 int r = file.nextInt();
					int c = file.nextInt();
					int specialNumber = myMatrix[r][c];
					if ((r>=1 && r<=3)&&( c>=1 && c<=3))
                          {
                          int w = myMatrix[r-1][c-1]+myMatrix[r-1][c]+myMatrix[r-1][c+1]
                          		+myMatrix[r][c-1]+specialNumber    +myMatrix[r][c+1]+
                          		myMatrix[r+1][c-1]+myMatrix[r+1][c]+myMatrix[r+1][c+1];
                          System.out.println(w);
                          }
					else
						{
						if((c>=1)&&(c<=3))
						{
							a = myMatrix [r][c-1]+ myMatrix [r][c+1];
						}						
							if(c<1)
							{
								 a = myMatrix [r][c+1]; // the one to the right//
								 if(r<1)
								 {
									 //A
									 e = myMatrix[r+1][c+1];// the one on the bottom right									
								 }
								 if( r>3)
								 {
									 d = myMatrix[r-1][c+1]; //the one on the top left
								 }									
							}
							if(c>3)
							{
								 a = myMatrix [r][c-1]; // the one to the left
								 								 
								 if(r<1)
								 {
									 e = myMatrix[r+1][c-1];// the one on the bottom left
								 }
								 if( r>3)
								 {
									 d = myMatrix[r-1][c-1]; //the one on the top left
								 }
							}
						
							if(r<1)
							{
								 b = myMatrix[r+1][c]; // the one below it
							}
							if(r>3)
							{
								 b = myMatrix[r-1][c];// the one on top of it
							}
							
							int anwser = a+b+e+d+specialNumber;
							System.out.println(anwser);
						}
				}
			}
	}
			
