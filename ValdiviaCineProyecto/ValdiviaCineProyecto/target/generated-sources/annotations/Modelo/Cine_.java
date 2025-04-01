package Modelo;

import Modelo.Compras;
import Modelo.Empleado;
import Modelo.Pelicula;
import Modelo.Sala;
import Modelo.SalaVIP;
import Modelo.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:35", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cine.class)
public class Cine_ { 

    public static volatile ListAttribute<Cine, Compras> compras;
    public static volatile ListAttribute<Cine, Sala> salas;
    public static volatile ListAttribute<Cine, Pelicula> peliculas;
    public static volatile ListAttribute<Cine, SalaVIP> salasVIP;
    public static volatile SingularAttribute<Cine, String> direccion;
    public static volatile ListAttribute<Cine, Venta> ventas;
    public static volatile ListAttribute<Cine, Empleado> empleados;
    public static volatile SingularAttribute<Cine, Integer> id;
    public static volatile SingularAttribute<Cine, String> nombre;

}