import java.util.Scanner;
public class PassCourse {
    public static void main(String[] args) {
        int mat, phy, eng, chem, bio;
        int sum=0, count=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Math: ");
        mat = input.nextInt();
        if(mat>=0 && 100>=mat) {sum += mat; count++;}
        System.out.print("Physics: ");
        phy = input.nextInt();
        if(phy>=0 && 100>=phy) {sum += phy; count++;}
        System.out.print("English: ");
        eng = input.nextInt();
        if(eng>=0 && 100>=eng) {sum += eng; count++;}
        System.out.print("Chemistry: ");
        chem = input.nextInt();
        if(chem>=0 && 100>=chem) {sum += chem; count++;}
        System.out.print("Biology: ");
        bio = input.nextInt();
        if(bio>=0 && 100>=bio) {sum += bio; count++;}

        if(count == 5){
            double avarage = (double) sum/count;
            if(avarage >= 55){
                System.out.println("Congrats, Passed!");
            }
            else{
                System.out.println("Failed! See you next year :)");
            }
            System.out.println("Your Avarage: "+avarage);
            }

        else{
            System.out.println("Wrong input enterance!");
        }
    }
}
