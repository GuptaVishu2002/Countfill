import java.io.*;

    class CountFills43a {
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
            int x,y,i,j,more;
     
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
		    
             do{
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
				    	if(c_input[i][j] == c[i][j])
				        	count++;	
					}
		        }	
		        System.out.println("You have " + count + " correct");
		        System.out.println("Do you wanna retry(Press 1 for Yes)");
		        buf = br.readLine();
		        more = Integer.parseInt(buf);
            }while(more == 1 );
            String again;
            System.out.println("Press \n 1 : See What is Wrong \n 2 : See Answer \n 3 : Quit");
		        buf = br.readLine();
				int option = Integer.parseInt(buf);
				if(option == 1){
					for(i=0;i<10;i++){
				    	for(j=0;j<10;j++){
							if(c_input[i][j] == c[i][j]){
						    	System.out.print("  _  ");
						    }	
						    else
						    	System.out.print("  ×  ");
				        }
				        System.out.print("\n");
				    }	
				}
				if(option == 2){
					for(i=0;i<10;i++){
				    	for(j=0;j<10;j++){
							 System.out.print(c[i][j] + " ");
				        }
				        System.out.print("\n");
				    }	
				}
            }catch(Exception e){
            	System.err.print("Error:" + e);
            }
		}
    }

