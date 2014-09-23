import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;


public class CrapCollectionReader extends CollectionReader_ImplBase
{
    private Scanner sc;
    
    @Override
    public void initialize()
    {
        try
        {
            sc = new Scanner(new BufferedReader(new FileReader((String) getConfigParameterValue("ShitString"))));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void getNext(CAS arg0) throws IOException, CollectionException
    {
        String line = sc.nextLine();
        String[] shits =  line.split(" ", 2);
        try
        {
            JCas jarg0n = arg0.getJCas();
            jarg0n.setDocumentText(shits[1]);
            ShittySentenceID ssid = new ShittySentenceID(jarg0n);
            ssid.setID(shits[0]);
            ssid.addToIndexes();
        }
        catch (CASException e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void close() throws IOException
    {
        sc.close();
    }
    
    @Override
    public Progress[] getProgress()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean hasNext() throws IOException, CollectionException
    {
        return sc.hasNext();
    }
    
}
