package abstract_factory.pattern;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		
		//first get factory instance from factory of factory class, if u want trainees.
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true); 
		
		Profession engg = abstractFactory.getProfession("Engineer");
		
		engg.print();
		
	}

}
