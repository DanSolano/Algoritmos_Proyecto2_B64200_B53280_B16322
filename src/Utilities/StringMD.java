/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class StringMD {

    public static String MD2 = "MD2";
    public static String MD5 = "MD5";
    public static String SHA1 = "SHA-1";
    public static String SHA256 = "SHA-256";
    public static String SHA384 = "SHA-384";
    public static String SHA512 = "SHA-512";

    private static String convertirAHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) {
                hash += "0";
            }//if
            hash += Integer.toHexString(b);
        }
        return hash;
    }//fin del metodo convertirAHexadecimal

    public static String getStringMessageDigest(String message, String algorithm) {

        byte[] digest = null; //resumen
        try {

            byte[] buffer = message.getBytes();

            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();

        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error creando Digest");
        }//try catch
        return convertirAHexadecimal(digest);
    }

    public String codificar(String cad) {
        String pass = "";
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < 256; j++) {
                if (cad.charAt(i) == (char) j) {
                    pass += ((char) (j + 5));
                }//Fin For3
            }//Fin For2
        }//Fin For1
        return pass;//Retorna password Codificado
    }//Fin Codificar

    public String decodificar(String cad) {
        String pass = "";
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < 256; j++) {
                if (cad.charAt(i) == (char) j) {
                    pass += ((char) (j - 5));
                }//Fin For3
            }//Fin For2
        }//Fin For1
        return pass;
    }//Fin decodificar

    public char codificarChar(char cad) {
        char pass = ' ';

        for (int j = 0; j < 256; j++) {
            if (cad == (char) j) {
                pass += ((char) (j + 60));
            }//Fin For3
        }//Fin For2

        return pass;//Retorna password Codificado
    }//Fin Codificar

    public char decodificarChar(char cad) {
        char pass = ' ';

        for (int j = 0; j < 256; j++) {
            if (cad == (char) j) {
                pass += ((char) (j - 60));
            }//Fin For3
        }//Fin For2
        return pass;
    }//Fin decodificar
    
    
     //Charset de caracteres cuando se cifra
   private String charset1 = "!#$%&'()*+,-./:<=>?@[]^_|{}~¿⌐¬½☺☻♥♦♣♠•◘○◙♂♀♪♫☼►◄↕‼¶§▬↨↑↓→←∟↔▲▼⌂Çç£¥₧ƒªº¼¡«";  //»░▒▓┤╡╢╖╕╣║╗╝╛
   //Charset de caracteres cuando se descifra
   private String charset2 = "abcdefghijklmnñopqrstuvwxyz 1234567890ABCDEFGHIJKLMNÑOPQRSTUVWXYZáéíóúÁÉÍÓÚ";
    
   /**
    * Metodo que recibe un texto y cifra el contenido de
    * acuerdo a los charset definidos
    * @param texto
    * @return texto
    */
   public String cifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
//      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset2 con los del charset1
      for (int i = 0; i < charset2.length(); i++) {
         texto = texto.replace(charset2.charAt(i), charset1.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
    
   /**
    * Metodo que recibe un texto y descifra el contenido de
    * acuerdo a los charset definidos
    * @param ♀texto
    * @return texto
    */
   public String descifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
//      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset1 con los del charset2
      for (int i = 0; i < charset1.length(); i++) {
         texto = texto.replace(charset1.charAt(i), charset2.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
    
}//fin de la clase
