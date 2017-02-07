package pr20;
import java.util.*;
import java.io.*;

public class Problem
	{

		public static void main(String[] args) throws IOException
			{
				  Scanner file = new Scanner( new File( "pr20.dat" ) );
                  int times = file.nextInt();      
                  file.nextLine();
                 
                  for( int zz = 0; zz < times; zz++ )
                  {
                    int childAge = file.nextInt();
//                  file.nextLine();
                    double adultDose = file.nextDouble();
                            System.out.println("A:"+childAge+"  B:"+adultDose);
                    double childDose0 =   (childAge/(childAge+12));
                    double childDose = childDose0*adultDose;
                    System.out.println(childDose+" ml");
                  }
	                 
			}
	}
			
