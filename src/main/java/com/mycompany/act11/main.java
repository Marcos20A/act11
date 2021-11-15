/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class main {
    
    public static void main(String[] args) {
        
        
    Scanner sn = new Scanner(System.in);
    
 boolean salir = false;
 
        int opcion;
        int opcion2;
        int opcion3;
        float diametro;
        double pi = 3.1416;
        double resp;
        double l1,l2,l3,lf,lc,lcf,b,h,a,r,ra;
        
        
        while(!salir){
            
            
            System.out.println("Bienvenido al calculador!");
            System.out.println("Tus opciones son las siguientes: ");
            
            System.out.println("1.- Área");
            System.out.println("2.- Perímetro ");
            System.out.println("0.- salir ");
            
            try{
            
                 System.out.println("Selecciona una opcion: ");
                  opcion = sn.nextInt();
            
                  
            
               switch(opcion){
                
                  case 1:
                    
                      System.out.println("Bienvenido al calculador de área");
                      System.out.println("Las figuras a seleccionar son las siguientes: ");
                      
                      
                      System.out.println("1.- Circulo");
                      System.out.println("2.- Triangulo");
                      System.out.println("3.- Cuadrado");
                      
                      try{
                          
                          System.out.println("Selecciona una opcion: ");
                          opcion2 = sn.nextInt();
                          
                          switch(opcion2){
                              
                              case 1:
                                  
                                  System.out.println("Ingrese el radio del circulo");
                                  r = sn.nextInt();
                                  ra = pi * (r * r);
                                  System.out.println("El área es de: "+ra);
                                  
                                  break;
                                  
                              case 2:
                                  
                                  System.out.println("Ingrese la base");
                                  b = sn.nextInt();
                                  System.out.println("Ingrese la altura");
                                  h = sn.nextInt();
                                  a = (b * h) / 2;
                                  System.out.println("El área es de: "+a);
                                  
                                  break;
                                  
                              case 3:
                                  
                                  System.out.println("Ingrese el lado del cuadrado");
                                  lc = sn.nextInt();
                                  lcf = lc * lc;
                                  System.out.println("El área final es de: "+lcf);
                                  
                                  break;
                                  
                                              default:
                        System.out.println("Opcion no valida, ingresa una correcta");
                          }
                          
                      }catch(InputMismatchException e){
                
                System.out.println("Opcion no valida, ingresa un numero del 1 al 3");
                sn.next();
                
            }
                      
                      
                      
                     break;
                    
                  case 2:
                      
                      System.out.println("Bienvenido al calculador de perímetro");                    
                      System.out.println("Las figuras a seleccionar son las siguientes: ");
                      
                      System.out.println("1.- Circulo");
                      System.out.println("2.- Triangulo");
                      System.out.println("3.- Cuadrado");
                      
                      try{
                          
                          System.out.println("Selecciona una opcion: ");
                          opcion3 = sn.nextInt();
                          
                          switch(opcion3){
                              
                              case 1:
                                  
                                  System.out.println("Ingrese el diametro");
                                  diametro = sn.nextInt();
                                  resp = pi * diametro;
                                  System.out.println("El perímetro es de: "+ resp);
                                  
                                  break;
                                  
                              case 2:
                                  System.out.println("Ingrese el primer lado");
                                  l1 = sn.nextInt();
                                  System.out.println("Ingrese el segundo lado");
                                  l2 = sn.nextInt();
                                  System.out.println("Ingrese el tercer lado");
                                  l3 = sn.nextInt();
                                  
                                  lf = l1+l2+l3;
                                  
                                  System.out.println("El perímetro es de: "+lf);
                                  
                                  break;
                                  
                              case 3:
                                  
                                  System.out.println("Ingrese el lado del cuadrado");
                                  lc = sn.nextInt();
                                  lcf = lc * 4;
                                  System.out.println("El perímetro es de: "+lcf);
                                  
                                  break;
                                  
                                           default:
                        System.out.println("Opcion no valida, ingresa una correcta");   
                          }
                          
                      }catch(InputMismatchException e){
                
                System.out.println("Opcion no valida, ingresa un numero del 1 al 3");
                sn.next();
                
            }
                 
                    break;
                    
                      case 0:
                      
                         salir=true;
                         
                      break;
                  
                default:
                        System.out.println("Opcion no valida, ingresa un numero del 0 al 2");
               }
            
            }catch(InputMismatchException e){
                
                System.out.println("Opcion no valida, ingresa un numero del 0 al 2");
                sn.next();
                
            }
            
            
 }
        


    
        
    
    
    }
}
