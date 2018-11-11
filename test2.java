    class R4_Step4_1 {
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
            
			int xZeroCount[][] = new int[10][5];
			int yZeroCount[][] = new int[10][5];
            int x,y;
            int i;
     
     		for(y=0; y<10; y++){
     			x = 0;
     			for( i=0; i<5 && x < 10; ++i){
					xZeroCount[y][i] = 0;
				    while( x < 10 && c[y][x] == 0 )	//白をスキップ
				        x++;
					
				    while( x < 10 && c[y][x] == 1 ) {//黒を数える
				        xZeroCount[y][i] = xZeroCount[y][i] + 1;
				        x++;
				    }
				 }
			}

     		for(x=0; x<10; x++){
     			y=0;
     			for( i=0; i<5 && y<10; ++i){
					yZeroCount[x][i] = 0;
				    while( y < 10 && c[y][x] == 0 )	//白をスキップ
				        y++;
					
				    while( y < 10 && c[y][x] == 1 ) {	//黒を数える
				        yZeroCount[x][i] = yZeroCount[x][i] + 1;
				        y++;
				    }
				 }
			}

			//上部の表示
			for( i=4; i>=0; --i){
				//データの出力
				System.out.print("                  ");
				for(x=0; x<10; ++x){
					if(yZeroCount[x][i] != 0)
						System.out.printf("%-2d ",yZeroCount[x][i]);	//左詰め2文字と空白1文字
					else
						System.out.print("   ");

				}
				System.out.print("\n");
			}
			
			
            System.out.print("               -------------------------------\n");
            
            //左と表の表示
            for(y=0; y<10; ++y){
            	for( i=4; i>0; --i){
            		if(xZeroCount[y][i] == 0)
            			System.out.print("   ");
            		else
						System.out.printf("%-2d,",xZeroCount[y][i]);
            	}
				if(xZeroCount[y][i] == 0)
					System.out.print("  ");
				else
					System.out.printf("%-2d",xZeroCount[y][i]);
 
                System.out.print(" || ");
                for( x = 0; x < 10; x++ ) {
					System.out.printf("%-2d " , c[y][x]);	//左詰め2文字と空白1文字
                }
                System.out.print("\n");

            }
		}
    }

