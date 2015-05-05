
public class Genome {
	
	private NVector<Double>  vecWeights;
	private Double fitness = 0.0;

	public Genome( NVector<Double> w, Double f){
		this.setVecWeights(w);
		this.fitness = f;
	}

	  //overload '<' used for sorting

	  public Boolean sort(Genome lhs, Genome rhs)

	  {
	    return (lhs.fitness < rhs.fitness);
	  }

	public NVector<Double> getVecWeights() {
		return vecWeights;
	}

	public void setVecWeights(NVector<Double> vecWeights) {
		this.vecWeights = vecWeights;
	}

}
