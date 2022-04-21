/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class Faturamento {
    
    private static double totalvendas1;
    private static double totalvendas2;
    private static double totalvendas3;
    private static double totalvendas4;
    private static double totalvendas5;
    private static double totaltudo;
    public static void main(String[] args) {
        Produto vendas1 = new Produto(1, "pao de alho", 13.90, 12);
        vendas1.calcularTotal();
        System.out.println("código: " + vendas1.getcodigo() + " descrição: " + vendas1.getdescricao()
                + " valor: " + vendas1.getvalor_unit() + " quantidade vendida: " + vendas1.getqtd_vendida()
                + " total: " + vendas1.gettotal_vendas());    
        double totalvendas1 = vendas1.gettotal_vendas(); 
        
        Produto vendas2 = new Produto(2 ,"pao com manteiga", 5.00, 30);
        vendas2.calcularTotal();
        System.out.println("código: " + vendas2.getcodigo() + " descrição: " + vendas2.getdescricao()
                + " valor: " + vendas2.getvalor_unit() + " quantidade vendida: " + vendas2.getqtd_vendida()
                + " total: " + vendas2.gettotal_vendas());
        double totalvendas2 = vendas2.gettotal_vendas(); 
        
         Produto vendas3 = new Produto(3, "salsichao", 4.00, 12);
         vendas3.calcularTotal();
         System.out.println("código: " + vendas3.getcodigo() + " descrição: " + vendas3.getdescricao()
                + " valor: " + vendas3.getvalor_unit() + " quantidade vendida: " + vendas3.getqtd_vendida()
                + " total: " + vendas3.gettotal_vendas());
        double totalvendas3 = vendas3.gettotal_vendas(); 
        
        Produto vendas4 = new Produto(4, "café", 1.00, 100);
         vendas4.calcularTotal();
         System.out.println("código: " + vendas4.getcodigo() + " descrição: " + vendas4.getdescricao()
                + " valor: " + vendas4.getvalor_unit() + " quantidade vendida: " + vendas4.getqtd_vendida()
                + " total: " + vendas4.gettotal_vendas());
        double totalvendas4 = vendas4.gettotal_vendas(); 
        
        Produto vendas5 = new Produto(5, "hamburgao", 15.00, 1);
         vendas5.calcularTotal();
         System.out.println("código: " + vendas5.getcodigo() + " descrição: " + vendas5.getdescricao()
                + " valor: " + vendas5.getvalor_unit() + " quantidade vendida: " + vendas5.getqtd_vendida()
                + " total: " + vendas5.gettotal_vendas());
        double totalvendas5 = vendas5.gettotal_vendas(); 
     
         totaltudo = totalvendas1 + totalvendas2 + totalvendas3 + totalvendas4 + totalvendas5;
         
         System.out.println("Total de todos os produtos: " + totaltudo);
        }
    

    }


