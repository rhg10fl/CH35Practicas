package org.generation.employee;

public class EmployeeMain {
	public static void main (String[] args) {
		//Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Marco = new Employee("Marco", "Díaz", 5274, 19754.20d, "Desarrollarodar Backend");
		Employee Arturo= new Employee("Arturo", "Avila", 4403, 17999.62d, "Desarrollador Full Stack");
		
		System.out.println(Daniel);
		System.out.println(Marco);
		System.out.println(Arturo);
		
		//Aplicando métodos definidos preciamente (trabajar , calcularSalario, capacitarse, infoGeneral)
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Marco.capacitarse();
		
		//Utilizar información especifica de cada objeto mediante sus propiedades
		//Usando getter
		System.out.println(Daniel.getNombre() + " " + Daniel.getApellido() + " ocupa el puesto de " + Daniel.getPuesto());
		//Accediendo a la propiedad del objeto
		System.out.println(Marco.puesto + " gana $" + Marco.salario + " pesos");
		
		//Actualizando información mediante Setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
		
		
	}// Method
} // Class
