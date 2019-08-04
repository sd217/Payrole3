//import java.util.Scanner;
class Payrole3
{
    public static void main(String args[])
    {
        System.out.println("1-security 2-worker 3-asistant 4-manager 5-CEO");
        // Scanner ob1 = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int count = ob1.nextInt(); 
        int count = Integer.parseInt(args[0]);   

        switch(count)
        {
            case 1:
            {
                 Security security = new Security();
               security.setName("shardul");
                 security.setId(1);
                security.setEge(25);
                security.setDa(500);
                security.setHoliday(4);
                security.setTax(0);
                security.setPf(12);
                security.setAttendance(new int[] {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                Salary salary = new Salary(security);
                 salary.calSalary();
                  break;
            }
            case 2:
            {
                Worker ob = new Worker();
                ob.setName("sd");
                ob.setId(101);
                ob.setEge(35);
                ob.setDa(600);
                ob.setHoliday(4);
                ob.setTax(10);//in percentage
                ob.setPf(12);//in persentage
                ob.setAttendance(new int[] {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                W_salary w_salary = new W_salary(ob);
                 w_salary.calSalary();
                  break;
            }
            case 3:
            {
                Asistant asistant = new Asistant();
                asistant.setName("Harsh");
                asistant.setId(201);
                asistant.setEge(45);
                asistant.setDa(2000);
                asistant.setHoliday(6);
                asistant.setTax(10);//in percentage
                asistant.setPf(12);//in persentage
                asistant.setAttendance(new int[] {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                A_salary a_salary = new A_salary(asistant);
                a_salary.calSalary();
                 break;
            }
            case 4:
            {
                Manager manager = new Manager();
                manager.setName("Harshil");
                manager.setId(301);
                manager.setEge(30);
                manager.setDa(2500);
                manager.setHoliday(7);
                manager.setTax(12);//in percentage
                manager.setPf(12);//in persentage
                manager.setAttendance(new int[] {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                M_salary m_salary = new M_salary(manager);
                 m_salary.calSalary();
                  break;
            }
            case 5:
            {
                CEO ceo = new CEO();
                ceo.setName("parth");
                ceo.setId(311);
                ceo.setEge(24);
                ceo.setDa(5000);
                ceo.setHoliday(8);
                ceo.setTax(12);//in percentage
                ceo.setPf(12);//in persentage
                ceo.setAttendance(new int[] {0,0,0,1,1,0,-1,-1,-1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});//1-present,-1-half,0-absent

                C_salary c_salary = new C_salary(ceo);
                c_salary.calSalary();
                break;
            }
            default:
                System.out.println("INVALID INPUT!!");
        }
        
    }
}