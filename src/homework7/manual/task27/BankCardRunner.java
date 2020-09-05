package homework7.manual.task27;

public class BankCardRunner {
    public static void main(String[] args) {
        MTBankCardHalvaMax mtBankCardHalvaMax = new MTBankCardHalvaMax("Halva Max", "1233 4532 3346 8789","MasterCard", 23, 0 );
        mtBankCardHalvaMax.payment(320);

        TehnoBankCardGreen tehnoBankCardGreen = new TehnoBankCardGreen("Green", "1632 7938 8516 3279", "VISA Gold", 36);
        tehnoBankCardGreen.payment(560);
    }
}
