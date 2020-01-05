package cf222jf_lab4;
import java.util.*;



/*Skapa en klass RandomWalk.java som simulerar en slumpvandring. En slumpvandring utf�rs p� ett begr�nsat plan och varje steg best�r av en f�rflyttning i en slumpm�ssig riktning. Vandringen upph�r n�r ett maximalt antal steg har tagits eller n�r ett steg tas ut fr�n det givna planet.
Antag att planet �r givet av ett rutn�t, d�r punkt (0, 0) ligger i mitten. 
Storleken p� planet best�ms av ett heltal; om v�rdet p� heltalet �r k s� kan x- och y-koordinaterna f�r punkter p� planet variera fr�n �k till k. I varje steg sker en f�rflyttning ett steg upp, ett steg ner, ett steg till h�ger eller ett steg till v�nster (inga diagonala steg).

Klassen RandomWalk beh�ver f�ljande f�lt:

X-koordinaten f�r nuvarande position
Y-koordinaten f�r nuvarande position
Det maximala antalet steg en vandring f�r ha
Antalet steg tagna hittills i vandringen
Storleken p� planet (enligt ovan)*/

public class RandomWalk {
	public int x = 0;
	public int y = 0;
	public int steps = 0;
	public int maximumSteps = 0;
	public int maxSize = 0;
	



	public RandomWalk(int max, int size, int xStart, int yStart){
		x = xStart;
		y = yStart;
		maximumSteps = max;
		maxSize = size;
		steps = 0;

	}

	public String toString(){
		String point = "("+x+','+y+")   Antal steg �r "+steps;
		return point;
	}
	public void takeStep(){
		Random rand = new Random();
		int step = rand.nextInt(4);
		/*if (x >= maxSize && y>= maxSize){
			System.out.println("You have reached the size limit");

		}
		else if (steps == maximumSteps){
			System.out.println("You have all the allowed steps");
		}

		else { */
			if (step == 0){
				y++;

			}
			else if (step == 1){
				y--;
			}
			else if (step == 2){
				x++;
			}
			else if (step == 3) {
				x--;
			}
			steps++;

		}
	public boolean moreSteps(){
		boolean answer = false;
		if (steps < maximumSteps){
			answer = true;
		}
		return answer;

	}
	public boolean inBounds(){
		boolean answer = true;
		if (x > maxSize || y > maxSize || x < (-maxSize) || y < (-maxSize)){
			answer= false;
		}
		return answer;	
	}
	public void walk(){
		while (inBounds() && moreSteps())
			takeStep();
	}
}
