import java.io.*;

    class testing {
        public static void main(String args[]) {
            
            int c[][] = { {0,0,0,0,0,0,0,0,0,0},
                          {0,1,1,1,1,1,1,1,1,0},
                          {0,0,0,0,0,0,0,1,0,0},
                          {0,0,1,1,1,1,0,1,0,0},
                          {0,0,1,0,0,1,0,1,0,0},
                          {0,0,1,1,1,1,0,1,0,0},
                          {0,0,0,0,0,0,0,1,0,0},
                          {0,0,0,0,0,0,1,1,0,0},
                          {0,0,0,0,0,0,0,1,0,0},
                          {0,0,0,0,0,0,0,0,0,0} };
            
			int xZeroOneCount[][] = new int[10][10];
			int yZeroOneCount[][] = new int[10][10];
			int c_input[][] = new int[10][10];
            int x,y,i,j;
     
     		for(y=0; y<10; y++){
     			x=0;
     			for( i=0; i<5; ++i){
					xZeroOneCount[y][i] = 0;
				    while( x < 10 && c[y][x] == 1 )	{
		                xZeroOneCount[y][i] = xZeroOneCount[y][i] + 1;
				        x++;
					}
				    while( x < 10 && c[y][x] == 0 ) {
				        x++;
				    }
				 }
			}

     		for(x=0; x<10; x++){
     			y=0;
     			for( i=0; i<5; ++i){
					yZeroOneCount[x][i] = 0;
				    while( y < 10 && c[y][x] == 1 ){
				        yZeroOneCount[x][i] = yZeroOneCount[x][i] + 1;
				        y++;
				    }    
					
				    while( y < 10 && c[y][x] == 0 ) 
				        y++;
				    
				 }
			}

		
			for( i=4; i>=0; --i){
				System.out.print("                   ");
				for(x=0; x<10; ++x){
					if(yZeroOneCount[x][i] != 0)
						System.out.print( " "+ yZeroOneCount[x][i]+ " ");
					else
						System.out.print("   ");

				}
				System.out.print("\n");
			}
			
			
            System.out.print("                  -------------------------------\n");
            

            for(y=0; y<10; ++y){
            	for( i=4; i>0; --i){
            		if(xZeroOneCount[y][i] == 0)
            			System.out.print("   ");
            		else
						System.out.print(" "+ xZeroOneCount[y][i] +" ");
            	}
				if(xZeroOneCount[y][i] == 0)
					System.out.print("   ");
				else
					System.out.print(" "+ xZeroOneCount[y][i] + " ");
 
                System.out.print(" || ");
                System.out.print("\n");

            }
            
            System.out.print("Enter the Answer for the 10*10 matrix(Starting from top left)");
            String buf;
            
            try{
            
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
             for(i=0;i<10;i++){
            	for(j=0;j<10;j++){
            	buf = br.readLine();
				int valueIn = Integer.parseInt(buf);
                c_input[i][j] = valueIn;
                }
            }	
            int count = 0;
            for(i=0;i<10;i++){
            	for(j=0;j<10;j++){
		        	if(c_input[i][j] == c[i][j]){
		            	System.out.print("○");
		            	count++;
		            }	
		            else
		            	System.out.print("×");
                }
                System.out.print("\n");
            }	
            System.out.println("You have " + count + " correct");
            System.out.print("You can check the answer above"); 
            }catch(Exception e){
            	System.err.print("Error:" + e);
            }
		}
    }

