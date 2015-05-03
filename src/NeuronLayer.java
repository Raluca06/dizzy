import java.util.ArrayList;


public class NeuronLayer {
	
	//the number of neurons in this layer
	private int numNeurons;
	
	//the layer of neurons
	private ArrayList<Neuron> neuronList;

	public NeuronLayer(int numNeurons, int numInputsPerNeuron){
		this.neuronList = new ArrayList<Neuron>();
		this.numNeurons = neuronList.size();
	}
	
	public void setNumNeurons(){
		this.numNeurons = this.neuronList.size();
	}
	
	public int getNumNeurons(){
		return this.numNeurons;
	}
	
	public ArrayList<Neuron> getNeuronList(){
		return this.neuronList;
	}

}
