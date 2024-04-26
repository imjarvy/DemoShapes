public abstract class shape {
    private int cordenadaX=0;
    private int cordenadaY=0;
    public int getCordenadaX() {
        return cordenadaX;
    }
    public void setCordenadaX(int newcordenadaX) {
       cordenadaX = newcordenadaX;
    }
    public int getCordenadaY() {
        return cordenadaY;
    }
    public void setCordenadaY(int newcordenadaY) {
       cordenadaY = newcordenadaY;
    }
     public abstract float getArea();
     public abstract float getPerimetro();
}
