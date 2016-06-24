public class populationProjection{

	public static void main(String[] args) {
	//declare population
	 final int population = 312032486;

        //declare seconds constant
	 final int seconds = 3153600;	      

        //start of computing birth
	 int birth = seconds / 7;

	//start computing death
	 int death = seconds / 13;
	
	//start computing immigrant
	 int immigrant = seconds / 45;

	//add up birth, death, immigrant
	 int populationIncrease = birth - death + immigrant;

	//year one population
	 int populationYearOne = population + populationIncrease;

	//year two population
	 int populationYearTwo = (populationIncrease * 2) + population;
	 
	 //year three population
	 int populationYearThree = (populationIncrease * 3) + population;

	//year four population
	 int populationYearFour = (populationIncrease * 4) + population;

	//year five population
	 int populationYearFive = (populationIncrease * 5) + population;

		//print year results
		System.out.println("The population the first year is "+populationYearOne);
		System.out.println("The population the second year is "+populationYearTwo);
		System.out.println("The population the third year is "+populationYearThree);
		System.out.println("The population the fourth year is "+populationYearFour);
		System.out.println("The population the fith year is "+populationYearFive);
   }

}

