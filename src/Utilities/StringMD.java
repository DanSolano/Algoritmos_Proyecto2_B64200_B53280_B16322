/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

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
                    pass += ((char) (j + 100));
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
                    pass += ((char) (j - 100));
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
}//fin de la clase
