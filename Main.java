import java.util.Scanner;

class Main {
    // check if currency is valid
    public static boolean isValidCurrency(String currency, String[] currencies) {
        for (String curr : currencies) {
            if (currency.equals(curr)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // variables
        String name[] = {"usd", "czk", "eur"};
        float value[] = {1f, 22.93f, 0.93f};

        float result;
        
        String user_currency1;
        String user_currency2;
        int user_currency1_index = 0;
        int user_currency2_index = 0;
        float user_money;
        
        // input
        Scanner myObj = new Scanner(System.in);

        // first currency - user input
        System.out.println("Available currencies: usd, czk, eur");
        System.out.print("Enter currency[1]: ");
        user_currency1 = myObj.nextLine();

        // check if currency is valid
        if(!isValidCurrency(user_currency1, name)) {
            System.out.println("Invalid currency");
            myObj.close();
            return;
        }

        // amount of money - user input
        System.out.print("Enter the amount of money: ");
        user_money = Float.parseFloat(myObj.nextLine());

        // second currency - user input
        System.out.print("Enter currency[2]: ");
        user_currency2 = myObj.nextLine();
        
        // check if currency is valid
        if(!isValidCurrency(user_currency2, name)) {
            System.out.println("Invalid currency");
            myObj.close();
            return;
        }
        
        // linking index and names
        for (int i = 0; i < name.length; i++) {
            if (user_currency1.equals(name[i])) {
                user_currency1_index = i;
            }
            if (user_currency2.equals(name[i])) {
                user_currency2_index = i;
            }
        }

        // calculation
        result = user_money / value[user_currency1_index] * value[user_currency2_index];
        System.out.println(user_currency1 + "->" + user_currency2 + " = " + result);

        myObj.close();
    }
}