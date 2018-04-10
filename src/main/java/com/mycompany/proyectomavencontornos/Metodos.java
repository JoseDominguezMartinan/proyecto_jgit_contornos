/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomavencontornos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jgit.api.Git;
import java.io.File;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/**
 * clase con todos los metodos para la ejecución del programa
 * @author jose
 */
public class Metodos {
    /**
     * metodo para crear un repositorio nuevo
     * este metodo cogera el user y pass que metimos en el archivo .github dentro de la carpeta home
     * @param nomeRepo nombre del repositorio que vamos a crear 
     */
    
    public static void crearRepo(String nomeRepo){
        try {
            GitHub github=GitHub.connect(); // realizamos conexion con git
            GHCreateRepositoryBuilder builder;
            builder=github.createRepository(nomeRepo); // creamos el repositorio con el nombre que hemos recogido
            builder.create();
        } catch (IOException ex) {
            System.out.println("error"+ex); // en caso de generarse un error lo recogemos 
        }
        
    }
    /**
     * metodo para clonar un repositorio 
     * @param direccion url del repositorio al que queremos realizar el clonado 
     * @param nome nombre de la carpeta donde meteremos el repositorio creado 
     */
    public static void ClonarRepo(String direccion, String nome){
        try {
            Git.cloneRepository()
                    .setURI("direccion") // marcamos la url a clonar 
                    .setDirectory(new File("C:\\Users\\jose\\Documents\\NetBeansProjects\\"+nome)) // creado en pc de casa con ruta de windows ,en caso de utilizar en clase cambiar la ruta, marcamos la ruta donde se guardara el repositorio clonado 
                    .setCloneAllBranches(true) // indicamos que se clonen todas las ramas del repositorio indicado 
                    .call();
        } catch (GitAPIException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex); // en caso de reliazarse una excepcion la recogemos 
        }
                }
    
}
