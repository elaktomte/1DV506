package cf222jf_lab4;
import java.util.*;



/*Skapa en klass RandomWalk.java som simulerar en slumpvandring. En slumpvandring utförs på ett begränsat plan och varje steg består av en förflyttning i en slumpmässig riktning. Vandringen upphör när ett maximalt antal steg har tagits eller när ett steg tas ut från det givna planet.
Antag att planet är givet av ett rutnät, där punkt (0, 0) ligger i mitten. 
Storleken på planet bestäms av ett heltal; om värdet på heltalet är k så kan x- och y-koordinaterna för punkter på planet variera från –k till k. I varje steg sker en förflyttning ett steg upp, ett steg ner, ett steg till höger eller ett steg till vänster (inga diagonala steg).

Klassen RandomWalk behöver följande fält:

X-koordinaten för nuvarande position
Y-koordinaten för nuvarande position
Det maximala antalet steg en vandring får ha
Antalet steg tagna hittills i vandringen
Storleken på planet (enligt ovan)*/

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
		String point = "("+x+','+y+")   Antal steg är "+steps;
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
