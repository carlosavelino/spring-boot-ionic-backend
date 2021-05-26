package com.avelino.sistemadepedidos.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.avelino.sistemadepedidos.domain.enuns.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date dataVenciemtno;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVenciemtno = dataVencimento;
	}

	public Date getDataVenciemtno() {
		return dataVenciemtno;
	}

	public void setDataVenciemtno(Date dataVenciemtno) {
		this.dataVenciemtno = dataVenciemtno;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
