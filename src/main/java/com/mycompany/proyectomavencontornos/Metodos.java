/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomavencontornos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/**
 *
 * @author jose
 */
public class Metodos {
    
    public static void crearRepo(String nomeRepo){
        try {
            GitHub github=GitHub.connect();
            GHCreateRepositoryBuilder builder;
            builder=github.createRepository(nomeRepo);
            builder.create();
        } catch (IOException ex) {
            System.out.println("error"+ex);
        }
        
    }
    
}
