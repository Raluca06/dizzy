public class NeuralNet {
	private int numInputs;
	private int numOutputs;
	private int numHiddenLayers;
	private int neuronsPerHiddenLyr;
	private Double bias;
	private Double activationResponse;

	/**
	 * storage for each layer of neurons including the output layer
	 */
	private NVector<NeuronLayer> vectorLayers;

	public NeuralNet() {

	}

	public void createNet() {

	}

	/**
	 * gets the weights from the NN
	 * 
	 * @return
	 */
	public NVector<Double> getWeights() {
		return null;
	}

	/**
	 * returns the total number of weights in the net
	 * 
	 * @return
	 */
	public int getNumberOfWeights() {
		return 0;
	}

	/**
	 * replaces the weights with new ones
	 * 
	 * @param weights
	 */
	public void putWeights(NVector<Double> weights) {

	}

	/**
	 * calculates the outputs from a set of inputs
	 */
	public NVector<Double> update(NVector<Double> inputs) {
		// stores the resultant outputs from each layer
		NVector<Double> outputs = new NVector<Double>();
		int weight = 0;
		
		//first check that we have the correct amount of inputs
		  if (inputs.getVector().size() != numInputs)
		  {
		    //just return an empty vector if incorrect.
		    return outputs;
		  }
		//For each layer....
		  for (int i=0; i<this.numHiddenLayers + 1; ++i)
		  {
		    if ( i > 0 )
		    {
		      inputs = outputs;
		    }
		    outputs.setVector(null);
		    weight = 0;

		    //for each neuron sum the (inputs * corresponding weights).Throw
		    //the total at our sigmoid function to get the output.
		    for (int j=0; j < vectorLayers.getVector().get(i).getNumNeurons(); ++j)
		    {
		      double netinput = 0;
		      int numberOfInputs = vectorLayers.getVector().get(i).getNeuronList().get(j).getNumInputs();

		      //for each weight
		      for (int k=0; k < numberOfInputs - 1; ++k)
		      {
		        //sum the weights x inputs
		        netinput += vectorLayers.getVector().get(i).getNeuronList().get(j).getInputWeights().getVector().get(k) * inputs.getVector().get(weight++);
		      }

		      //add in the bias
		      netinput += vectorLayers.getVector().get(i).getNeuronList().get(j).getInputWeights().getVector().get(numInputs-1) * bias;

		      //we can store the outputs from each layer as we generate them.
		      //The combined activation is first filtered through the sigmoid function
		      outputs.getVector().add(sigmoid(netinput, activationResponse));
		      weight = 0;
		    }
		  }
		  return outputs;
	}

	/**
	 * sigmoid response curve
	 */
	public Double sigmoid(Double activation, Double response) {
		return null;
	}
	
	public void setBias(Double biasValue){
		this.bias = biasValue;
	}

}
