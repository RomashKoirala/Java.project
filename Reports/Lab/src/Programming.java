public class Programming extends FirstYearCourse {
    @Override    
    void printCode(){
        System.out.println("COding");
    }
    @Override
    void printName(){
        System.out.println("Name");
    }

    public static void main(String[] args) {
        Programming program=new Programming();
        program.printCode();
        program.printName();
        program.printTotalWeeks();
    }

}
