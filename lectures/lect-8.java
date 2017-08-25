public class BMI {
        // instance variables of the class BMI
        // instance variables are given a default initial 
        public double height;
        public int weight;
        public double score;
        
        // create void methods in our class to set the height and weight (does not return any value)
        // each parameter needs a type declaration as well.
        public void setHeight(double h){
                height = h;
        }
        public void setWeight(int w){
                weight = w;
        }
        
        public double calcBMI(){
                score = weight / (height * height);
                return score;
        }
        
        public String category(){
                
        }

}

public class testBMI {
        public static void main(String [] args){
                // Creating a BMI object which is an instance of the BMI class
                // 1. reserving space in memory (says this memory space is reserved)
                // 2. constructing a BMI Instance in memory
                // x is called a reference vaiable 
                // 4. BMI X creates reference variable x
                // 5. = ; this points the reference variable to the instance of the BMI in memory
                BMI x = new BMI();
                
                x.setWeight(65);
                x.setHeight(176);
                
                system.out.println(x.calcBMI());
        }
}