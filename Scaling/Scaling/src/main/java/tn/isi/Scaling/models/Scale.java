package tn.isi.Scaling.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scale {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
    private double taux;
    private int dureeMin;
    private int dureeMax;
    private double montantMax;
    private double montantMin;


}
