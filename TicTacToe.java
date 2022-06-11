package project;

import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> p1= new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for(int i=0;i<9;i++) {
			p1.add(0);
			p2.add(0);
			list.add("0");
		}
		int flag=0;	
		System.out.println(" 1 | 2 | 3 ");
		System.out.println(" - | - | - ");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println(" - | - | - ");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("PLAYER 1 -> X ");
		System.out.println("PLAYER 2 -> O ");
		System.out.println("--------------");
		
		for(int i=0;i<9;i++) {
			System.out.println(" " + list.get(0) + " | " + list.get(1) + " | " + list.get(2));
			System.out.println(" - | - | - ");
			System.out.println(" " + list.get(3) + " | " + list.get(4) + " | " + list.get(5));
			System.out.println(" - | - | - ");
			System.out.println(" " + list.get(6) + " | " + list.get(7) + " | " + list.get(8));
				
			if(i%2==0) {
				System.out.println("Player 1: Enter the position ");
				int n= s.nextInt();
				while( list.get(n-1) == "X" || list.get(n-1)=="O") {
					System.out.println("This position is already used");
					n=s.nextInt();	
				}
					
					p1.set(n-1, 1);
					list.set(n-1, "X");
					
//					 # Horizontal					
					if(p1.get(0)==1 && p1.get(1)==1 && p1.get(2)==1) {
						flag =1;
					}
					if(p1.get(3)==1 && p1.get(4)==1 && p1.get(5)==1) {
						flag =1;
					}
					if(p1.get(6)==1 && p1.get(7)==1 && p1.get(8)==1) {
						flag =1;
					}
					
//					# VERTICAL					 
					 if(p1.get(0)==1 && p1.get(3)==1 && p1.get(6)==1) {
							flag = 1;
						}
					if(p1.get(1)==1 && p1.get(4)==1 && p1.get(7)==1) {
							flag = 1;
						}
					if(p1.get(2)==1 && p1.get(5)==1 && p1.get(8)==1) {
							flag = 1;
						}
						
//						 #SLANT
					 if(p1.get(0)==1 && p1.get(4)==1 && p1.get(8)==1) {
							flag = 1;
						}
					if(p1.get(2)==1 && p1.get(4)==1 && p1.get(8)==1) {
							flag = 1;
						}				
			}
			else {
				System.out.println("Player 2 : Enter the position ");
				int n = s.nextInt();
				while(list.get(n-1)=="X" || list.get(n-1)=="O") {
					System.out.println("This position is already in use");
					n=s.nextInt();
				}
					p2.set(n-1, 1);
					list.set(n-1, "O");
//					 # Horizontal					
						if(p2.get(0)==1 && p2.get(1)==1 && p2.get(2)==1) {
							flag =2;
						}
						if(p2.get(3)==1 && p2.get(4)==1 && p2.get(5)==1) {
							flag =2;
						}
						if(p2.get(6)==1 && p2.get(7)==1 && p2.get(8)==1) {
							flag =2;
						}
						
//						# VERTICAL					 
						 if(p2.get(0)==1 && p2.get(3)==1 && p2.get(6)==1) {
								flag = 2;
							}
						if(p2.get(1)==1 && p2.get(4)==1 && p2.get(7)==1) {
								flag = 2;
							}
						if(p2.get(2)==1 && p2.get(5)==1 && p2.get(8)==1) {
								flag = 2;
							}
							
//							 #SLANT
						 if(p2.get(0)==1 && p2.get(4)==1 && p2.get(8)==1) {
								flag = 2;
							}
						if(p2.get(2)==1 && p2.get(4)==1 && p2.get(8)==1) {
								flag = 2;
							}								
			}
			if(flag!=0) {
				System.out.println("Player " + flag + " is Winner");
				break;				
			}		
		}	
		if(flag==0) {
			System.out.println("Game has tied , No Winner");
		}
		
	}

}
