package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ANIME
* @generated
*/
@Entity
@Table(name = "\"ANIME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Anime")
public class Anime implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "anime", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String anime;

    /**
    * @generated
    */
    @Column(name = "episodio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer episodio;

    /**
    * @generated
    */
    @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String ano;

    /**
    * Construtor
    * @generated
    */
    public Anime(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Anime setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém anime
    * return anime
    * @generated
    */
    
    public java.lang.String getAnime(){
        return this.anime;
    }

    /**
    * Define anime
    * @param anime anime
    * @generated
    */
    public Anime setAnime(java.lang.String anime){
        this.anime = anime;
        return this;
    }
    /**
    * Obtém episodio
    * return episodio
    * @generated
    */
    
    public java.lang.Integer getEpisodio(){
        return this.episodio;
    }

    /**
    * Define episodio
    * @param episodio episodio
    * @generated
    */
    public Anime setEpisodio(java.lang.Integer episodio){
        this.episodio = episodio;
        return this;
    }
    /**
    * Obtém ano
    * return ano
    * @generated
    */
    
    public java.lang.String getAno(){
        return this.ano;
    }

    /**
    * Define ano
    * @param ano ano
    * @generated
    */
    public Anime setAno(java.lang.String ano){
        this.ano = ano;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Anime object = (Anime)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}