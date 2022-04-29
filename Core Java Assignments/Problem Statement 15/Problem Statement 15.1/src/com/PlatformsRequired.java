package com;

public class PlatformsRequired {
	public static int minPlatformsRequired(int[] arivl, int[] deprt, int noOfTrains)
	{
	   // Implement this function that sort two arrays or use library function.
	   sortArray(arivl, noOfTrains);
	   sortArray(deprt, noOfTrains);
	   int maxPlatforms = 0;
	   int platformsRequired = 0;
	   int i = 0, j = 0;
	   // Logic simlar to Merging of two arrays
	   while (i < noOfTrains && j < noOfTrains)
	   {
	      if (arivl[i] < deprt[j])
	      {
	         // New train has arrived.
	         platformsRequired++;
	         i++;
	         if (platformsRequired > maxPlatforms)
	            maxPlatforms = platformsRequired;
	      }
	      else
	      {
	         // Train left the platform.
	         platformsRequired--;
	         j++;
	      }
	   }
	   return maxPlatforms;
	}


	private static void sortArray(int[] arivl,int noOfTrains) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arivl[] = { 900, 940, 950, 1100, 1500, 1800 };
        int deprt[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int noOfTrains = 6;
        System.out.println(
            "Minimum Number of Platforms Required = "
            + minPlatformsRequired(arivl, deprt, noOfTrains));

	}

}
