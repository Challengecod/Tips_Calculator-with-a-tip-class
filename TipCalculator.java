public class TipCalculator{
    private double bill;
    private int tip;
    private int numPeople;

    public TipCalculator(double bill, int tip, int numPeople){
        this.bill = bill;
        this.tip = tip;
        this.numPeople = numPeople;
    }

    public double tipDecimalForm(){
        return tip * 0.01;
    }

    public double totalTipAmount(){
        return tipDecimalForm() * bill;
    }

    public double totalBillCost(){
        // adds the total tips to the bill to get the total cost after tips
        return totalTipAmount() + bill;
    }

    public double tipPerPerson(){
        // divide the total tip amount by the number of people to get per person.
        return totalTipAmount()/numPeople;
    }

    public double totalBillPerPerson(){
        // divide the total cost amount by the number of people to get per person.
        return totalBillCost()/numPeople;
    }

}
