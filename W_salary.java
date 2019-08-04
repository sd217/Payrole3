class W_salary
{
    Worker ob = null;
    public W_salary(Worker ob)
    {
        this.ob = ob;
    }

    public void calSalary()
    {
        int presentdays = 0,absentdays = 0,halfdays = 0;
        System.out.println("name : "+ ob.getName()+"  id : "+ ob.getId()+"  ege : "+ ob.getEge()+"  day allowence : "+ ob.getDa());


        for(int a:ob.getAttendance())
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
        System.out.println("allocated holidays: "+ ob.getHoliday());
        double sum,overday,t_absent;
        if(absentdays==ob.getHoliday())
            sum = presentdays*ob.getDa() + halfdays*0.5*ob.getDa() + ob.getHoliday()*ob.getDa();
        else if(absentdays < ob.getHoliday())
        {
            overday = ob.getHoliday() - absentdays;
            System.out.println("overday: "+overday);
            sum = presentdays*ob.getDa() + halfdays*0.5*ob.getDa() + overday*ob.getDa();
        }
        else
        {
            t_absent = absentdays - ob.getHoliday();
            System.out.println("Total absent days: "+ t_absent);
            sum = presentdays*ob.getDa() + halfdays*0.5*ob.getDa()+ ob.getHoliday()*ob.getDa();
        }
        System.out.println("salary: "+sum);
        System.out.println(ob.getTax()+"% tax : "+ob.getTax()*sum/100+"  "+ob.getPf()+"% PF : "+ ob.getPf()*sum/100);
        double newsalary;
        newsalary = sum - ob.getTax()*sum/100 - ob.getPf()*sum/100;
        System.out.println("In hand salary : "+newsalary);
    }
}