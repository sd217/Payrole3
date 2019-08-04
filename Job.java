class Job
{
    private String emp_name;
    private int emp_id;
    private float emp_ege;

    public String getName()
    {
        return emp_name;
    }
    public void setName(String name)
    {
        this.emp_name = name;
    }

    public int getId()
    {
        return emp_id;
    }
    public void setId(int id)
    {
        this.emp_id = id;
    }

    public float getEge()
    {
        return emp_ege;
    }
    public void setEge(float ege)
    {
        this.emp_ege = ege;
    }
}