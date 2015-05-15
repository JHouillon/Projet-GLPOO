package Pieces;

import java.io.BufferedReader;
import java.io.FileReader;

import Plateau.Plateau;

public class Pieces {
	
	private int id;
	
	private int[] x_sud = new int[3];
	private int[] x_est = new int[3];
	private int[] x_nord = new int[3];
	private int[] x_west = new int[3];
	
	private int[] y_sud = new int[3];
	private int[] y_est = new int[3];
	private int[] y_nord = new int[3];
	private int[] y_west = new int[3];
	private String[] couleur = new String[4];
	
	private int separation = 105;
	
	public Pieces(int id, int t)
	{
		if(id == 1)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] = "V";
			    this.couleur[1] = "R";
			    this.couleur[2] = "B";
			    this.couleur[3] = "V";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] = "V";
			    this.couleur[1] = "V";
			    this.couleur[2] = "R";
			    this.couleur[3] = "V";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] = "B";
			    this.couleur[1] = "R";
			    this.couleur[2] = "V";
			    this.couleur[3] = "R";
            }
		}
		else if(id == 2)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] =  "V";
			    this.couleur[1] = "R";
			    this.couleur[2] = "V";
			    this.couleur[3] = "B";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;
			
			    this.couleur[0] =  "B";
			    this.couleur[1] = "B";
			    this.couleur[2] = "B";
			    this.couleur[3] = "V";
            }
		}
		else if(id == 3)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;

			    this.couleur[0] = "R";
			    this.couleur[1] = "R";
			    this.couleur[2] = "V";
			    this.couleur[3] = "N";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "V";
            }
		}
		else if(id == 4)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120;
			    this.y_sud[1] = 120;
			    this.y_sud[2] = 70;
			    this.y_est[0] = 120;
			    this.y_est[1] = 20;
			    this.y_est[2] = 70;
			    this.y_nord[0] = 20;
			    this.y_nord[1] = 20;
			    this.y_nord[2] = 70;
			    this.y_west[0] = 20;
			    this.y_west[1] = 120;
			    this.y_west[2] = 70;

			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "V";
			    this.couleur[3] = "B";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "N";
			    this.couleur[3] = "V";
            }
		}
		else if(id == 5)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "R";
			    this.couleur[3] = "R";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
		}
		else if(id == 6)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;
			
			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "R";
			    this.couleur[3] = "V";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;
			
			    this.couleur[0] = "N";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "B";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*4;
			    this.x_sud[1] = 120+separation*4;
			    this.x_sud[2] = 70+separation*4;
			    this.x_est[0] = 120+separation*4;
			    this.x_est[1] = 120+separation*4;
			    this.x_est[2] = 70+separation*4;
			    this.x_nord[0] = 120+separation*4;
			    this.x_nord[1] = 20+separation*4;
			    this.x_nord[2] = 70+separation*4;
			    this.x_west[0] = 20+separation*4;
			    this.x_west[1] = 20+separation*4;
			    this.x_west[2] = 70+separation*4;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;
			
			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "R";
            }
		}
		else if(id == 7)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "R";
			    this.couleur[1] = "R";
			    this.couleur[2] = "V";
			    this.couleur[3] = "B";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*4;
			    this.x_sud[1] = 120+separation*4;
			    this.x_sud[2] = 70+separation*4;
			    this.x_est[0] = 120+separation*4;
			    this.x_est[1] = 120+separation*4;
			    this.x_est[2] = 70+separation*4;
			    this.x_nord[0] = 120+separation*4;
			    this.x_nord[1] = 20+separation*4;
			    this.x_nord[2] = 70+separation*4;
			    this.x_west[0] = 20+separation*4;
			    this.x_west[1] = 20+separation*4;
			    this.x_west[2] = 70+separation*4;
                
			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "V";
            }
		}
		else if(id == 8)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation*5;
			    this.x_sud[1] = 120+separation*5;
			    this.x_sud[2] = 70+separation*5;
			    this.x_est[0] = 120+separation*5;
			    this.x_est[1] = 120+separation*5;
			    this.x_est[2] = 70+separation*5;
			    this.x_nord[0] = 120+separation*5;
			    this.x_nord[1] = 20+separation*5;
			    this.x_nord[2] = 70+separation*5;
			    this.x_west[0] = 20+separation*5;
			    this.x_west[1] = 20+separation*5;
			    this.x_west[2] = 70+separation*5;
                
			    this.y_sud[0] = 120+separation;
			    this.y_sud[1] = 120+separation;
			    this.y_sud[2] = 70+separation;
			    this.y_est[0] = 120+separation;
			    this.y_est[1] = 20+separation;
			    this.y_est[2] = 70+separation;
			    this.y_nord[0] = 20+separation;
			    this.y_nord[1] = 20+separation;
			    this.y_nord[2] = 70+separation;
			    this.y_west[0] = 20+separation;
			    this.y_west[1] = 120+separation;
			    this.y_west[2] = 70+separation;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "R";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
		}
		else if(id == 9)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "B";
			    this.couleur[1] = "R";
			    this.couleur[2] = "N";
			    this.couleur[3] = "V";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "V";
			    this.couleur[1] = "R";
			    this.couleur[2] = "B";
			    this.couleur[3] = "V";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "V";
			    this.couleur[1] = "R";
			    this.couleur[2] = "V";
			    this.couleur[3] = "B";
            }
		}
		else if(id == 10)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "N";
			    this.couleur[3] = "B";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;
                
			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;
                
			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "V";
			    this.couleur[1] = "V";
			    this.couleur[2] = "B";
			    this.couleur[3] = "R";
            }
		}
		else if(id == 11)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "R";
			    this.couleur[1] = "N";
			    this.couleur[2] = "R";
			    this.couleur[3] = "V";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "B";
			    this.couleur[1] = "V";
			    this.couleur[2] = "R";
			    this.couleur[3] = "R";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*4;
			    this.x_sud[1] = 120+separation*4;
			    this.x_sud[2] = 70+separation*4;
			    this.x_est[0] = 120+separation*4;
			    this.x_est[1] = 120+separation*4;
			    this.x_est[2] = 70+separation*4;
			    this.x_nord[0] = 120+separation*4;
			    this.x_nord[1] = 20+separation*4;
			    this.x_nord[2] = 70+separation*4;
			    this.x_west[0] = 20+separation*4;
			    this.x_west[1] = 20+separation*4;
			    this.x_west[2] = 70+separation*4;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "V";
			    this.couleur[3] = "N";
            }
		}
		else if(id == 12)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "B";
			    this.couleur[3] = "R";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "B";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
			    this.x_sud[0] = 20+separation*5;
			    this.x_sud[1] = 120+separation*5;
			    this.x_sud[2] = 70+separation*5;
			    this.x_est[0] = 120+separation*5;
			    this.x_est[1] = 120+separation*5;
			    this.x_est[2] = 70+separation*5;
			    this.x_nord[0] = 120+separation*5;
			    this.x_nord[1] = 20+separation*5;
			    this.x_nord[2] = 70+separation*5;
			    this.x_west[0] = 20+separation*5;
			    this.x_west[1] = 20+separation*5;
			    this.x_west[2] = 70+separation*5;

			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "N";
			    this.couleur[2] = "R";
			    this.couleur[3] = "N";
            }
		}
		else if(id == 13)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20;
			    this.x_sud[1] = 120;
			    this.x_sud[2] = 70;
			    this.x_est[0] = 120;
			    this.x_est[1] = 120;
			    this.x_est[2] = 70;
			    this.x_nord[0] = 120;
			    this.x_nord[1] = 20;
			    this.x_nord[2] = 70;
			    this.x_west[0] = 20;
			    this.x_west[1] = 20;
			    this.x_west[2] = 70;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "V";
			    this.couleur[3] = "N";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*4;
			    this.x_sud[1] = 120+separation*4;
			    this.x_sud[2] = 70+separation*4;
			    this.x_est[0] = 120+separation*4;
			    this.x_est[1] = 120+separation*4;
			    this.x_est[2] = 70+separation*4;
			    this.x_nord[0] = 120+separation*4;
			    this.x_nord[1] = 20+separation*4;
			    this.x_nord[2] = 70+separation*4;
			    this.x_west[0] = 20+separation*4;
			    this.x_west[1] = 20+separation*4;
			    this.x_west[2] = 70+separation*4;
                
			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "B";
			    this.couleur[2] = "V";
			    this.couleur[3] = "V";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "R";
			    this.couleur[3] = "V";
            }
		}
		else if(id == 14)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation;
			    this.x_sud[1] = 120+separation;
			    this.x_sud[2] = 70+separation;
			    this.x_est[0] = 120+separation;
			    this.x_est[1] = 120+separation;
			    this.x_est[2] = 70+separation;
			    this.x_nord[0] = 120+separation;
			    this.x_nord[1] = 20+separation;
			    this.x_nord[2] = 70+separation;
			    this.x_west[0] = 20+separation;
			    this.x_west[1] = 20+separation;
			    this.x_west[2] = 70+separation;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "B";
			    this.couleur[3] = "B";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation*5;
			    this.x_sud[1] = 120+separation*5;
			    this.x_sud[2] = 70+separation*5;
			    this.x_est[0] = 120+separation*5;
			    this.x_est[1] = 120+separation*5;
			    this.x_est[2] = 70+separation*5;
			    this.x_nord[0] = 120+separation*5;
			    this.x_nord[1] = 20+separation*5;
			    this.x_nord[2] = 70+separation*5;
			    this.x_west[0] = 20+separation*5;
			    this.x_west[1] = 20+separation*5;
			    this.x_west[2] = 70+separation*5;
                
			    this.y_sud[0] = 120+separation*2;
			    this.y_sud[1] = 120+separation*2;
			    this.y_sud[2] = 70+separation*2;
			    this.y_est[0] = 120+separation*2;
			    this.y_est[1] = 20+separation*2;
			    this.y_est[2] = 70+separation*2;
			    this.y_nord[0] = 20+separation*2;
			    this.y_nord[1] = 20+separation*2;
			    this.y_nord[2] = 70+separation*2;
			    this.y_west[0] = 20+separation*2;
			    this.y_west[1] = 120+separation*2;
			    this.y_west[2] = 70+separation*2;

			    this.couleur[0] = "N";
			    this.couleur[1] = "N";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "N";
			    this.couleur[1] = "N";
			    this.couleur[2] = "B";
			    this.couleur[3] = "N";
            }
		}
		else if(id == 15)
		{
            if(t == 0)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;
			
			    this.couleur[0] = "N";
			    this.couleur[1] = "B";
			    this.couleur[2] = "N";
			    this.couleur[3] = "V";
            }
            else if(t == 1)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;
			
			    this.couleur[0] = "N";
			    this.couleur[1] = "V";
			    this.couleur[2] = "N";
			    this.couleur[3] = "N";
            }
            else if(t == 2)
            {
			    this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;
			
			    this.couleur[0] = "N";
			    this.couleur[1] = "R";
			    this.couleur[2] = "N";
			    this.couleur[3] = "B";
            }
		}
		else if(id == 16)
		{
            if(t == 0)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "R";
			    this.couleur[1] = "B";
			    this.couleur[2] = "N";
			    this.couleur[3] = "R";
            }
            else if(t == 1)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "V";
			    this.couleur[3] = "R";
            }
            else if(t == 2)
            {
                this.x_sud[0] = 20+separation*4;
			    this.x_sud[1] = 120+separation*4;
			    this.x_sud[2] = 70+separation*4;
			    this.x_est[0] = 120+separation*4;
			    this.x_est[1] = 120+separation*4;
			    this.x_est[2] = 70+separation*4;
			    this.x_nord[0] = 120+separation*4;
			    this.x_nord[1] = 20+separation*4;
			    this.x_nord[2] = 70+separation*4;
			    this.x_west[0] = 20+separation*4;
			    this.x_west[1] = 20+separation*4;
			    this.x_west[2] = 70+separation*4;

			    this.y_sud[0] = 120+separation*3;
			    this.y_sud[1] = 120+separation*3;
			    this.y_sud[2] = 70+separation*3;
			    this.y_est[0] = 120+separation*3;
			    this.y_est[1] = 20+separation*3;
			    this.y_est[2] = 70+separation*3;
			    this.y_nord[0] = 20+separation*3;
			    this.y_nord[1] = 20+separation*3;
			    this.y_nord[2] = 70+separation*3;
			    this.y_west[0] = 20+separation*3;
			    this.y_west[1] = 120+separation*3;
			    this.y_west[2] = 70+separation*3;

			    this.couleur[0] = "R";
			    this.couleur[1] = "N";
			    this.couleur[2] = "V";
			    this.couleur[3] = "N";
            }
		}
        else if(id == 17)
		{
            if(t == 2)
            {
			    this.x_sud[0] = 20+separation*2;
			    this.x_sud[1] = 120+separation*2;
			    this.x_sud[2] = 70+separation*2;
			    this.x_est[0] = 120+separation*2;
			    this.x_est[1] = 120+separation*2;
			    this.x_est[2] = 70+separation*2;
			    this.x_nord[0] = 120+separation*2;
			    this.x_nord[1] = 20+separation*2;
			    this.x_nord[2] = 70+separation*2;
			    this.x_west[0] = 20+separation*2;
			    this.x_west[1] = 20+separation*2;
			    this.x_west[2] = 70+separation*2;

			    this.y_sud[0] = 120+separation*4;
			    this.y_sud[1] = 120+separation*4;
			    this.y_sud[2] = 70+separation*4;
			    this.y_est[0] = 120+separation*4;
			    this.y_est[1] = 20+separation*4;
			    this.y_est[2] = 70+separation*4;
			    this.y_nord[0] = 20+separation*4;
			    this.y_nord[1] = 20+separation*4;
			    this.y_nord[2] = 70+separation*4;
			    this.y_west[0] = 20+separation*4;
			    this.y_west[1] = 120+separation*4;
			    this.y_west[2] = 70+separation*4;

			    this.couleur[0] = "N";
			    this.couleur[1] = "B";
			    this.couleur[2] = "N";
			    this.couleur[3] = "V";
            }
		}
        else if(id == 18)
		{
            if(t == 2)
            {
                this.x_sud[0] = 20+separation*3;
			    this.x_sud[1] = 120+separation*3;
			    this.x_sud[2] = 70+separation*3;
			    this.x_est[0] = 120+separation*3;
			    this.x_est[1] = 120+separation*3;
			    this.x_est[2] = 70+separation*3;
			    this.x_nord[0] = 120+separation*3;
			    this.x_nord[1] = 20+separation*3;
			    this.x_nord[2] = 70+separation*3;
			    this.x_west[0] = 20+separation*3;
			    this.x_west[1] = 20+separation*3;
			    this.x_west[2] = 70+separation*3;
                
			    this.y_sud[0] = 120+separation*4;
			    this.y_sud[1] = 120+separation*4;
			    this.y_sud[2] = 70+separation*4;
			    this.y_est[0] = 120+separation*4;
			    this.y_est[1] = 20+separation*4;
			    this.y_est[2] = 70+separation*4;
			    this.y_nord[0] = 20+separation*4;
			    this.y_nord[1] = 20+separation*4;
			    this.y_nord[2] = 70+separation*4;
			    this.y_west[0] = 20+separation*4;
			    this.y_west[1] = 120+separation*4;
			    this.y_west[2] = 70+separation*4;

			    this.couleur[0] = "B";
			    this.couleur[1] = "N";
			    this.couleur[2] = "N";
			    this.couleur[3] = "V";
            }
		}
	}

	public int getId() {
		return id;
	}

	public int[] getX_sud() {
		return x_sud;
	}

	public void setX_sud(int x_sud, int i) {
		this.x_sud[i] = x_sud;
	}

	public int[] getX_est() {
		return x_est;
	}

	public void setX_est(int x_est, int i) {
		this.x_est[i] = x_est;
	}

	public int[] getX_nord() {
		return x_nord;
	}

	public void setX_nord(int x_nord, int i) {
		this.x_nord[i] = x_nord;
	}

	public int[] getX_west() {
		return x_west;
	}

	public void setX_west(int x_west, int i) {
		this.x_west[i] = x_west;
	}

	public int[] getY_sud() {
		return y_sud;
	}

	public void setY_sud(int y_sud, int i) {
		this.y_sud[i] = y_sud;
	}

	public int[] getY_est() {
		return y_est;
	}

	public void setY_est(int y_est, int i) {
		this.y_est[i] = y_est;
	}

	public int[] getY_nord() {
		return y_nord;
	}

	public void setY_nord(int y_nord, int i) {
		this.y_nord[i] = y_nord;
	}

	public int[] getY_west() {
		return y_west;
	}

	public void setY_west(int y_west, int i) {
		this.y_west[i] = y_west;
	}

	public String getCouleur(int i) {
		return couleur[i];
	}
	
	public String[] getCouleur() {
		return couleur;
	}

	public void setCouleur(String[] couleur) {
		this.couleur = couleur;
	}
	
	public void setCouleur(String couleur, int i) {
		this.couleur[i] = couleur;
	}

}
