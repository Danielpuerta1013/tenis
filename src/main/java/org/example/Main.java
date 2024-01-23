package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombrePrimerTenista;
        String apellidosPrimerTenista;
        String nombreSegundoTenista;
        String apellidosSegundoTenista;
        Integer rankingTenista1;
        Integer rankingtenista2;
        String driveTenista1;
        String driveTenista2;
        Double gananciaPartido=500000.0;
        String canchaAsignada;
        Scanner sc= new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("programa de tennis");
        System.out.println("*************************");
        System.out.println("***************jugador 1 **************************");
        System.out.print("Ingrese el nombre del tenista 1: ");
        nombrePrimerTenista=sc.nextLine();
        System.out.print("Ingrese el apellido del tenista 1: ");
        apellidosPrimerTenista=sc.nextLine();
        System.out.print("ingrese el drive del tenista 1: ");
        driveTenista1= sc.nextLine();
        System.out.print("Ingrese el ranking del tenista 1: ");
        rankingTenista1=sc.nextInt();
        System.out.println("***************jugador 2 **************************");
        sc.nextLine();
        System.out.print("Ingrese el nombre del tenista 2: ");
        nombreSegundoTenista=sc.nextLine();
        System.out.print("Ingrese el apellido del tenista 2: ");
        apellidosSegundoTenista=sc.nextLine();
        System.out.print("ingrese el drive del tenista 2: ");
        driveTenista2= sc.nextLine();
        System.out.print("Ingrese el ranking del tenista 2: ");
        rankingtenista2=sc.nextInt();
        // preguntar si el jugador 1 esta entre los 20 mejores
        if (rankingTenista1<=20){
            if (rankingtenista2<=20){
                canchaAsignada="principal";
            }else {
                canchaAsignada="secundaria";
            }
        }else{
            if (rankingtenista2<=20){
                canchaAsignada="secundaria";
            }else {
                canchaAsignada="auxiliar";
            }
        }
        System.out.println("Se esta jugando el partido en la cancha: "+canchaAsignada);
        Random random= new Random();
        int numeroAleatorio=random.nextInt(2)+1;
        if (numeroAleatorio==1){
            System.out.println("ganador del partido jugado en la cancha: "+canchaAsignada+" es el jugador 1");
            if (rankingTenista1<=20){
                System.out.println("el premio del tenista 1 es de $500000 usd +10% equivalente a: $"+(gananciaPartido*1.1));
            }else{
                System.out.println("el premio del tenista 1 es de $500000 usd +20% equivalente a: $"+(gananciaPartido*1.2));
            }
        } else {
            System.out.println("ganador del partido jugado en la cancha: "+canchaAsignada+" es el jugador 2");
            if (rankingtenista2<=20){
                System.out.println("el premio del tenista 2 es de $500000 usd +10% equivalente a: $"+(gananciaPartido*1.1));
            }else{
                System.out.println("el premio del tenista 2 es de $500000 usd +20% equivalente a: $"+(gananciaPartido*1.2));

            }
        }


    }
}