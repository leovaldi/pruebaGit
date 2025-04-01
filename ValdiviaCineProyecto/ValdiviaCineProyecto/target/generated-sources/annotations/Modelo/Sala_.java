package Modelo;

import Modelo.Cine;
import Modelo.Funcion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:36", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Sala.class)
public class Sala_ { 

    public static volatile SingularAttribute<Sala, Cine> cineS;
    public static volatile SingularAttribute<Sala, Integer> numero;
    public static volatile ListAttribute<Sala, Funcion> funciones;
    public static volatile SingularAttribute<Sala, Integer> id;
    public static volatile SingularAttribute<Sala, Integer> capacidad;

}