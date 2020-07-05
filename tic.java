//celup
import java.util.Scanner;

class tic{
	public static void main(String [] args){
		Scanner z = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
		int win=0;
		int player;

			System.out.println("a|b|c");
			System.out.println("d|e|f");
			System.out.println("g|h|i");

		for(int x=1;x<8;x++){
			if(x%2==1)
				player=1;
			else
				player=2;

			System.out.print("Player "+player+" Choose your position: ");
			char place= z.next().charAt(0);

			switch(place){
				case 'a':
					if(a==0)
						a=player;
					else{
						System.out.println("Not valid. Enter again");
						x--;
					}	
				break;

				case 'b':
					if(b==0)
						b=player;
					else{
						System.out.println("not valid");
						x--;
					}
				break;

				case 'c':
					if(c==0)
						c=player;
					else{
						System.out.println("Not valid. Enter again");
						x--;
					}
				break;

				case 'd':
					if(d==0)
						d=player;
					else{
						System.out.println("not valid");
						x--;
					}
				break;

				case 'e':
					if(e==0)
						e=player;
					else{
						System.out.println("Not valid. Enter again");
						x--;
					}	
				break;

				case 'f':
					if(f==0)
						f=player;
					else{
						System.out.println("not valid");
						x--;
					}
				break;

				case 'g':
					if(g==0)
						g=player;
					else{
						System.out.println("Not valid. Enter again");
						x--;
					}
				break;

				case 'h':
					if(h==0)
						h=player;
					else{
						System.out.println("not valid");
						x--;
					}
				break;

				case 'i':
					if(i==0)
						i=player;
					else{
						System.out.println("not valid");
						x--;
					}
				break;
				}

			if(a==b&&b==c){
				if(a==1)
					win=1;
				else if(a==2)
					win=2;
			}
				
			else if(d==e&&e==f){
				if(d==1)
					win=1;
				else if(d==2)
					win=2;
			}

			else if(g==h&&h==i){
				if(g==1)
					win=1;
				else if(g==2)
						win=2;
				}
				
			else if(a==d&&d==g){
				if(a==1)
					win=1;
				else if(a==2)
					win=2;
			}

			else if(b==e&&e==h){
				if(b==1)
					win=1;
				else if(b==2)
					win=2;
			}

			else if(c==f&&f==i){
				if(c==1)
					win=1;
				else if(c==2)
					win=2;
			}
				
			else if(a==e&&e==i){
				if(a==1)
					win=1;
				else if(a==2)
					win=2;
			}

			else if(c==e&&e==g){
				if(c==1)
					win=1;
				else if(c==2)
					win=2;
			}


			if(win==1||win==2)
				x=8;

		}
		System.out.println("player "+win+" win");
			}
		}

	
	
