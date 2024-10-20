package dip;

import java.util.Date;

public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float initialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;

	// Método que calcula el total de la factura
	public void billTotalCalc(VATCalculator v, DeductionCalculator d) {
		// Calculamos la deducción
		totalDeduction = d.calc(initialAmount, deductionPercentage);
		// Calculamos el IVA
		totalVAT = v.calc(initialAmount);
		// Calculamos el total
		billTotal = (initialAmount - totalDeduction) + totalVAT;
	}

}
