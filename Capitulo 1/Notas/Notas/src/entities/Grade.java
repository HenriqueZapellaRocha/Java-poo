package entities;

public class Grade {

    public double FirstGrade;
    public double SecondGrade;
    public double ThridGrade;
    public String name;
    

    public double FinalGrade() {
        return FirstGrade + SecondGrade + ThridGrade;
    }

    public String Pass() {
            return "\nPASS";
        }

   
    public double Diference(){
       return  60.00 - FinalGrade();
    }
    

    public String Failed() {
        return "\nFailed\n";
       
    }

public String toString() {
    return "Missing " + Diference() + " Points"; 
}

   

    
}
