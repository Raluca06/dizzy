
public abstract class GenAlg {
    
    /**
     * this holds the entire population of chromosomes
     */
    private NVector<Genome> vecPop;

    /**
     * size of population
     */
    private int popSize;

    /**
     * amount of weights per chromosomes
     */
    private int chromoLength;

    /**
     * total fitness of population
     */
    private double totalFitness;

    /**
     * best fitness this population
     */
    private double bestFitness;

    /**
     * average fitness
     */
    private double averageFitness;

    /**
     * worst
     */
    private double worstFitness;

    /**
     * keeps track of the best genome
     */
    private int fittestGenome;

    /**
     * probability that the bits of a chromosome will mutate.
     * Try figures around 0.05 to 0.3 ish
     */
    private double mutationRate;

    /**
     * probability of chromosomes crossing over bits
     * 0.7 is pretty good
     */
    private double crossoverRate;

    /**
     * generation counter
     */
    private int generationCounter;

    public void crossover(NVector<Double> mum, NVector<Double> dad, NVector<Double> baby1, NVector<Double> baby2){
    	
    }

	 

    public void mutate(NVector<Double> chromo){
    	
    }

    private Genome getChromoRoulette(){
    	return null;
    }

	 

	 public void GrabNBest(int NBest, final int NumCopies, NVector<Genome> vecPop){
		  
	  }

	 public void calculateBestWorstAvTot(){
		 
	 }

	public void reset(){
		
	}

	public void genAlg(int popsize, double mutRat, double CrossRat, int numweights){
		
	}

	  //this runs the GA for one generation.
	  public NVector<Genome> getEpoch(NVector<Genome> old_pop){
		  return null;
	  }

	  public NVector<Genome> getChromos(){
	      return this.vecPop;
	  }

	  public double AverageFitness(){
	      return this.totalFitness / this.popSize;
	  }

	  public double getBestFitness(){
	      return this.bestFitness;
	  }

}
