/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.akurey;

import com.mycompany.akurey.model.CompilerClass;

/**
 *
 * @author ericka
 */
public interface UI {
    // public and abstract
    CompilerClass createJavaCompiler();
    CompilerClass createCSCompiler();
    CompilerClass createTSCompiler();
    CompilerClass createPythonCompiler();
}
