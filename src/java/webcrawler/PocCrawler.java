/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

import java.io.IOException;
import java.util.Scanner;
import modelos.RespostaCrawler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author rsdsilveira
 */
public class PocCrawler {

    public RespostaCrawler pegarProduto(String nomeProduto) throws IOException {

        nomeProduto = nomeProduto.replace(" ", "+");

        Document doc = Jsoup.connect("http://busca.americanas.com.br/busca.php?q=" + nomeProduto).get();
        String newsHeadlines = doc.getElementsByClass("productImg").get(0).getElementsByTag("a").get(0).getElementsByAttribute("href").attr("href");

        Document doc2 = Jsoup.connect(newsHeadlines.substring(48)).get();

        RespostaCrawler resultado = new RespostaCrawler();

        resultado.NomeProduto = doc2.select("div.pure-u-1 > div > h1").text();
        resultado.Codigo = doc2.select("div.pure-u-1 > div > span > span").text().replace(')', ' ');
        resultado.ValorProduto = doc2.select("div.mp-pb-item.mp-pb-to.mp-price").text();

        return resultado;
    }

    public void Run() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um produto desejado, substituindo espacos por +.");
        String produto = scanner.next();

        Document doc = Jsoup.connect("http://busca.americanas.com.br/busca.php?q=" + produto).get();
        String newsHeadlines = doc.getElementsByClass("productImg").get(0).getElementsByTag("a").get(0).getElementsByAttribute("href").attr("href");

        Document doc2 = Jsoup.connect(newsHeadlines.substring(48)).get();

        System.out.println(doc2.select("div.pure-u-1 > div > h1").text());
        System.out.println(doc2.select("div.pure-u-1 > div > span > span").text().replace(')', ' '));
        System.out.println(doc2.select("div.mp-pb-item.mp-pb-to.mp-price").text());
    }
}
