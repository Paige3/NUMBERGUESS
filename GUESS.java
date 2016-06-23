
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;

public class GUESS
{
    private String vPlayerName;
    private int vRandomNumber;
    private int vGuess;
    private String vOption;
    private boolean vCorrectGuess;

    public GUESS()
    {
        vPlayerName = "";
        vRandomNumber = 0;
        vGuess = 0;
        vOption = "";
        vCorrectGuess = boolean = true; boolean = false
    }

    public void display_opening_message()
    {

    }

    public void play_game()
    {
        System.out.println("Enter P for play and S for stop");
        //3.1   	Display Menu
        //3.2   	If option is equal to play then
        //3.3               	Enter player name
        //3.4               	Generate random number
        //3.4.1 Computer generates a number between 1 and 50       	
        //3.5               	While found equals false do
        //3.6   	        	        	enter lucky guess from player
        //3.7               	        	if guess equals random number then
        //3.8                           	        	set found to true
        //3.9               	        	else if guess is less than random number then
        //3.10             	        	        	display a less than message
        //3.11 	        	        	else
        //3.12             	        	        	display a more than message
        //3.13             	        	end if
        //3.14 	        	end while
        //3.15             	Display results
        //3.16 	else
        //3.17             	quit game
        //3.18 	end if
    }

    public void display_closing_message()
    {

    }
}
