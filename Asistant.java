class Asistant extends Job
{
      private int[] attendance;
    private int holiday;
    private float da;//one day salary
    private float tax;
    private float pf;
    public int[] getAttendance()
    {
        return attendance;
    }
    public void setAttendance(int[] a)
    {
        this.attendance = a;
    }
    public int getHoliday()
    {
        return holiday;
    } 
    public void setHoliday(int a)
    {
        this.holiday = a;
    }
    public float getDa()
    {
        return da;
    }
    public void setDa(float a)
    {
        this.da = a;
    }
    public float getTax()
    {
        return tax;
    }
    public void setTax(float a)
    {
        this.tax = a;
    }
    public float getPf()
    {
        return pf;
    }
    public void setPf(float a)
    {
        this.pf = a;
    }
}