package lo_inheritance.monsters;

public class EvilEye extends Monster
{
    private int range;

    public EvilEye(String sName, int nScare, int nSpeed, int nDistance)
    {
        super(sName,nSpeed >= 0 && nSpeed <=2 ? nSpeed:2,nScare);
        this.range = nDistance;
    }
    @Override
    public boolean isDeadly()
    {
        return true;
    }

    @Override
    public String consumes()
    {
        return "Souls";
    }

    @Override
    public String toString()
    {
        return String.format("EvilEye: %s Hits at %d", super.toString(), this.range);
    }

    public int getRange()
    {
        return range;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        EvilEye evilEye = (EvilEye) o;
        return range == evilEye.range;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
