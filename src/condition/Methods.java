package condition;

public class Methods {
    public void CheckNumber(int number){
        if(number%2==0){
            System.out.println(number+" là số chẵn");
        }else {
            System.out.println(number+ " là số lẻ");
        }
    }
    public void Numbers(int number1, int number2,int number3){
        if(number1 > number2 && number1 > number3){
            System.out.println(number1+ " là số lớn nhất");
        }else if (number2 > number1 && number2 > number3){
            System.out.println(number2+ " là số lón nhất");
        }else {
            System.out.println(number3+ " là số lớn nhất");
        }
    }
    public void triangle(int canhA, int canhB, int canhC) {
        if (canhA == canhB && canhB == canhC) {
            System.out.println("là tam giác đều");
        }
        else if (canhA != canhB && canhB != canhC && canhA != canhC){
            System.out.println("là tam giác thường");
        }
        else if(canhA == canhB || canhA== canhC || canhB==canhC){
            System.out.println("là tam giác cân");
        }
    }
    public void bank(int MoneyNumber, double interestRate, int date){
        double SumInterestRate = (MoneyNumber*interestRate*date)/365;
        System.out.println("Số tiền lãi gửi sau 1 năm là: "+ SumInterestRate);
    }

}
