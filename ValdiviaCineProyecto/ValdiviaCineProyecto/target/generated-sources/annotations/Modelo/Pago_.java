package Modelo;

import Modelo.TipoPago;
import Modelo.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:36", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, TipoPago> tipo;
    public static volatile ListAttribute<Pago, Venta> venta;
    public static volatile SingularAttribute<Pago, Double> monto;
    public static volatile SingularAttribute<Pago, Integer> id;

}