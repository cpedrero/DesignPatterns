package addFuncionality.decorator;

public class DecoratorA implements IOperation {
	private Component component;
	private String  propiedadAņadida;

	public DecoratorA(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
		propiedadAņadida = "Comportamiento aņadido A";
		System.out.println(propiedadAņadida);
	}
	
}
