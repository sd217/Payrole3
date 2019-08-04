class M_salary
{
    Manager manager = null;
    public M_salary(Manager manager)
    {
        this.manager = manager;
    }

    public void calSalary()
    {
        int presentdays = 0,absentdays = 0,halfdays = 0;
        System.out.println("name : "+ manager.getName()+"  id : "+ manager.getId()+"  ege : "+ manager.getEge()+"  day allowence : "+ manager.getDa());


        for(int a:manager.getAttendance())
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
        System.out.println("allocated holidays: "+ manager.getHoliday());
        double sum,overday,t_absent;
        if(absentdays==manager.getHoliday())
            sum = presentdays*manager.getDa() + halfdays*0.5*manager.getDa() + manager.getHoliday()*manager.getDa();
        else if(absentdays < manager.getHoliday())
        {
            overday = manager.getHoliday() - absentdays;
            System.out.println("overday: "+overday);
            sum = presentdays*manager.getDa() + halfdays*0.5*manager.getDa() + overday*manager.getDa();
        }
        else
        {
            t_absent = absentdays - manager.getHoliday();
            System.out.println("Total absent days: "+ t_absent);
            sum = presentdays*manager.getDa() + halfdays*0.5*manager.getDa()+ manager.getHoliday()*manager.getDa();
        }
        System.out.println("salary: "+sum);
        System.out.println(manager.getTax()+"% tax : "+manager.getTax()*sum/100+"  "+manager.getPf()+"% PF : "+ manager.getPf()*sum/100);
        double newsalary;
        newsalary = sum - manager.getTax()*sum/100 - manager.getPf()*sum/100;
        System.out.println("In hand salary : "+newsalary);
    }
}
