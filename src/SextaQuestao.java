import java.util.Scanner;

public class SextaQuestao {
	
	public static double quantidade_salarios(double salario_minimo,double salario) {
		double total;
		total = salario/salario_minimo;
		return total;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		double salario,salario_minimo;
		System.out.println("Digite o valor do salario minimo");
		salario_minimo = sc.nextDouble();
		System.out.println("Digite o valor do salario");
		salario = sc.nextDouble();
		System.out.println(SextaQuestao.quantidade_salarios(salario_minimo, salario));
	}
}
