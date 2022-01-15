class OOP {
    public String name = "John";
    protected Double fees;
    protected Double fees_paid;
    public Double fees_bal;

    public void Payfees(){
        System.out.println("John");
    }
    private void register(){
        System.out.println("Register");  
    }

    public static void main(String args[]) {
        OOP obj = new OOP();
        obj.Payfees();
        obj.register();
    }
}
