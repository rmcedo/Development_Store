package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClientEntity is a Querydsl query type for ClientEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClientEntity extends EntityPathBase<ClientEntity> {

    private static final long serialVersionUID = -1893442082L;

    public static final QClientEntity clientEntity = new QClientEntity("clientEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    public final BooleanPath active = createBoolean("active");

    public final DatePath<java.time.LocalDate> birthday = createDate("birthday", java.time.LocalDate.class);

    public final StringPath cpf = createString("cpf");

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath name = createString("name");

    public QClientEntity(String variable) {
        super(ClientEntity.class, forVariable(variable));
    }

    public QClientEntity(Path<? extends ClientEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClientEntity(PathMetadata metadata) {
        super(ClientEntity.class, metadata);
    }

}

