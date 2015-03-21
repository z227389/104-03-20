public class Testproject {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Scanner scan=new Scanner(System.in);
			int [][] matrix={{0,19,92,29,49,78,6},
					         {19,0,21,85,45,16,26},
					         {92,21,0,24,26,87,47},
					         {29,85,24,0,76,17,8},
					         {49,45,26,76,0,90,27},
					         {78,16,87,17,90,0,55},
					         {6,26,47,8,27,55,0}};
			int [] distance=new int [7];
			int [] visited=new int[7];
			int [] preD=new int[7];
			int min;
			int nextNode=0;
			
			for(int i=0;i<7;i++){
			visited[i]=0;
			preD[i]=0;
			
				for(int j=0;j<7;j++){
					//matrix[i][j]=scan.nextInt();
					
						if(matrix[i][j] == 0)
							matrix[i][j] =999;
				}
			}
			
			distance=matrix[0];
			distance[0]=0;
			visited[0]=1;
			
			//start with the algorithm
			
			for(int i=0;i<7;i++){
				min=999;
				
					for(int j=0;j<7;j++){
						
						if(min>distance[j]&&visited[j]!=1){
							min=distance[j];
							nextNode=j;
						}
					}
					visited[nextNode]=1;
					//actual start of the algorithm
					for (int c=0;c<7;c++){
						if(visited[c]!=1){
							
							if(min+matrix[nextNode][c]<distance[c]){
								distance[c]=min+matrix[nextNode][c];
								preD[c]=nextNode;
							}
						}
					}
			}
			for(int i=0;i<7;i++){
				System.out.print("|"+distance[i]);
			}
			System.out.print("|");
			
			//printing the paths!
			for(int i=0;i<7;i++){
				int j;
				System.out.print("Path="+i);
				j=i;
				
				do{
					j=preD[j];
					System.out.print("<-"+j);
					
				}while(j!=0);
				System.out.println();
			}
		}
	}

}
}