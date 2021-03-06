package pl.sda.enums;

public enum Operation {

    PLUS("+"),
    MINUS("-"),
    MULTIPLE("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }


    public void calculate (double a, double b) {

        switch (this) {

            case PLUS:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case MINUS:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case DIVIDE:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case MULTIPLE:
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
        }
    }

}
