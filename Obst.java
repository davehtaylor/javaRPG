public class Obst
{
	private String  name;
	private String  description;
	private double  r;					//radius or length
	private char    shape;				//circular c or polygonal p
	private boolean occAllowed  = false;//can stand in the same location
	private boolean passAllowed = true;	//can pass through

	


	public boolean withinObst(double landingPosition[])
	{
		double distance;

		distance = Area.distanceFrom(landingPosition, position);

		if (shape == c)
		{
			if (distance < r && passAllowed)
			{
				return true;
			}

			else
			{
				return false;
			}
		}

		else if (shape == p)
			// cast ray from starting to ending position
			// if the number of intersections is odd
			// return true
			// else if the number of intersections is even AND the object is passable
			// return false
	}
}