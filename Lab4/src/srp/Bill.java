package srp;

import java.util.Date;

public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float InitialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;

// Método que calcula el total de la factura
	public void billTotalCalc() {

		totalDeduction = new Deduction().deductionCalculator(InitialAmount, deductionPercentage);

		totalVAT = new IVA().IVACalculator(InitialAmount);
// Calculamos el total
		billTotal = (InitialAmount - totalDeduction) + totalVAT;
	}
}