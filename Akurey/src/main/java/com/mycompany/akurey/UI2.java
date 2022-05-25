/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akurey;

import com.mycompany.akurey.controller.Controller;
import com.mycompany.akurey.model.CompilerClass;

/**
 *
 * @author ericka
 */
public class UI2 implements UI {

    public Controller controller;

   @Override
   public CompilerClass createJavaCompiler() {
      Controller controller = new Controller();
      return controller.getCompiler("JavaCompiler");
   }
   
    @Override
   public CompilerClass createCSCompiler() {
      Controller controller = new Controller();
      return controller.getCompiler("CSCompiler");
   }
   
    @Override
   public CompilerClass createTSCompiler() {
      Controller controller = new Controller();
      return controller.getCompiler("TSCompiler");
   }
   
    @Override
   public CompilerClass createPythonCompiler() {
      Controller controller = new Controller();
      return controller.getCompiler("PythonCompiler");
   }
   
}
