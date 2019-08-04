class C_salary
{
    CEO ceo = null;
    public C_salary(CEO ceo)
    {
        this.ceo = ceo;
    }

    public void calSalary()
    {
        int presentdays = 0,absentdays = 0,halfdays = 0;
        System.out.println("name : "+ ceo.getName()+"  id : "+ ceo.getId()+"  ege : "+ ceo.getEge()+"  day allowence : "+ ceo.getDa());


        for(int a:ceo.getAttendance())
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
        System.out.println("allocated holidays: "+ ceo.getHoliday());
        double sum,overday,t_absent;
        if(absentdays==ceo.getHoliday())
            sum = presentdays*ceo.getDa() + halfdays*0.5*ceo.getDa() + ceo.getHoliday()*ceo.getDa();
        else if(absentdays < ceo.getHoliday())
        {
            overday = ceo.getHoliday() - absentdays;
            System.out.println("overday: "+overday);
            sum = presentdays*ceo.getDa() + halfdays*0.5*ceo.getDa() + overday*ceo.getDa();
        }
        else
        {
            t_absent = absentdays - ceo.getHoliday();
            System.out.println("Total absent days: "+ t_absent);
            sum = presentdays*ceo.getDa() + halfdays*0.5*ceo.getDa()+ ceo.getHoliday()*ceo.getDa();
        }
        System.out.println("salary: "+sum);
        System.out.println(ceo.getTax()+"% tax : "+ceo.getTax()*sum/100+"  "+ceo.getPf()+"% PF : "+ ceo.getPf()*sum/100);
        double newsalary;
        newsalary = sum - ceo.getTax()*sum/100 - ceo.getPf()*sum/100;
        System.out.println("In hand salary : "+newsalary);
    }
}