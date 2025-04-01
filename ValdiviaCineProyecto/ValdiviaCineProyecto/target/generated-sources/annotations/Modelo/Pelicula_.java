package Modelo;

import Modelo.Cine;
import Modelo.Funcion;
import Modelo.Genero;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:36", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile ListAttribute<Pelicula, Funcion> funciones;
    public static volatile SingularAttribute<Pelicula, Genero> genero;
    public static volatile SingularAttribute<Pelicula, Cine> cinep;
    public static volatile SingularAttribute<Pelicula, String> titulo;
    public static volatile SingularAttribute<Pelicula, Integer> id;

}