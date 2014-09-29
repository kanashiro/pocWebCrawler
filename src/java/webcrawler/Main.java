package webcrawler;


import java.io.IOException;
import webcrawler.PocCrawler;
import webcrawler.PocCronService;
import webcrawler.PocDropBox;
import webcrawler.PocMongoDb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rsdsilveira
 */
public class Main {

    public static PocCrawler pocCrawler = new PocCrawler();
    public static PocDropBox pocGoogleDrive = new PocDropBox();
    public static PocMongoDb pocMongoDb = new PocMongoDb();
    public static PocCronService pocCronService = new PocCronService();

    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Escolha a poc e coloca run");
        
        // exemplo:
        
        pocCrawler.Run();
        
    }

}
