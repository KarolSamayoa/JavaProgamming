/**
 * This program calculates the number of soccer teams that a
 * youth league may create from the number of available players.
 * Input validation is demonstrated with the while loops.
 */

import java.util.Scanner;

public class SoccerTeams 
{
    public static void main (String[] args)
    {
        final int MIN_PLAYERS = 9;  //Minimun players per team.
        final int MAX_PLAYERS = 15; //Maximun players per team.
        
        int players;                //number of available players
        int teamSize;               //number of players per team
        int teams;                  //number of teams
        int leftOver;               //number of leftover players
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the number of players per team.
        System.out.print("Enter the number of players per team: ");
        teamSize = keyboard.nextInt();
        
        //validate the number entered. 
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
            System.out.print("The number must be at least " + MIN_PLAYERS +
                             " and no more than "+ MAX_PLAYERS +
                             ".\nEnter the number of players: ");
            teamSize = keyboard.nextInt();
        }
        
        //Get the number of available players.
        System.out.print("Enter the available number of players: ");
        players = keyboard.nextInt();
        
        //Validate the number entered.
        while(players < 0)
        {
            System.out.print("Enter 0 or greater: ");
            players = keyboard.nextInt();
        }
        
        //Calculate the number of teams.
        teams = players/ teamSize;
        
        //Calculate the number of leftover players/
        leftOver = players % teamSize;
        
        //Display the result
        System.out.println("There will be "+ teams + " teams with " + 
                            leftOver + " players left over.");
    }
}
