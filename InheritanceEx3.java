import java.lang.*;
import java.util.*;

class InheritanceEx3 {
    String emp_name, emp_id, address, mail_id, mobile;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the employee category : ");
        System.out.println("1.Programmer");
        System.out.println("2.Assistant Professor");
        System.out.println("3.Associate Professor");
        System.out.println("4.Professor");
        int cat = scan.nextInt();
        switch (cat) {
            case 1:
                Programmer programmer = new Programmer();
                programmer.read();
                programmer.calculate();
                programmer.display();
                break;
            case 2:
                AssistantProfessor assistant = new AssistantProfessor();
                assistant.read();
                assistant.calculate();
                assistant.display();
                break;
            case 3:
                AssociateProfessor associate = new AssociateProfessor();
                associate.read();
                associate.calculate();
                associate.display();
                break;
            case 4:
                Professor professor = new Professor();
                professor.read();
                professor.calculate();
                professor.display();
                break;
            default:
                System.out.println("Choose the above category!");
                break;
        }
    }
}

class Programmer extends InheritanceEx3 {
    double basic_pay, da, hra, pf, fund;
    double gross, net;
    Scanner scan = new Scanner(System.in);

    public void read() {
        System.out.println("Enter the employee name : ");
        emp_name = scan.nextLine();
        System.out.println("Enter the employee id : ");
        emp_id = scan.nextLine();
        System.out.println("Enter the employee address : ");
        address = scan.nextLine();
        System.out.println("Enter the employee mail_id : ");
        mail_id = scan.nextLine();
        System.out.println("Enter the employee mobile : ");
        mobile = scan.next();
        if (mobile.length() != 10) {
            System.out.println("Enter the correct mobile number :\n");
            mobile = scan.next();
        }
        System.out.println("Enter the basic pay (BP) :");
        basic_pay = scan.nextFloat();
    }

    public void calculate() {
        da = (basic_pay * 97) / 100;
        hra = (basic_pay * 10) / 100;
        pf = (basic_pay * 12) / 100;
        fund = (basic_pay * 0.1) / 100;
        gross = basic_pay + da + hra;
        net = gross - pf - fund;
    }

    public void display() {
        System.out.println("Employee name : " + emp_name);
        System.out.println("Employee id : " + emp_id);
        System.out.println("Employee address : " + address);
        System.out.println("Employee mail : " + mail_id);
        System.out.println("Employee mobile : " + mobile);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" PAY SLIP(Programmer) ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DA : Rs." + da + "\t\t\t" + "PF : Rs." + pf);
        System.out.println("HRA : Rs." + hra + "\t\t\t" + "FUND : Rs." + fund);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Gross salary : Rs." + gross + "\t\t\t" + "Net salary : Rs." + net);
        System.out.println("------------------------------------------------------------------------");
    }
}

class AssistantProfessor extends InheritanceEx3 {
    double basic_pay, da, hra, pf, fund;
    double gross, net;
    Scanner scan = new Scanner(System.in);

    public void read() {
        System.out.println("Enter the employee name : ");
        emp_name = scan.nextLine();
        System.out.println("Enter the employee id : ");
        emp_id = scan.nextLine();
        System.out.println("Enter the employee address : ");
        address = scan.nextLine();
        System.out.println("Enter the employee mail_id : ");
        mail_id = scan.nextLine();
        System.out.println("Enter the employee mobile : ");
        mobile = scan.next();
        if (mobile.length() != 10) {
            System.out.println("Enter the correct mobile number :\n");
            mobile = scan.next();
        }
        System.out.println("Enter the basic pay (BP) :");
        basic_pay = scan.nextFloat();
    }

    public void calculate() {
        da = (basic_pay * 97) / 100;
        hra = (basic_pay * 10) / 100;
        pf = (basic_pay * 12) / 100;
        fund = (basic_pay * 0.1) / 100;
        gross = basic_pay + da + hra;

        net = gross - pf - fund;
    }

