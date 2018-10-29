public class JackOLantern {
    private String[][] faceFeatures ;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public static void edit(String replace, int row, int column)
    {

    }
    public fill(String row)
    {

    }

    public String toString()
    {
        String row = "";

        for(int i=0; i<faceFeatures.length; i++)
        {
            for(int j=0; j<faceFeatures[i].length; j++)
            {
                row += faceFeatures[i][j];
            }
            row += "\n";
        }
        return row;
    }
}