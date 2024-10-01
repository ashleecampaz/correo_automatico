package com.easyconference.access;

import com.easyconference.domain.entities.Article;
import com.easyconference.domain.entities.Conference;
import com.easyconference.domain.entities.Usuario;
import com.easyconference.domain.service.IArticleService;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class ConferenciaArrayListRepository implements  IUserService, IArticleService{

    private ArrayList<Conference> listConference;
    private List<Usuario> usuarios; 
   private List<Article> articulos;
    public ConferenciaArrayListRepository()
    {
        this.listConference= new ArrayList();
        this.usuarios = new ArrayList();
        this.articulos = new ArrayList();
    }
    

    // Método para agregar un nuevo usuario
    public boolean agregarUsuario(Usuario usuario) {
        if (isEmailRegistered(usuario.getEmail())) {
            return false; // Si el email ya está registrado, no agrega el usuario
        }
        usuarios.add(usuario);
        return true;
    }
   
    // Verificar si un email ya está registrado
    @Override
    public boolean isEmailRegistered(String email) {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean validarNombre(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("^[a-zA-Z\\s]+$");
    }

    @Override
    public boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return email != null && pattern.matcher(email).matches();
    }

    @Override
    public boolean validarContrasena(String password) {
        return password != null && password.length() >= 8;
    }

    @Override
    public boolean validarCampo(String Ifield) {
        return Ifield != null && !Ifield.trim().isEmpty();
    }

    @Override
    public void storeUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
       return usuarios;
    }
    
    @Override
    public Usuario login(String correo, String contrasenia) {
       for (Usuario u: usuarios ){
            if(u.getEmail().equals(correo)){
                if(u.getPassword().equals(contrasenia)){
                    return u;
                }
                break;
            }
       }
       return null; 
    }

    @Override
    public void almacenarArticulos(Article objArticle) {
        articulos.add(objArticle);
    }

    @Override
    public List<Article> listarArticulos() {
        return articulos; 
    }
    
}
