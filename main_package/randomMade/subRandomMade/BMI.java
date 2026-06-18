package main_package.randomMade.subRandomMade;

public class BMI {
    public static void BMImain() {
        double weight = 45;
        double height = 152;

        double underweight = 18.5f;
        double normal = 25f;
        double overweight = 30f;
        
        double BMIformula =  weight / Math.pow(height /  100,2);
        System.out.println();

        if (BMIformula < underweight) {
            System.out.printf("BMI: %.2f = %f", BMIformula, underweight);
        } else if (BMIformula < normal) {
            System.out.printf("BMI: %.2f = %f", BMIformula, normal);
        } else if (BMIformula < overweight) {
            System.out.printf("BMI: %.2f = %f", BMIformula, overweight);
        } else {
            System.out.printf("BMI: %.2f = Obese", BMIformula);
        }

    }
}
