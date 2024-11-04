package com.example.ejercicioevaluable3.models;

import java.util.ArrayList;

public class UsuarioUtil {

    public static ArrayList<Usuario> usuarioList = new ArrayList<>();

    static {
        usuarioList.add(new Usuario(1, "usuario1@gmail.com", "Windows", true, 1, "10:51:37"));
        usuarioList.add(new Usuario(2, "usuario2@gmail.com", "Linux", false, 2, "10:51:37"));
        usuarioList.add(new Usuario(3, "usuario3@gmail.com", "MacOs", true, 3, "10:51:37"));
        usuarioList.add(new Usuario(4, "usuario4@gmail.com", "Windows", false, 4, "10:51:37"));
    }
}
