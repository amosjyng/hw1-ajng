
/* First created by JCasGen Mon Sep 22 22:06:38 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Named entity annotation
 * Updated by JCasGen Mon Sep 22 22:22:36 EDT 2014
 * @generated */
public class NamedEntityAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamedEntityAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamedEntityAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamedEntityAnnotation(addr, NamedEntityAnnotation_Type.this);
  			   NamedEntityAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamedEntityAnnotation(addr, NamedEntityAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NamedEntityAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("NamedEntityAnnotation");
 
  /** @generated */
  final Feature casFeat_NamedEntity;
  /** @generated */
  final int     casFeatCode_NamedEntity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNamedEntity(int addr) {
        if (featOkTst && casFeat_NamedEntity == null)
      jcas.throwFeatMissing("NamedEntity", "NamedEntityAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NamedEntity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNamedEntity(int addr, String v) {
        if (featOkTst && casFeat_NamedEntity == null)
      jcas.throwFeatMissing("NamedEntity", "NamedEntityAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_NamedEntity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NamedEntityAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NamedEntity = jcas.getRequiredFeatureDE(casType, "NamedEntity", "uima.cas.String", featOkTst);
    casFeatCode_NamedEntity  = (null == casFeat_NamedEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NamedEntity).getCode();

  }
}



    