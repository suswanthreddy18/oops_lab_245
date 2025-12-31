class PercentageCheck {
    public static void main(String[] args) {
        int obtainedMarks = 350;
        float totalMarks = 500f;

        float percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage = " + percentage);

        if(percentage >= 40)
            System.out.println("Status: Pass");
        else
            System.out.println("Status: Fail");
    }
}
