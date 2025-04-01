package Modelo;

import Modelo.Funcion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:35", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Double> precio;
    public static volatile SingularAttribute<Entrada, Integer> id;
    public static volatile SingularAttribute<Entrada, String> asiento;
    public static volatile SingularAttribute<Entrada, Funcion> funcion;

}