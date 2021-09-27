package pageObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SitePage {
	@FindBy(xpath = "//a[@class = 'login']")
	private WebElement signin;
	@FindBy(id = "email_create")
	private WebElement labelemail1;
	@FindBy(xpath = "//i[@class  = 'icon-user left']")
	private WebElement creataccountbutton;
	@FindBy(id = "uniform-id_gender1")
	private WebElement mrbutton;
	@FindBy(id = "uniform-id_gender2")
	private WebElement mrsbutton;
	@FindBy(id = "customer_firstname")
	private WebElement firstname;
	@FindBy(id = "customer_lastname")
	private WebElement lastname;
	@FindBy(id = "email")
	private WebElement labelemail2;
	@FindBy(id = "passwd")
	private WebElement senha;
	@FindBy(id = "days")
	private WebElement aniverDiaButton;
	@FindBy(id = "years")
	private WebElement aniverAnoButton;
	@FindBy(id = "months")
	private WebElement aniverMesButton;
	@FindBy(id = "address1")
	private WebElement labelEndereco;
	@FindBy(id = "address2")
	private WebElement labelEndereco2;
	@FindBy(id = "city")
	private WebElement labelCidade;
	@FindBy(id = "id_state")
	private WebElement selectEstado;
	@FindBy(id = "postcode")
	private WebElement labelCEP;
	@FindBy(id = "id_country")
	private WebElement selectPais;
	@FindBy(id = "phone_mobile")
	private WebElement labelCelulars;
	@FindBy(id = "alias")
	private WebElement labelApelido;
	@FindBy(id = "submitAccount")
	private WebElement registerButton;
	
	
	
	public void emailValido(String email) {
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		Matcher m = p.matcher(email);
		if (m.find()) {
			System.out.println("               ========================              ");
			System.out.println("               ========================              ");
			System.out.println("                      Email Válido                   ");
			System.out.println("               ========================              ");
			System.out.println("               ========================              ");
		}
	}
	
	public void acessarCadastro(){
		signin.click();
	}
	
	public void enviarEmail(String email){
		labelemail1.sendKeys(email);
	}
	
	public void createAccount1(){
		creataccountbutton.click();
	}
	
	public void clickMrButton(){

		mrbutton.click();
		//mrsbutton.click();
	}
	
	public void enviarPriNome(String name){

		firstname.sendKeys(name);
		
	}
	
	public void enviarSobrenome(String name){

		lastname.sendKeys(name);
	}
	
	public void enviarEmail2(String email){
		labelemail2.sendKeys(email);
	}
	
	public void enviarSenha(String senhaA){
		senha.sendKeys(senhaA);
	}
	
	public void aniversarioDia(int dia){
		Select diaSelect = new Select(aniverDiaButton);
		diaSelect.selectByIndex(dia);
	}
	
	public void aniversarioMes(int mes) throws InterruptedException {
		/*aniverMesButton.click();
		aniverMesButton.findElement(By.xpath("//option[@value = '"+mes+"']")).click();*/
			
		Select mesSelect = new Select(aniverMesButton);
		mesSelect.selectByIndex(mes);
	
	}
	
	public void aniversarioAno(String ano){
		Select anoSelect = new Select(aniverAnoButton);
		anoSelect.selectByValue(ano);
	}
	
	public void enviarEndereco(String endereco){
		labelEndereco.sendKeys(endereco);
	}
	
	public void enviarEndereco2(String endereco){
		labelEndereco2.sendKeys(endereco);
	}
	
	public void enviarCidade(String cidade){
		labelCidade.sendKeys(cidade);
	}
	
	public void enviarEstado(String estado){
		Select stateSelect = new Select(selectEstado);
		stateSelect.selectByVisibleText(estado);
	}
	
	public void enviarCEP(String CEP){
		labelCEP.sendKeys(CEP);
	}
	
	public void enviarPais(String pais){
		Select paisSelect = new Select(selectPais);
		paisSelect.selectByVisibleText(pais);
	}
	
	public void enviarCel(String cel){
		labelCelulars.sendKeys(cel);
	}

	public void clicarRegister(){
		registerButton.click();
	}
}
