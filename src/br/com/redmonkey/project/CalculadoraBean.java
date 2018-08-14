package br.com.redmonkey.project;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean {

	
	private Double valorA;
	private Double valorB;
	private Double resultado;
	
	public double somar () {
		resultado =this.valorA+this.valorB;
		
		return resultado;
	}
	public double subtrair () {
		resultado =this.valorA-this.valorB;
		
		return resultado;
	}
	public double multiplicar () {
		resultado =this.valorA*this.valorB;
		
		return resultado;
	}
	public double dividir () {
		resultado =this.valorA/this.valorB;
		
		return resultado;
	}
	
	public void limpar() {
		
	}
	
	public Double getValorA() {
		return valorA;
	}
	public void setValorA(Double valorA) {
		this.valorA = valorA;
	}
	public Double getValorB() {
		return valorB;
	}
	public void setValorB(Double valorB) {
		this.valorB = valorB;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	
	
}
