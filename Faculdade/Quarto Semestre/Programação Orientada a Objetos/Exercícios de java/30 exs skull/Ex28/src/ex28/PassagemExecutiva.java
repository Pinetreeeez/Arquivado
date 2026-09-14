package ex28;

public class PassagemExecutiva extends Passagem {
	private boolean acessoLoungeVIP;
    private boolean servicoBordoPremium;

    public PassagemExecutiva(String codigoBilhete, String origem, String destino, double tarifaBase, boolean acessoLoungeVIP, boolean servicoBordoPremium) {
        super(codigoBilhete, origem, destino, tarifaBase);
        this.acessoLoungeVIP = acessoLoungeVIP;
        this.servicoBordoPremium = servicoBordoPremium;
    }
  
    boolean isAcessoLoungeVIP() { return acessoLoungeVIP; }
    void setAcessoLoungeVIP(boolean acessoLoungeVIP) { this.acessoLoungeVIP = acessoLoungeVIP; }

    boolean isServicoBordoPremium() { return servicoBordoPremium; }
     void setServicoBordoPremium(boolean servicoBordoPremium) { this.servicoBordoPremium = servicoBordoPremium; }

	@Override
	public double calcularValorTotal() {
	    double sobretaxa = this.getTarifaBase() * 0.45;
	    return super.calcularValorTotal() + sobretaxa;
	}
}