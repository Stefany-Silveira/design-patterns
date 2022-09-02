package solid.lsp;

public class NubankRewards implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {
        //validacões
        System.out.println("Limite OK, Rewards OK!");
        }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
        System.out.println("Pontuacão creditada no Programa Rewards!");
    }
}
