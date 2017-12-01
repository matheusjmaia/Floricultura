/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.mock;

import br.com.pi2.model.jopos.ItemVenda;
import br.com.pi2.model.jopos.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class Vendas {
    private static int totalVendas = 1;
    
    private static List<Venda> allVendas = new ArrayList<Venda>();
    
    public static void adicionarVenda (Venda venda) throws Exception{
        venda.setCodVenda(totalVendas++);
        //
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.format(data);
        //
        venda.setData(data);
        allVendas.add(venda);
    }
    
    public static List<ItemVenda> addiconarItems (ItemVenda itemVenda, List<ItemVenda> listaItens) throws Exception{
        listaItens.add(itemVenda);
        return listaItens;
    }
     
    public static Venda adicionarListaItem (Venda venda, List<ItemVenda> itemsVenda) throws Exception{
        venda.setItemVenda(itemsVenda);
        return venda;
        
    }
   
   public static List<Venda> relatatorioData (String data1, String data2) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada1 = formato.parse(data1);
        Date dataFormatada2 = formato.parse(data2);
        Calendar dataF1 = Calendar.getInstance();
        dataF1.setTime(dataFormatada1);
        Calendar dataF2 = Calendar.getInstance();
        dataF2.setTime(dataFormatada2);
        

        
        List<Venda> listaResultado = new ArrayList<Venda>();
        if (!allVendas.isEmpty()){
              for(Venda venda : allVendas){
              Date dataVenda = venda.getData();
              formato.format(dataVenda);
              Calendar dataVendaC = Calendar.getInstance();
              dataVendaC.setTime(dataVenda);
              if(dataVendaC == dataF1){
                  listaResultado.add(venda);
              }
              dataF1.add(dataF1.DAY_OF_YEAR, +1);
              if(dataF1 == dataF2){
                  return listaResultado;
              }
              
            }
        }
        return listaResultado;
    }

   public static List<Venda> relatatorioMensal () throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();
        formato.format(dataAtual);
        Calendar DataAtual = Calendar.getInstance();
        DataAtual.setTime(dataAtual);

        
        List<Venda> listaResultado = new ArrayList<Venda>();
        if (!allVendas.isEmpty()){
              for(Venda venda : allVendas){
              int i = 30;
              DataAtual.add(DataAtual.DAY_OF_YEAR,-i);
              Date dataA = DataAtual.getTime();
              formato.format(dataA);
              
            if(venda.getData() == dataA){
               listaResultado.add(venda);
              }
            i--;
            }
        }
        return listaResultado;
    }
    
    
    
}
