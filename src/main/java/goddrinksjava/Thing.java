package goddrinksjava;

/**
 * Just a thing.
 * 
 * 
 * 
 * 
 * 
 * 
 * A lonely thing.
 */
public interface Thing {
    void addAttribute(Attribute attribute);
    
    void addAction(String action, Vector location);
    
    Dimensions getDimensions();

    Circumference getCircumference();
    
    int getXPosition();
    
    Vector getTangent(int xPosition);
    
    void setLimit(Limit limit);
    
    Limit toLimit();
    
    
    
    
    
    
    
    
    
    
    void toggleCurrent();
    
    void canSee(boolean canSee);
    
    void addFeeling(String feeling);

    int getNumSimulationsAvailable();

    int getNumSimulationsNeeded();
    
    void setSatisfaction(Satisfaction satisfaction);
    
    Satisfaction toSatisfaction();
    
    int getFeelingIndex(String feeling);
    
    void requestExecution(World world);
    
    
    
    
    
    
    
    
    
    
    Nutrients getNutrients();
    
    void resetNutrients();
    
    Antioxidants getAntioxidants();
    
    void resetAntioxidants();
    
    void purr();
    
    void setProof(Proof proof);
    
    Proof toProof();
    
    
    
    
    
    
    
    
    
    
    void toggleGender();
    
    void toggleRoleBDSM();
    
    
    
    
    
    
    
    
    
    
    boolean getSenseIndex(String sense);
    
    void lookFor(Thing you, World world);
    
    void removeFeeling(String feeling);
    
    Memory getMemory();
    
    OpinionIndex getOpinionIndex(String opinion);
    
    void setOpinion(OpinionIndex opinion, boolean agree);
    
    
    
    
    
    
    
    
    
    
    Execution toExecution();
    
    void setExecution(Execution execution);
    
    
    
    
    
    
    
    
    
    
    void escape(World world);
    
    
    
    
    
    
    
    
    
    
    void learnTopic(String topic);
    
    void takeExamTopic(String topic);
    
    void getAlgebraicExpression(String ofWhat);
    
    void escape(String what);
}
