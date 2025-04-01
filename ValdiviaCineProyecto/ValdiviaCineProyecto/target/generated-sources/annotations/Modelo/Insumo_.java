package Modelo;

import Modelo.Compras;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-27T14:47:35", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Insumo.class)
public class Insumo_ { 

    public static volatile SingularAttribute<Insumo, Compras> compra;
    public static volatile SingularAttribute<Insumo, Double> precio;
    public static volatile SingularAttribute<Insumo, Integer> id;
    public static volatile SingularAttribute<Insumo, String> nombre;

}