class Salary
{
    Security security = null;
    public Salary(Security security)
    {
        this.security = security;
    }

    public void calSalary()
    {
        int presentdays = 0,absentdays = 0,halfdays = 0;
        System.out.println("name : "+ security.getName()+"  id : "+ security.getId()+"  ege : "+ security.getEge()+"  day allowence : "+ security.getDa());
       
        for(int a:security.getAttendance())
        {
            if(a==1)
            {
                presentdays += 1;
            }
            else if(a==-1)
            {
                halfdays += 1;
            }
            else
            {
                absentdays +=1;
            }
        }
        System.out.println("present: "+presentdays+"  absent: "+absentdays+"  half: "+halfdays);
        System.out.println("allocated holidays: "+ security.getHoliday());
        double sum,overday,t_absent;
        if(absentdays==security.getHoliday())
            sum = presentdays*security.getDa() + halfdays*0.5*security.getDa() + security.getHoliday()*security.getDa();
        else if(absentdays < security.getHoliday())
        {
            overday = security.getHoliday() - absentdays;
            System.out.println("overday: "+overday);
            sum = presentdays*security.getDa() + halfdays*0.5*security.getDa() + overday*security.getDa();
        }
        else
        {
            t_absent = absentdays - security.getHoliday();
            System.out.println("Total absent days: "+ t_absent);
            sum = presentdays*security.getDa() + halfdays*0.5*security.getDa()+ security.getHoliday()*security.getDa();
        }
        System.out.println("salary: "+sum);
        System.out.println(security.getTax()+"% tax : "+security.getTax()*sum/100+"  "+security.getPf()+"% PF : "+ security.getPf()*sum/100);
        double newsalary;
        newsalary = sum - security.getTax()*sum/100 - security.getPf()*sum/100;
        System.out.println("In hand salary : "+newsalary);
    }
}