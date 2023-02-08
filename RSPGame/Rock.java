public class Rock extends Shape {

    @Override
    public int winsWith() {
        return Shapes.SCISSOR.ordinal();
        
    }
    
}
