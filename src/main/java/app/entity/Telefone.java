package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TELEFONE
* @generated
*/
@Entity
@Table(name = "\"TELEFONE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Telefone")
public class Telefone implements Serializable {

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
    @Column(name = "Telefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone;

    /**
    * @generated
    */
    @Column(name = "Ramal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String ramal;

    /**
    * Construtor
    * @generated
    */
    public Telefone(){
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
    public Telefone setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    
    public java.lang.String getTelefone(){
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public Telefone setTelefone(java.lang.String telefone){
        this.telefone = telefone;
        return this;
    }
    /**
    * Obtém ramal
    * return ramal
    * @generated
    */
    
    public java.lang.String getRamal(){
        return this.ramal;
    }

    /**
    * Define ramal
    * @param ramal ramal
    * @generated
    */
    public Telefone setRamal(java.lang.String ramal){
        this.ramal = ramal;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Telefone object = (Telefone)obj;
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