
public class Principal {
	public static void main(String[] args) {
		//Animal n = new Animal da erro pois animal é abstratct nao
		//pode ser instanciado.
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		//usamos o msm metodo e respostas diferentes, 
		//isto é polimorfismo.
		
		//m.setPeso(35.3f);
		//m.setCorPelo("Marrom");
		//m.alimentar();
		//m.locomover();
		//m.emitirSom();
		
		c.locomover();
		k.locomover();
		c.emitirSom();
		k.emitirSom();
	}

}
