package goddrinksjava;

/**
 * Makes thing lovable
 */
public class Lovable implements Thing, PointSet, Circle, SineWave, Sequence {
    private final String who;
    private final int int1;
    private final boolean bool1;
    private final int int2;
    private final boolean bool2;

    public Lovable(String who, int int1, boolean bool1, int int2, boolean bool2) {
        this.who = who;
        this.int1 = int1;
        this.bool1 = bool1;
        this.int2 = int2;
        this.bool2 = bool2;
    }

    @Override
    public void addAttribute(Attribute attribute) {
        
    }

    @Override
    public void addAction(String action, Vector location) {
        
    }

    @Override
    public Dimensions getDimensions() {
        return new Dimensions();
    }

    @Override
    public Circumference getCircumference() {
        return new Circumference();
    }

    @Override
    public int getXPosition() {
        return 0;
    }

    @Override
    public Vector getTangent(int xPosition) {
        return null;
    }

    @Override
    public void setLimit(Limit limit) {

    }

    @Override
    public Limit toLimit() {
        return new Limit();
    }

    @Override
    public void toggleCurrent() {

    }

    @Override
    public void canSee(boolean canSee) {

    }

    @Override
    public void addFeeling(String feeling) {

    }

    @Override
    public int getNumSimulationsAvailable() {
        return 0;
    }

    @Override
    public int getNumSimulationsNeeded() {
        return 0;
    }

    @Override
    public void setSatisfaction(Satisfaction satisfaction) {

    }

    @Override
    public Satisfaction toSatisfaction() {
        return new Satisfaction();
    }

    @Override
    public int getFeelingIndex(String feeling) {
        return 0;
    }

    @Override
    public void requestExecution(World world) {

    }

    @Override
    public Nutrients getNutrients() {
        return new Nutrients();
    }

    @Override
    public void resetNutrients() {

    }

    @Override
    public Antioxidants getAntioxidants() {
        return new Antioxidants();
    }

    @Override
    public void resetAntioxidants() {

    }

    @Override
    public void purr() {

    }

    @Override
    public void setProof(Proof proof) {

    }

    @Override
    public Proof toProof() {
        return new Proof();
    }

    @Override
    public void toggleGender() {

    }

    @Override
    public void toggleRoleBDSM() {

    }

    @Override
    public boolean getSenseIndex(String sense) {
        return false;
    }

    @Override
    public void lookFor(Thing you, World world) {

    }

    @Override
    public void removeFeeling(String feeling) {

    }

    @Override
    public Memory getMemory() {
        return new Memory();
    }

    @Override
    public OpinionIndex getOpinionIndex(String opinion) {
        return null;
    }

    @Override
    public void setOpinion(OpinionIndex opinion, boolean agree) {

    }

    @Override
    public Execution toExecution() {
        return null;
    }

    @Override
    public void setExecution(Execution execution) {

    }

    @Override
    public void escape(World world) {

    }

    @Override
    public void learnTopic(String topic) {

    }

    @Override
    public void takeExamTopic(String topic) {

    }

    @Override
    public void getAlgebraicExpression(String ofWhat) {

    }

    @Override
    public void escape(String what) {

    }
}
