package com.Logic;

import java.util.Scanner;

public class Snake_game 
{
static int s1,s2,s3,s4;
static int[] snake1= {20,10};
static int[] snake2= {25,1};
static int[] snake4= {70,37};
static int[] snake3= {90,15};
public static int roll_die()
{
	int random = (int )(Math.random() * 12 + 1);
	return random;
}
public Snake_game()
{
	s1=0;s2=0;s3=0;s4=0;
}
public static int snakebit(int s)
{
	if(s==snake1[0])
	{
		return snake1[1];
	}
	else
	{
		if(s==snake2[0])
		{
			return snake2[1];
		}
		else
		{
			if(s==snake3[0])
			{
				return snake3[1];
			}
			else
			{
				if(s==snake4[0])
				{
					return snake4[1];
				}
				else
				{
					return s;
				}
			}
		}
	}
	
}
	public static void main(String[] args)
	{
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		int p1,p2,p3,p4;

		count++;
		// TODO Auto-generated method stub
		exit:
		while(true)
		{
			switch(count)
			{
			case 1:
				System.out.println("Roll the die-A");
//				p1=sc.nextInt();
				p1=roll_die();
				s1+=p1;
				if(s1==snakebit(s1))
				{
					System.out.println("No Snake Bite");
				}
				else
				{
					System.out.println(" Snake Biten..........");
					s1=snakebit(s1);
				}
				count++;
				if(s1==100)
				{
					System.out.println("Player A won");
					break exit;
				}
				else
				{
					if(s1>100)
					{
						s1-=p1;
					}
					
				}
				break;
			case 2:
				System.out.println("Roll the die-B");
//				p2=sc.nextInt();
				p2=roll_die();
				s2+=p2;
				if(s2==snakebit(s2))
				{
					System.out.println("No Snake Bite");
				}
				else
				{
					System.out.println(" Snake Biten..........");
					s2=snakebit(s2);
				}
				count++;
				if(s2==100)
				{
					System.out.println("Player B won");
					break exit;
				}
				else
				{
					if(s2>100)
					{
						s2-=p2;
					}
					
				}
				break;
			case 3:
				System.out.println("Roll the die-C");

//				p3=sc.nextInt();
				p3=roll_die();
				s3+=p3;
				if(s3==snakebit(s3))
				{
					System.out.println("No Snake Bite");
				}
				else
				{
					System.out.println(" Snake Biten..........");
					s3=snakebit(s3);
				}
				count++;
				if(s3==100)
				{
					System.out.println("Player C won");
					break exit;
				}
				else
				{
					if(s3>100)
					{
						s3-=p3;
					}
					
				}
				break;
			case 4:
				System.out.println("Roll the die-D");

//				p4=sc.nextInt();
				p4=roll_die();
				s4+=p4;
				if(s4==snakebit(s4))
				{
					System.out.println("No Snake Bite");
				}
				else
				{
					System.out.println(" Snake Biten..........");
					s4=snakebit(s4);
				}
				count++;
				if(s4==100)
				{
					System.out.println("Player D won");
					break exit;
				}
				else
				{
					if(s4>100)
					{
						s4-=p4;
					}
					
				}
				break;
			default:
				count=1;
			break;
			}
			
			
		}
		System.out.println("Match Over");
		System.out.println("A--B--C--D  "+s1+"  "+s2+"  "+s3+"  "+s4+"  ");

	}

}
