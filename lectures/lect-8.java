public class BMI {
        // instance variables of the class BMI
        // instance variables are given a default initial 
        public double height;
        public int weight;
        public double score;
        
        public void setH(double h){
                height = h;
        }
        public void setW(int w){
                weight = w;
        }

}

public class testBMI {
        public static void main(String [] args){
                // a BMI object which is an instance of the class BMI
                BMI x = new BMI();
                
                x.setW(65);
                x.setH(176);
        }
}