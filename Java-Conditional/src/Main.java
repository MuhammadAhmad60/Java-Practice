// Find Area of triangle

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//   /* int Base = 4;
//
//    int height = 5;*/
    int Area;
    System.out.println("Enter the value of base: ");
    int Base = input.nextInt();
    System.out.println("Enter the value of height: ");
    int height = input.nextInt();

    Area = (Base * height) / 2;

    System.out.println("Area of the triangle is: " + Area);

}
