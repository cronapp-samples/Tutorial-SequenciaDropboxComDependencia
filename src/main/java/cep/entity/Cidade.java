package cep.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CIDADE
* @generated
*/
@Entity
@Table(name = "\"CIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cep.entity.Cidade")
public class Cidade implements Serializable {

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
    @Column(name = "Cidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cidade;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_estado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Estado estado;

    /**
    * Construtor
    * @generated
    */
    public Cidade(){
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
    public Cidade setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    
    public java.lang.String getCidade(){
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Cidade setCidade(java.lang.String cidade){
        this.cidade = cidade;
        return this;
    }
    /**
    * Obtém estado
    * return estado
    * @generated
    */
    
    public Estado getEstado(){
        return this.estado;
    }

    /**
    * Define estado
    * @param estado estado
    * @generated
    */
    public Cidade setEstado(Estado estado){
        this.estado = estado;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cidade object = (Cidade)obj;
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