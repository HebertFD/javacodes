
package imc;

import java.text.DecimalFormat;

public class CalcularImc {
    //VAR DE INSTANCIA
    
    private double peso;
    private double altura;
    private char sexo;
    private String categoria;
    private double imc;
    
    //CONSTRUTOR
    
    public void CalcularImc(){
    this.peso = 0;
    this.altura = 0;
    this.sexo = 'M';
    this.categoria = "";
    this.imc = 0;
    
    }
    //METODOS MODIFICADORES/ ACESSORES
    //SET'S / GET'S
    public void setPeso(double peso){
    this.peso = peso;
    }
    public double getPeso(){
    return this.peso;
    }
    public void setAltura(double altura){
    this.altura = altura;
    }
    public double getAltura(){
    return this.altura;
    }
    public void setSexo(char sexo){
    this.sexo = sexo;
    }
    public char getSexo(){
    return this.sexo;
    }
    public void setImc(double imc){
    this.imc = imc;
    }
    public double getImc(){
    return this.imc;
    }
    public void setCategoria(String categoria){
    this.categoria = categoria;
    }
    public String getCategoria(){
    return this.categoria;
    }
    public void calculoDoImc(){
    this.imc = this.peso / Math.pow(this.altura,2);
    }
    public void classificacao(){
        //masculino
    if(this.sexo == 'M'){
        if(this.imc < 20.7) {
            this.categoria = "Abaixo do peso";
        }else if(this.imc < 26.4) {
            this.categoria = "Peso ideal";
        }else if(this.imc < 27.8) {
            this.categoria = "Pouco acima do peso";
        }else if(this.imc < 31.1) {
            this.categoria = "Acima do peso";
        }else if(this.imc > 31.1) {
            this.categoria = "Obesidade";
        }
    //feminino
    }else if(this.imc < 19.1) {
            this.categoria = "Abaixo do peso";
        }else if(this.imc < 25.8) {
            this.categoria = "Peso ideal";
        }else if(this.imc < 27.3) {
            this.categoria = "Pouco acima do peso";
        }else if(this.imc < 32.3) {
            this.categoria = "Acima do peso";
        }else if(this.imc > 32.3) {
            this.categoria = "Obesidade";
    
        }
    }
    
}
