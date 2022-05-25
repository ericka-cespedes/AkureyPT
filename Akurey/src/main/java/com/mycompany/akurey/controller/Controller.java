/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akurey.controller;

import com.mycompany.akurey.model.CSCompiler;
import com.mycompany.akurey.model.CompilerClass;
import com.mycompany.akurey.model.JavaCompiler;
import com.mycompany.akurey.model.PythonCompiler;
import com.mycompany.akurey.model.TSCompiler;

/**
 *
 * @author ericka
 */
public class Controller {
    private String compilerType;
    
    // Getter
    public String getCompilerType() {
        return compilerType;
    }

    // Setter
    public void setCompilerType(String newCompilerType) {
        this.compilerType = newCompilerType;
    }
    
    public CompilerClass getCompiler(String compilerType) {
      if(compilerType == null){
         return null;
      }		
      if(compilerType.equalsIgnoreCase("JavaCompiler")){
         return new JavaCompiler();
         
      } else if(compilerType.equalsIgnoreCase("PythonCompiler")){
         return new PythonCompiler();
         
      } else if(compilerType.equalsIgnoreCase("CSCompiler")){
         return new CSCompiler();
         
      } else if(compilerType.equalsIgnoreCase("TSCompiler")){
         return new TSCompiler();
      }
      
      return null;
   }
}
