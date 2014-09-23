

/* First created by JCasGen Mon Sep 22 22:06:38 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Contains ID of ;Sentence
 * Updated by JCasGen Mon Sep 22 22:22:36 EDT 2014
 * XML source: C:/Users/Amos Ng/workspace/hw1-ajng/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class ShittySentenceID extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ShittySentenceID.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ShittySentenceID() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ShittySentenceID(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ShittySentenceID(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ID

  /** getter for ID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (ShittySentenceID_Type.featOkTst && ((ShittySentenceID_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "ShittySentenceID");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ShittySentenceID_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (ShittySentenceID_Type.featOkTst && ((ShittySentenceID_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "ShittySentenceID");
    jcasType.ll_cas.ll_setStringValue(addr, ((ShittySentenceID_Type)jcasType).casFeatCode_ID, v);}    
  }

    