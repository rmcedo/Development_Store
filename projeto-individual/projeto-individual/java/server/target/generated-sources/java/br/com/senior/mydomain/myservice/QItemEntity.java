package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemEntity is a Querydsl query type for ItemEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemEntity extends EntityPathBase<ItemEntity> {

    private static final long serialVersionUID = 2143658790L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemEntity itemEntity = new QItemEntity("itemEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final QPedidoEntity pedido;

    public final QProductEntity product;

    public final NumberPath<Long> quantity = createNumber("quantity", Long.class);

    public final NumberPath<java.math.BigDecimal> totalValue = createNumber("totalValue", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> unitaryValue = createNumber("unitaryValue", java.math.BigDecimal.class);

    public QItemEntity(String variable) {
        this(ItemEntity.class, forVariable(variable), INITS);
    }

    public QItemEntity(Path<? extends ItemEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemEntity(PathMetadata metadata, PathInits inits) {
        this(ItemEntity.class, metadata, inits);
    }

    public QItemEntity(Class<? extends ItemEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pedido = inits.isInitialized("pedido") ? new QPedidoEntity(forProperty("pedido"), inits.get("pedido")) : null;
        this.product = inits.isInitialized("product") ? new QProductEntity(forProperty("product")) : null;
    }

}

