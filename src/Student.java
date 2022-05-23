public class Student extends Person {
    private int credits;
    private int study = 0;

    public Student(String name, String address){
        super(name, address);
        this.credits = 0;
    }

    public int study(){
        if(study >= 0){
        this.study += 1;
        }
        return study; 
    }

    public int credits(){
        return this.credits += this.study;
    }

    @Override
    public String toString(){
        return this.getName() + "\n " + this.getAddress() + "\n " + "Study Credits: " + this.credits();
    }
    
}
