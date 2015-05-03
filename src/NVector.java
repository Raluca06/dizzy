import java.util.ArrayList;

public class NVector<T> {
	private ArrayList<T> vector;

	public NVector() {
		this.vector = new ArrayList<T>();
	}

	/**
	 * For adding an item to the vector call getVector().add(T x);
	 * 
	 * @return vector
	 */
	public ArrayList<T> getVector() {
		return this.vector;
	}

	public int getVectorSize() {
		return this.vector.size();
	}

	public void setVector(ArrayList<T> array) {
		this.vector = array;
	}

}
