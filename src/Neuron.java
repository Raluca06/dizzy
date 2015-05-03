import java.util.ArrayList;


public class Neuron {

	// the number of inputs into the neuron
	private int numInputs;

	// the weights for each input
	private NVector<Double> vecWeight;

	public Neuron(int numInputs) {
		this.numInputs = numInputs;
		// we need an additional weight for the bias hence the +1
		for (int i = 0; i < numInputs + 1; ++i) {
			// set up the weights with an initial random value
			vecWeight.getVector().add(Math.random());
		}
	}

	public NVector<Double> getInputWeights() {
		return vecWeight;
	}

	public void setInputWeights(ArrayList<Double> inputWeights) {
		this.vecWeight.setVector(inputWeights);
	}

	public void setWeight(int inputPosition, Double weight) {
		this.vecWeight.getVector().add(inputPosition, weight);
	}

	public int getNumInputs() {
		return numInputs;
	}

	public void initializeWeights() {
		for (Double weight : this.vecWeight.getVector()) {
			weight = Math.random();
		}
	}

}
