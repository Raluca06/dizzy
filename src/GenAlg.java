
public class GenAlg {
    
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

	  void Crossover(const vector<double> &mum,

	                 const vector<double> &dad,

	                 vector<double>       &baby1,

	                 vector<double>       &baby2);

	 

	  void Mutate(vector<double> &chromo);

	 

	  Genome getChromoRoulette();

	 

	  void GrabNBest(int NBest, const int NumCopies,

	                 vector<SGenome> &vecPop);

	 

	void CalculateBestWorstAvTot();

	 

	public void Reset();

	public GenAlg(int popsize, double mutRat, double CrossRat, int numweights);

	  //this runs the GA for one generation.
	  public NVector<Genome> Epoch(NVector<Genome> old_pop);

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
