package cep.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PAIS
* @generated
*/
@Entity
@Table(name = "\"PAIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cep.entity.Pais")
public class Pais implements Serializable {

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
    @Column(name = "pais", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pais;

    /**
    * Construtor
    * @generated
    */
    public Pais(){
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
    public Pais setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém pais
    * return pais
    * @generated
    */
    
    public java.lang.String getPais(){
        return this.pais;
    }

    /**
    * Define pais
    * @param pais pais
    * @generated
    */
    public Pais setPais(java.lang.String pais){
        this.pais = pais;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pais object = (Pais)obj;
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