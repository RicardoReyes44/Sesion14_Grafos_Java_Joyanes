
public class GrafoMatriz {

	int numVerts;
	static int maxVerts = 20;
	Vertice [] verts;
	int [][] matAd;
	
	public GrafoMatriz(int mx)
	{
	    matAd = new int [mx][mx];
	    verts = new Vertice[mx];
	    for (int i = 0; i < mx; i++)
	         for (int j = 0; i < mx; i++)
	             matAd[i][j] = 0;
	    numVerts = 0;
	}
	
}
