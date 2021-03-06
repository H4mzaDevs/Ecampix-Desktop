/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecampix.blogs.model;

/**
 *
 * @author MSI
 */
public class Blog {
    private int idBlog;
    private String date_blog;
    private String nom_ut_blog;
    private String titre_blog;
    private String desc_blog;
    private String image_blog;

    public Blog() {
    }
    
    

    public Blog(int idBlog, String date_blog, String nom_ut_blog, String titre_blog, String desc_blog, String image_blog) {
        this.idBlog = idBlog;
        this.date_blog = date_blog;
        this.nom_ut_blog = nom_ut_blog;
        this.titre_blog = titre_blog;
        this.desc_blog = desc_blog;
        this.image_blog = image_blog;
    }

    public Blog(String date_blog, String nom_ut_blog, String titre_blog, String desc_blog, String image_blog) {
        this.date_blog = date_blog;
        this.nom_ut_blog = nom_ut_blog;
        this.titre_blog = titre_blog;
        this.desc_blog = desc_blog;
        this.image_blog = image_blog;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public String getDate_blog() {
        return date_blog;
    }

    public void setDate_blog(String date_blog) {
        this.date_blog = date_blog;
    }

    public String getNom_ut_blog() {
        return nom_ut_blog;
    }

    public void setNom_ut_blog(String nom_ut_blog) {
        this.nom_ut_blog = nom_ut_blog;
    }

    public String getTitre_blog() {
        return titre_blog;
    }

    public void setTitre_blog(String titre_blog) {
        this.titre_blog = titre_blog;
    }

    public String getDesc_blog() {
        return desc_blog;
    }

    public void setDesc_blog(String desc_blog) {
        this.desc_blog = desc_blog;
    }

    public String getImage_blog() {
        return image_blog;
    }

    public void setImage_blog(String image_blog) {
        this.image_blog = image_blog;
    }
    
    
}