    public void display() {
        System.out.println("Employee name : " + emp_name);
        System.out.println("Employee id : " + emp_id);
        System.out.println("Employee address : " + address);
        System.out.println("Employee mail : " + mail_id);
        System.out.println("Employee mobile : " + mobile);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" PAY SLIP(AssistantProfessor) ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DA : Rs." + da + "\t\t\t" + "PF : Rs." + pf);
        System.out.println("HRA : Rs." + hra + "\t\t\t" + "FUND : Rs." + fund);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Gross salary : Rs." + gross + "\t\t\t" + "Net salary : Rs." + net);
        System.out.println("------------------------------------------------------------------------");
    }
}

class AssociateProfessor extends InheritanceEx3 {
    double basic_pay, da, hra, pf, fund;
    double gross, net;
    Scanner scan = new Scanner(System.in);

    public void read() {
        System.out.println("Enter the employee name : ");
        emp_name = scan.nextLine();
        System.out.println("Enter the employee id : ");
        emp_id = scan.nextLine();
        System.out.println("Enter the employee address : ");
        address = scan.nextLine();
        System.out.println("Enter the employee mail_id : ");
        mail_id = scan.nextLine();
        System.out.println("Enter the employee mobile : ");
        mobile = scan.next();
        if (mobile.length() != 10) {
            System.out.println("Enter the correct mobile number :\n");
            mobile = scan.next();
        }
        System.out.println("Enter the basic pay (BP) :");
        basic_pay = scan.nextFloat();
    }

    public void calculate() {
        da = (basic_pay * 97) / 100;
        hra = (basic_pay * 10) / 100;
        pf = (basic_pay * 12) / 100;
        fund = (basic_pay * 0.1) / 100;
        gross = basic_pay + da + hra;
        net = gross - pf - fund;
    }

    public void display() {
        System.out.println("Employee name : " + emp_name);
        System.out.println("Employee id : " + emp_id);
        System.out.println("Employee address : " + address);
        System.out.println("Employee mail : " + mail_id);
        System.out.println("Employee mobile : " + mobile);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" PAY SLIP(AssociateProfessor) ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DA : Rs." + da + "\t\t\t" + "PF : Rs." + pf);
        System.out.println("HRA : Rs." + hra + "\t\t\t" + "FUND : Rs." + fund);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Gross salary : Rs." + gross + "\t\t\t" + "Net salary : Rs." + net);
        System.out.println("------------------------------------------------------------------------");
    }
}

class Professor extends InheritanceEx3 {
    double basic_pay, da, hra, pf, fund;
    double gross, net;
    Scanner scan = new Scanner(System.in);

    public void read() {
        System.out.println("Enter the employee name : ");
        emp_name = scan.nextLine();
        System.out.println("Enter the employee id : ");
        emp_id = scan.nextLine();
        System.out.println("Enter the employee address : ");

        address = scan.nextLine();
        System.out.println("Enter the employee mail_id : ");
        mail_id = scan.nextLine();
        System.out.println("Enter the employee mobile : ");
        mobile = scan.next();
        if (mobile.length() != 10) {
            System.out.println("Enter the correct mobile number :\n");
            mobile = scan.next();
        }
        System.out.println("Enter the basic pay (BP) :");
        basic_pay = scan.nextFloat();
    }

    public void calculate() {
        da = (basic_pay * 97) / 100;
        hra = (basic_pay * 10) / 100;
        pf = (basic_pay * 12) / 100;
        fund = (basic_pay * 0.1) / 100;
        gross = basic_pay + da + hra;
        net = gross - pf - fund;
    }

    public void display() {
        System.out.println("Employee name : " + emp_name);
        System.out.println("Employee id : " + emp_id);
        System.out.println("Employee address : " + address);
        System.out.println("Employee mail : " + mail_id);
        System.out.println("Employee mobile : " + mobile);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" PAY SLIP(Professor) ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DA : Rs." + da + "\t\t\t" + "PF : Rs." + pf);
        System.out.println("HRA : Rs." + hra + "\t\t\t" + "FUND : Rs." + fund);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Gross salary : Rs." + gross + "\t\t\t" + "Net salary : Rs." + net);
        System.out.println("------------------------------------------------------------------------");
    }
}
