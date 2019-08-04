class A_salary
{
    Asistant asistant = null;
    public A_salary(Asistant asistant)
    {
        this.asistant = asistant;
    }

    public void calSalary()
    {
        int presentdays = 0,absentdays = 0,halfdays = 0;
        System.out.println("name : "+ asistant.getName()+"  id : "+ asistant.getId()+"  ege : "+ asistant.getEge()+"  day allowence : "+ asistant.getDa());


        for(int a:asistant.getAttendance())
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
        System.out.println("allocated holidays: "+ asistant.getHoliday());
        double sum,overday,t_absent;
        if(absentdays == asistant.getHoliday())
            sum = presentdays*asistant.getDa() + halfdays*0.5*asistant.getDa() + asistant.getHoliday()*asistant.getDa();
        else if(absentdays < asistant.getHoliday())
        {
            overday = asistant.getHoliday() - absentdays;
            System.out.println("overday: "+overday);
            sum = presentdays*asistant.getDa() + halfdays*0.5*asistant.getDa() + overday*asistant.getDa();
        }
        else
        {
            t_absent = absentdays - asistant.getHoliday();
            System.out.println("Total absent days: "+ t_absent);
            sum = presentdays*asistant.getDa() + halfdays*0.5*asistant.getDa()+ asistant.getHoliday()*asistant.getDa();
        }
        System.out.println("salary: "+sum);
        System.out.println(asistant.getTax()+"% tax : "+asistant.getTax()*sum/100+"  "+asistant.getPf()+"% PF : "+ asistant.getPf()*sum/100);
        double newsalary;
        newsalary = sum - asistant.getTax()*sum/100 - asistant.getPf()*sum/100;
        System.out.println("In hand salary : "+newsalary);
    }
}