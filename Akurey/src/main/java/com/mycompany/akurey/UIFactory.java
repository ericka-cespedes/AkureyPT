/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akurey;

/**
 *
 * @author ericka
 */
public class UIFactory {
	
   public UI getUI(String uiType){
      if(uiType == null){
         return null;
      }		
      if(uiType.equalsIgnoreCase("UI1")){
         return new UI1();
         
      } else if(uiType.equalsIgnoreCase("UI2")){
         return new UI2();
         
      }
      
      return null;
   }
}
