//Defines a play area.

public class Area
{
	private String  place;
	private double  size[1];
	private double  position[1];
	private boolean indoor;
	private boolean safe;	//Can't initiate combat


	public Area(String place, double size, double position, boolean indoor, boolean safe)
	{
		this.place  = place;
		this.size   = size;
		this.indoor = true;
		this.safe   = false;
	}

	public double getSize()
	{
		return size;
	}

	public void setIndoor
	{

	}


	public double[] setPosition(double currentPosition[], double magnitude, String direction)
	{

		private int i = 0;
		private double xMag;
		private double yMag;
		private double returnPosition[1];
		private float r;

		switch(String)
		{
			case "n":
				xMag = 0;
				yMag = magnitude;

			case "ne":
				xMag = (0.707107) * magnitude		//multiply x and y by sqrt2/2. How accurate should this be? maybe use a trig function instead.
				yMag = (0.707107) * magnitude

			case "nw":
				xMag = -(0.707107) * magnitude
				yMag =  (0.707107) * magnitude

			case "s":
				xMag =  0;
				yMag = -1 * magnitude;

			case "se":
				xMag =  (0.707107) * magnitude
				yMag = -(0.707107) * magnitude

			case "sw";
				xMag = -(0.707107) * magnitude
				yMag = -(0.707107) * magnitude

			case "e":
				xmag = magnitude;
				ymag = 0;

			case "w":
				xMag = -1 * magnitude
				ymag =  0;
		}


		position[0] = currentPosition[0] + xMag;
		position[1] = currentPosition[1] + yMag;

		if ( (currentPosition[0] + xMag) > (size[0]/2 || -(size[0]/2) ||
	 		 (currentPosition[1] + yMag) > (size[1]/2 || -(size[1]/2) || 
	  			Obst.withinObst(position) == false )
		{
			System.out.println("You can't go there.");
		}


		else
		{
			return position;
		}
	}

	public double[] distanceFrom(double currentPosition[], double endingPosition[])
	{
		int a;
		int b;
		int c;

		a = currentPosition[0] - endingPosition[0];
		b = currentPosition[1] - endingPosition[1];
		c = Math.sqrt( (a*a) - (b*b) );

		return c;

	}
}