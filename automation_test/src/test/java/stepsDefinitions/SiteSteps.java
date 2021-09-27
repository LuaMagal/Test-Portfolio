package stepsDefinitions;



import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SitePage;

public class SiteSteps {

	@Dado("que o usuario acesse a pagina de cadastro")
	public void acessarAPaginaDeCadastro() throws InterruptedException {
		Na(SitePage.class).acessarCadastro();
		//Thread.sleep(2000);
	}

	@Quando("informar o seu email {string}")
	public void informarOSeuEmail(String email) throws InterruptedException {
		Na(SitePage.class).enviarEmail(email);
		Na(SitePage.class).emailValido(email);	
	}
	
	@Dado("clique em Create an Account")
	public void cliqueEmCreateAnAccount() throws InterruptedException {
		
		Na(SitePage.class).createAccount1();
		//Thread.sleep(5000);
	}

    @Entao("deve informar seu titulo")
	public void deveInformarSeuTitulo() {
		Na(SitePage.class).clickMrButton();
	}

	@Entao("primeiro nome {string}")
	public void primeiroNome(String name) throws InterruptedException {
		Na(SitePage.class).enviarPriNome(name);
		//Thread.sleep(2000);
	}

	@Entao("sobrenome {string}")
	public void sobrenome(String sobrenome) throws InterruptedException {
		Na(SitePage.class).enviarSobrenome(sobrenome);
		//Thread.sleep(2000);
	}

	@Entao("senha {string}")
	public void senha(String senha) throws InterruptedException {
		Na(SitePage.class).enviarSenha(senha);
		//Thread.sleep(2000);
	}

	@Entao("Data de nascimento {int}\\/{int}\\/{string}")
	public void dataDeNascimento(Integer dia, Integer mes, String ano) throws InterruptedException {
		Na(SitePage.class).aniversarioDia(dia);
		Na(SitePage.class).aniversarioMes(11);
		Na(SitePage.class).aniversarioAno(ano);
	}

    @Dado("que o usuario tenha informado as suas informacoes pessoais")
	public void queOUsuarioTenhaInformadoAsSuasInformacoesPessoais() {
	    
	}

    @Entao("seu endereco  {string}")
	public void seuEndereco(String endereco) {
		Na(SitePage.class).enviarEndereco(endereco);
	}

	@Dado("seu endereco segunda linha  {string}")
	public void seuEnderecoSegundaLinha(String endereco) throws InterruptedException {
		Na(SitePage.class).enviarEndereco2(endereco);
		Thread.sleep(3000);
	}

	@Entao("sua cidade {string}")
	public void suaCidade(String cidade) {
		Na(SitePage.class).enviarCidade(cidade);
	}

	@Entao("seu estado {string}")
	public void seuEstado(String estado) {
		Na(SitePage.class).enviarEstado(estado);
	}

	@Entao("seu CEP {string}")
	public void seuCEP(String CEP) {
		Na(SitePage.class).enviarCEP(CEP);
	}

	@Entao("seu pais {string}")
	public void seuPais(String pais) throws InterruptedException {
		Na(SitePage.class).enviarPais(pais);
	}

	@Entao("seu numero de celular {string}")
	public void seuNumeroDeCelular(String cel) throws InterruptedException {
		Na(SitePage.class).enviarCel(cel);
	}

	@Dado("clicar no botao de register")
	public void clicarNoBotaoDeRegister() throws InterruptedException {
		Na(SitePage.class).clicarRegister();
	}
	
	@Entao("entao o usuario deve estar logado")
	public void entaoOUsuarioDeveEstarLogado() {
		assertEquals("Tiago Diminutivo", driver.findElement(By.xpath("//a//span")).getText());
	}
	
	
	

}
