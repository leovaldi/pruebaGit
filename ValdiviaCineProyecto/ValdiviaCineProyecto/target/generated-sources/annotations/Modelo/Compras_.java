package Modelo;

import Modelo.Cine;
import Modelo.Insumo;
import Modelo.Proveedor;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:36", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, Date> fecha;
    public static volatile ListAttribute<Compras, Proveedor> proveedores;
    public static volatile SingularAttribute<Compras, Cine> cine;
    public static volatile ListAttribute<Compras, Insumo> insumos;
    public static volatile SingularAttribute<Compras, Integer> id;

}