package ShapeOpdracht;

public class IsoScelesTriangle extends Triangle {

    private static int count;

    {
        count++;
    }

    public IsoScelesTriangle() {

        this(0, 0, 0);

    }

    public IsoScelesTriangle(int height, int width, int perpendicular) {


        super(height, width, perpendicular);
    }

    public IsoScelesTriangle(int x, int y, int height, int width, int perpendicular) {
        super(x, y, height, width, perpendicular);
    }

    public IsoScelesTriangle(IsoScelesTriangle isoTri) {
        super(isoTri);

    }


    @Override
    public void setWidth(int width) {


            super.setWidth(width);



    }


    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
    }

    public static int getCount() {
        return count;
    }


}
