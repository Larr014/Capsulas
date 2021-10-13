package com.example.capsulas.modelo;

public class Usuario {
    private String usuario;
    private String correo;
    private String password;
    private String genero;
    private String ciudad;

    public Usuario(String usuario, String correo, String password, String genero, String ciudad) {
        this.usuario = usuario;
        this.correo = correo;
        this.password = password;
        this.genero = genero;
        this.ciudad = ciudad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
