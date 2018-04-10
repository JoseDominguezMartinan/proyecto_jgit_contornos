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
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.InitCommand;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.lib.Repository;

import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.kohsuke.github.GHCreateRepositoryBuilder;

import org.kohsuke.github.GitHub;

/**
 * clase con todos los metodos para la ejecución del programa
 *
 * @author jose
 */
public class Metodos {
    /**
     * metodo para indicar el repositorio sobre el cual vamos a trabajar
     * @param ruta url del repositorio sobre el que vamos a trabajar
     */
    static Repository repository = null; // variable estatica de tipo repositorio 
    static Git git=null; // variable estatica de tipo git 
    public static void crearRepositorio(String ruta){
     FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder(); // creamos un nuevo repository builder 
            
        try {
            repository = repositoryBuilder.setGitDir(new File(ruta)) // creamos un objeto de tipo repository sobre la ruta a la que le queremos hacer el commit
                    .readEnvironment()
                    .findGitDir()
                    .setMustExist(true)
                    .build();
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
             git = new Git(repository); // instanciamos el objeto de tipo git declarado fuera del metodo para poder ser usado en los demas metodos 
    }

    /**
     * metodo para crear un repositorio nuevo este metodo cogera el user y pass
     * que metimos en el archivo .github dentro de la carpeta home
     *
     * @param nomeRepo nombre del repositorio que vamos a crear
     */

    public static void crearRepo(String nomeRepo) {
        try {
            GitHub github = GitHub.connect(); // realizamos conexion con git
            GHCreateRepositoryBuilder builder;
            builder = github.createRepository(nomeRepo); // creamos el repositorio con el nombre que hemos recogido
            builder.create();
        } catch (IOException ex) {
            System.out.println("error" + ex); // en caso de generarse un error lo recogemos 
        }

    }

    /**
     * metodo para clonar un repositorio
     *
     * @param direccion url del repositorio al que queremos realizar el clonado
     * @param nome nombre de la carpeta donde meteremos el repositorio creado
     */
    public static void ClonarRepo(String direccion, String nome) {
        try {
            Git.cloneRepository()
                    .setURI("direccion") // marcamos la url a clonar 
                    .setDirectory(new File("C:\\Users\\jose\\Documents\\NetBeansProjects\\" + nome)) // creado en pc de casa con ruta de windows ,en caso de utilizar en clase cambiar la ruta, marcamos la ruta donde se guardara el repositorio clonado 
                    .setCloneAllBranches(true) // indicamos que se clonen todas las ramas del repositorio indicado 
                    .call();
        } catch (GitAPIException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex); // en caso de reliazarse una excepcion la recogemos 
        }
    }

    /**
     * metodo para crear commits de un repositorio
     *
     * @param mensaje mensaje que mostraremos como descripcion del commit
     * @param ruta ruta del repositorio sobre el que queremos realizar el commit
     */

    public static void crearCommit(String mensaje, String ruta) {
        try {
           
            AddCommand add = git.add(); // objeto addcopmand 
            try {
                add.addFilepattern(ruta).call();
            } catch (GitAPIException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            CommitCommand commit = git.commit(); // // creamos un objeto commit comand 
           
                commit.setMessage(mensaje).call(); // marcamos el mensaje que vamos a poner en el commit en cuestion y creamos el commit 
                // recojemos las excepciones 
            
        }catch (GitAPIException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }

    
    }
    /**
     * metodo para realizar el push una vez realizados los commits 
     * @param ruta url remota sobre el que vamos a trabajar 
     */

    public static void hacerPush(String ruta) {
         PushCommand push=git.push(); // creamos un objeto de tipo pushcommand 
        try { 
            push.setRemote(ruta).call(); // marcamos la ruta y realizamos el commit 
        } catch (GitAPIException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex); // recogemos la excepcion 
        }
         
    }
    /**
     * metodo para inicializar el repositorio en el ide
     * @param ruta ruta local del repositorio en cuestion 
     */
public static void inicializarRepositorio(String ruta){
    InitCommand repositorio=new InitCommand();
        try {
            repositorio.setDirectory(new File(ruta)).call(); // marcamos la ruta del repositorio a inicializar con la url que pedimos al usuario 
        } catch (GitAPIException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
