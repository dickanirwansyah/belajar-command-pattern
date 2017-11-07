package dicka.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hotel",
        catalog = "belajarjwt")
public class Hotel implements Serializable{

    @Id
    @Column(name = "idhotel", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idhotel;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "classification", nullable = false)
    private int classification;

    @Column(name = "isOpen", nullable = false)
    private boolean isOpen;

    protected Hotel(){}

    public Hotel(String nama, int classification, boolean isOpen){
        this.nama = nama;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public long getIdhotel(){
        return idhotel;
    }

    public void setIdhotel(long idhotel){
        this.idhotel = idhotel;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getClassification(){
        return classification;
    }

    public void setClassification(int classification){
        this.classification = classification;
    }

    public boolean getIsopen(){
        return isOpen;
    }

    public void setIsopen(boolean isOpen){
        this.isOpen = isOpen;
    }
}
