/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafhael banuls lopes 11211101240@alunos.umc.br / gabriel paulosi de freitas 11211102827@alunos.umc.br
 */
public class Produto {

    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;

    public Produto(int codigo, String descricao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    private void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setvalor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }

    private void setqtd_vendida(int qtd_vendida) {
        this.qtd_vendida = qtd_vendida;
    }

    public int getcodigo() {
        return codigo;
    }

    public String getdescricao() {
        return descricao;
    }

    public double getvalor_unit() {
        return valor_unit;
    }

    public int getqtd_vendida() {
        return qtd_vendida;
    }

    public void calcularTotal() {

        total_vendas = valor_unit * qtd_vendida;

    }

    public double gettotal_vendas() {
        return total_vendas;
    }

}
