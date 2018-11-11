    class CountFills2a {
        public static void main(String args[]) {
            
           int c[][] = { {0,0,0,0,0,0,0,1,0,0},
		                {0,0,1,1,1,1,1,1,1,0},
		                {0,0,0,0,0,0,0,1,0,0},
		                {0,0,1,1,1,1,0,1,0,0},
		                {0,0,1,0,0,1,0,1,0,0},
		                {0,0,1,1,1,1,0,1,0,0},
		                {0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,1,1,0,0},
		                {0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,0,0,0,0} };
            int xZeroCount[] = new int[10];
            int yZeroCount[] = new int[10];
            int x,y;
     
     		for( y = 0; y < 10; y++ ) {
				xZeroCount[y] = 0;
				x = 0;
				while( x < 10 && c[y][x] == 0 ) {
				  xZeroCount[y] = xZeroCount[y] + 1;
				  x++;
				}
			 }
            
            
     		for( x = 0; x < 10; x++ ) {
				yZeroCount[x] = 0;
				y = 0;
				while( x < 10 && c[y][x] == 0 ) {
				  yZeroCount[x] = yZeroCount[x] + 1;
				  x++;
				}
			 }
     
            for( y = 0; y < 10; y++ ) {
                for( x = 0; x < 10; x++ ) {
                    System.out.print("" + c[y][x] + " ");
                }
                System.out.print(" || " + xZeroCount[y]);
                System.out.print("\n");
            }
            System.out.print("-------------------------\n");
            for( x = 0; x < 10; x++ ) {
                System.out.print("" + yZeroCount[x] + " ");
            }
            System.out.print("\n");
        }
    }
