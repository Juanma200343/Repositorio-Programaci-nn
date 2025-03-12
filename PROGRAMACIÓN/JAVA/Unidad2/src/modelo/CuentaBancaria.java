package modelo;


import java.time.LocalDate;

import modelo.Refactorizar.Cliente;

public class CuentaBancaria {

	private double saldo;
	private LocalDate fecha_apertura ;
	private String iban;
	private Cliente cliente_titular;
	private Cliente cliente_autorizado;
	private static int contador;
	private int id;
	
	public CuentaBancaria(double saldo, LocalDate fecha_apertura, String iban, Cliente cliente_titular,
			Cliente cliente_autorizado) {
		
		super();
		this.saldo = saldo;
		this.fecha_apertura = fecha_apertura;
		this.iban = iban;
		this.cliente_titular = cliente_titular;
		this.cliente_autorizado = cliente_autorizado;
		contador = contador+1;
		this.id = contador+1;
	}
	


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public LocalDate getFecha_apertura() {
		return fecha_apertura;
	}
	public void setFecha_apertura(LocalDate fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Cliente getCliente_titular() {
		return cliente_titular;
	}
	public void setCliente_titular(Cliente cliente_titular) {
		this.cliente_titular = cliente_titular;
	}
	public Cliente getCliente_autorizado() {
		return cliente_autorizado;
	}
	public void setCliente_autorizado(Cliente cliente_autorizado) {
		this.cliente_autorizado = cliente_autorizado;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		CuentaBancaria.id = id;
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", fecha_apertura=" + fecha_apertura + ", iban=" + iban
				+ ", cliente_titular=" + cliente_titular + ", cliente_autorizado=" + cliente_autorizado + "]";
	}










}
