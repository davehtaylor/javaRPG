//Defines a play area.


public class Area
{
	private String   place;
	private double[] size     = new double[1];
	private double[] position = new double[1];
	private boolean  indoor;
	private boolean  safe;	//Can't initiate combat


	public Area(String place, double x , double y, double[] position, boolean indoor, boolean safe)
	{
		this.place    = place;
		this.size     = size;
		this.position = position;
		this.indoor   = true;
		this.safe     = false;
	}

	public double[] getSize()
	{
		return size;
	}

	public void setIndoor()
	{
		return;
	}

	public double[] getPosition()
	{
		return position;
	}


	public double[] setPosition(double currentPosition[], double magnitude, String direction)
	{

		int    i = 0;
		double xMag = 0;
		double yMag = 0;
		double[] returnPosition = new double[1];
		float  r;

		switch(direction)
		{
			case "n":
				xMag = 0;
				yMag = magnitude;
				break;

			case "ne":
				xMag = (0.707107) * magnitude;		//multiply x and y by sqrt2/2. How accurate should this be? maybe use a trig function instead.
				yMag = (0.707107) * magnitude;
				break;

			case "nw":
				xMag = -(0.707107) * magnitude;
				yMag =  (0.707107) * magnitude;
				break;

			case "s":
				xMag =  0;
				yMag = -1 * magnitude;
				break;

			case "se":
				xMag =  (0.707107) * magnitude;
				yMag = -(0.707107) * magnitude;
				break;

			case "sw":
				xMag = -(0.707107) * magnitude;
				yMag = -(0.707107) * magnitude;
				break;

			case "e":
				xMag = magnitude;
				yMag = 0;
				break;

			case "w":
				xMag = -1 * magnitude;
				yMag =  0;
				break;

			default:
				break;

		}


		position[0] = currentPosition[0] + xMag;
		position[1] = currentPosition[1] + yMag;

		if ( ( Math.abs(position[0]) > Math.abs(size[0]) ) ||
	 		 ( Math.abs(position[1]) > Math.abs(size[1]) ) )// ||
	  		 //Obst.withinObst(position) == false )
		{
			System.out.println("You can't go there.");
			return currentPosition;
		}


		else
		{
			return position;
		}


	}

	//Determine distance using a pythagorean identity
	public double distanceFrom(double currentPosition[], double endingPosition[])
	{
		double a;
		double b;
		double c;

		a = currentPosition[0] - endingPosition[0];
		b = currentPosition[1] - endingPosition[1];
		c = Math.sqrt( (a*a) - (b*b) );

		return c;

	}
}