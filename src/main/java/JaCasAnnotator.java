import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

public class JaCasAnnotator extends JCasAnnotator_ImplBase {
  Chunker chunker;

  @Override
  public void initialize(org.apache.uima.UimaContext aContext)
          throws org.apache.uima.resource.ResourceInitializationException {
    try {
      chunker = (Chunker) AbstractExternalizable.readObject(new File(this.getClass().getClassLoader().getResource((String) aContext.getConfigParameterValue("GenesFilename")).getFile()));
    } catch (Exception e) {
      e.printStackTrace();
    }

    super.initialize(aContext);
  }

  private static int countSpaces(String str, int until) {
    return StringUtils.countMatches(str.substring(0, until), " ");
  }

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    String docText = arg0.getDocumentText();
    for (Chunk chunk : chunker.chunk(docText).chunkSet()) {
      NamedEntityAnnotation nea = new NamedEntityAnnotation(arg0);
      nea.setBegin(chunk.start() - countSpaces(docText, chunk.start()));
      nea.setEnd(chunk.end() - countSpaces(docText, chunk.end()) - 1);
      nea.setNamedEntity(docText.substring(chunk.start(), chunk.end()));
      nea.addToIndexes();
    }
  }

}
