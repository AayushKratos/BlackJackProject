import java.util.*;
public class BlackJack2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=10;
        int a=(int)(Math.random()*(max-min+1)+min);
        int b=(int)(Math.random()*(max-min+1)+min);
        int c=(int)(Math.random()*(max-min+1)+min);
        int d=(int)(Math.random()*(max-min+1)+min);
        int e=(int)(Math.random()*(max-min+1)+min);
        int f=(int)(Math.random()*(max-min+1)+min);
        int g=(int)(Math.random()*(max-min+1)+min);
        int h=(int)(Math.random()*(max-min+1)+min);
        int s1=0;
        int s2=0;
        String ans="";
        System.out.println("Welcome to BlackJack");
        System.out.println("The first number for player one: "+a);
        System.out.println("The second number for player one: "+b);
        System.out.println();
        System.out.println("The first number for player two: "+c);
        System.out.println("The second number for player two: "+d);
        s1=a+b;
        s2=c+d;
        while((s1<21 && s2<21) || (s1<s2 || s2<s1))
        {
            if(s1<=21)
            {
                System.out.println("Would you like to draw another card Player 1?");
                ans=sc.nextLine();
                if(ans.equals("YES"))
                {
                    System.out.println("The third number for player one: "+e);
                    s1=a+b+e;
                    if(s1<21)
                    {
                        System.out.println("Do you want to hold?");
                        ans=sc.nextLine();
                        if(ans.equals("YES"))
                        {
                            s1=a+b+e;
                        }
                        else if(ans.equals("NO"))
                        {
                            System.out.println("The fourth number for player one: "+f);
                            s1=a+b+e+f;
                            if(s1==21)
                            {
                                System.out.println("BlackJack");
                                System.out.println("Game Over");
                                System.out.println("Player 1 Wins");
                                break;
                            }
                            else if(s1>21)
                            {
                                System.out.println("Bust");
                                System.out.println("Game Over");
                                System.out.println("Player 2 Wins");
                                break;
                            }

                        }
                    }
                    else if(s1==21)
                    {
                        System.out.println("BlackJack");
                        System.out.println("Game Over");
                        System.out.println("Player 1 Wins");
                        break;
                    }
                    else if(s1>21)
                    {
                        System.out.println("Bust");
                        System.out.println("Game Over");
                        System.out.println("Player 2 Wins");
                        break;
                    }
                }
                else if(ans.equals("NO"))
                {
                    s1=a+b;

                }
            }

            if(s2<=21)
            {
                System.out.println("Would you like to draw another card Player 2?");
                ans=sc.nextLine();
                if(ans.equals("YES"))
                {
                    System.out.println("The third number for player two: "+e);
                    s2=c+d+g;
                    if(s2<21)
                    {
                        System.out.println("Do you want to hold?");
                        ans=sc.nextLine();
                        if(ans.equals("YES"))
                        {
                            s2=c+d+g;
                        }
                        else if(ans.equals("NO"))
                        {
                            System.out.println("The fourth number for player two: "+f);
                            s2=c+d+g+h;
                            if(s2==21)
                            {
                                System.out.println("BlackJack");
                                System.out.println("Game Over");
                                System.out.println("Player 2 Wins");
                                break;
                            }
                            else if(s2>21)
                            {
                                System.out.println("Bust");
                                System.out.println("Game Over");
                                System.out.println("Player 1 Wins");
                                break;
                            }

                        }
                    }
                    else if(s2==21)
                    {
                        System.out.println("BlackJack");
                        System.out.println("Game Over");
                        System.out.println("Player 2 Wins");
                        break;
                    }
                    else if(s2>21)
                    {
                        System.out.println("Bust");
                        System.out.println("Game Over");
                        System.out.println("Player 1 Wins");
                        break;
                    }
                }
                else if(ans.equals("NO"))
                {
                    s2=c+d;
                }
            }
            if(s1>s2)
            System.out.println("Player 1 Wins");
            else if(s2>s1)
            System.out.println("Player 2 Wins");

            
        }
    }
}
