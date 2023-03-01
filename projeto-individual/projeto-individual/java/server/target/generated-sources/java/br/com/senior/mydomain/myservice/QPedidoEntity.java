package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPedidoEntity is a Querydsl query type for PedidoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPedidoEntity extends EntityPathBase<PedidoEntity> {

    private static final long serialVersionUID = 1430289880L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPedidoEntity pedidoEntity = new QPedidoEntity("pedidoEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    public final QClientEntity client;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final NumberPath<java.math.BigDecimal> finalValue = createNumber("finalValue", java.math.BigDecimal.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final ListPath<ItemEntity, QItemEntity> items = this.<ItemEntity, QItemEntity>createList("items", ItemEntity.class, QItemEntity.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> orderDate = createDate("orderDate", java.time.LocalDate.class);

    public QPedidoEntity(String variable) {
        this(PedidoEntity.class, forVariable(variable), INITS);
    }

    public QPedidoEntity(Path<? extends PedidoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPedidoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPedidoEntity(PathMetadata metadata, PathInits inits) {
        this(PedidoEntity.class, metadata, inits);
    }

    public QPedidoEntity(Class<? extends PedidoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.client = inits.isInitialized("client") ? new QClientEntity(forProperty("client")) : null;
    }

}

