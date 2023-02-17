
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanit
 */
public class Bola {
    private String cor;
    
    public Bola(String cor){
    this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    
    public void setCor(String novaCor){
        cor = novaCor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a cor da bola que deseja");
        String resposta = sc.nextLine();
        Bola b1 = new Bola(resposta);
        System.out.println(b1.getCor());
        System.out.println("Deseja trocar a cor do objeto ?");
        int resposta2 = sc.nextInt();
        if(resposta2 ==1){
            System.out.println("Digite para qual cor deseja trocar");
            resposta = s.nextLine();
            b1.setCor(resposta);
            System.out.println(b1.getCor());
        }
      
        b1.setCor("Laranja");
        System.out.println(b1.getCor());
    }
}
