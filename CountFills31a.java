    class CountFills31a {
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
            int x,y,i,j,zeroOrOne;
     
			for( y = 0; y < 10; y++) {
			  x = 0;
			  zeroOrOne = 1;
			  for(i = 0; i < 10; i++) {
				xZeroOneCount[y][i] = 0;
				if( zeroOrOne == 0 ) {
				  zeroOrOne = 1;
				} else {
				  zeroOrOne = 0;
				}
				while( x < 10 && c[y][x] == zeroOrOne ) {
				  xZeroOneCount[y][i] = xZeroOneCount[y][i] + 1;
				  x++;
				}
			  }
			}
		    
		   for( x = 0; x < 10; x++) {
		    y = 0;
			zeroOrOne = 1;
			  for(j = 0;j < 10;j++) {
				yZeroOneCount[j][x] = 0;
				if( zeroOrOne == 0 ) {
				  zeroOrOne = 1;
				} else {
				  zeroOrOne = 0;
				}
				while( y < 10 && c[y][x] == zeroOrOne ) {
				  yZeroOneCount[j][x] = yZeroOneCount[j][x] + 1;
				  y++;
				}
			  }
			}
						
            for( y = 0; y < 10; y++ ) {
                for( x = 0; x < 10; x++ ) {
                    System.out.print("" + c[y][x] + " ");
                    }   
                 System.out.print("||" +  xZeroOneCount[y][0]); 
                for( i = 1; i < 10; i++ ) {  
                if(xZeroOneCount[y][i] > 0) 
                System.out.print("," +  xZeroOneCount[y][i]);
                }
                System.out.print("\n");
            }
           System.out.print("-------------------------\n");
            for( x = 0; x < 10; x++ ) {
            	for( j = 0; j < 10; j++) {
            	if(yZeroOneCount[x][j] > 0)
                System.out.print("" + yZeroOneCount[x][j] + " ");
                else
                System.out.print(" " + " ");
                }
                System.out.print("\n");
            }
            
        }
    }
