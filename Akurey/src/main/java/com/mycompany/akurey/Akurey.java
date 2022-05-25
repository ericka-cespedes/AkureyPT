/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.akurey;

import com.mycompany.akurey.model.CompilerClass;

/**
 *
 * @author ericka
 */
public class Akurey {
    private UIFactory factoryUI;
    
    public static void main(String args[]) {
      UIFactory factoryUI = new UIFactory();
      
      UI ui1 = factoryUI.getUI("UI1");
      UI ui2 = factoryUI.getUI("UI2");
      
      System.out.println("Compile with U1");
      CompilerClass ui1JCompiler = ui1.createJavaCompiler();
      ui1JCompiler.compile();
      
      CompilerClass ui1CSCompiler = ui1.createCSCompiler();
      ui1CSCompiler.compile();
      
      System.out.println("Compile with U2");
      CompilerClass ui2JCompiler = ui2.createJavaCompiler();
      ui2JCompiler.compile();
      
      CompilerClass ui2TSCompiler = ui2.createTSCompiler();
      ui2TSCompiler.compile();
    }
}
