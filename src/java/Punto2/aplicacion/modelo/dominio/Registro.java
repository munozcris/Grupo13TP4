/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.aplicacion.modelo.dominio;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class Registro implements Serializable{
    ArrayList <Integer> registroNum = new ArrayList<Integer>();
    int numIngresado;

    public int getNumIngresado() {
        return numIngresado;
    }

    public void setNumIngresado(int numIngresado) {
        this.numIngresado = numIngresado;
    }

    public void ingresarNumero (){
        registroNum.add(numIngresado);
}
    public int visualizarNumeros(){
        return registroNum.get(0);
    }
    public int calcularMaximo (){
        int numMayor = 0;
        for (int i=0; i<registroNum.size();i++){
            if(registroNum.get(i)>numMayor){
                numMayor = registroNum.get(i);
            }
        }
        return numMayor;
    }
    public int calcularMenor(){
        int numMenor = registroNum.get(0);
        for (int i=0; i<registroNum.size();i++){
            if(registroNum.get(i)<numMenor){
                numMenor = registroNum.get(i);
            }
        }
        return numMenor;
    }
    public double calcularPromedio(){
        int suma = 0;
        for(int i=0;i<registroNum.size();i++){
            suma=suma+registroNum.get(i);
        }
        return suma / registroNum.size();
    }

    public ArrayList<Integer> getRegistroNum() {
        return registroNum;
    }

    public void setRegistroNum(ArrayList<Integer> registroNum) {
        this.registroNum = registroNum;
    }
}


