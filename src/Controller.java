
public class Controller {
	public update(){

		  //run the sweepers through CParams::iNumTicks amount of cycles. During

		  //this loop each sweeper's NN is constantly updated with the appropriate

		  //information from its surroundings. The output from the NN is obtained

		  //and the sweeper is moved. If it encounters a mine its fitness is

		  //updated appropriately,

		  if (m_iTicks++ < CParams::iNumTicks)

		  {

		    for (int i=0; i<m_NumSweepers; ++i)

		    {

		 

		      //update the NN and position

		      if (!m_vecSweepers[i].Update(m_vecMines))

		      {

		        //error in processing the neural net

		        MessageBox(m_hwndMain, "Wrong amount of NN inputs!", "Error", MB_OK);

		        return false;

		      }

		 

		      //see if it's found a mine

		      int GrabHit = m_vecSweepers[i].CheckForMine(m_vecMines, CParams::dMineScale);

		 

		      if (GrabHit >= 0)

		      {

		        //we have discovered a mine so increase fitness

		        m_vecSweepers[i].IncrementFitness();

		 

		       //mine found so replace the mine with another at a random

		       //position

		       m_vecMines[GrabHit] = SVector2D(RandFloat() * cxClient, RandFloat() * cyClient);

		      }

		 

		      //update the fitness score

		      m_vecThePopulation[i].dFitness = m_vecSweepers[i].Fitness();

		    }

		  }
		//Another generation has been completed.
		  //Time to run the GA and update the sweepers with their new NNs

		  else

		  {

		    //increment the generation counter

		    ++m_iGenerations;

		 

		    //reset cycles

		    m_iTicks = 0;

		 

		    //run the GA to create a new population

		    m_vecThePopulation = m_pGA->Epoch(m_vecThePopulation);

		 

		    //insert the new (hopefully)improved brains back into the sweepers

		    //and reset their positions etc

		    for (int i=0; i<m_NumSweepers; ++i)

		    {

		      m_vecSweepers[i].PutWeights(m_vecThePopulation[i].vecWeights);


		      m_vecSweepers[i].Reset();

		    }

		  }

		  return true;

		} 

}
