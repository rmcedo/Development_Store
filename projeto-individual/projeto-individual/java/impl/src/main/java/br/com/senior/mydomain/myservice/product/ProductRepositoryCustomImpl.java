package br.com.senior.mydomain.myservice.product;

import br.com.senior.mydomain.myservice.Categoria;
import br.com.senior.mydomain.myservice.ProductEntity;
import br.com.senior.mydomain.myservice.QProductEntity;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

class ProductRepositoryCustomImpl implements ProductRepositoryCustom {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<ProductEntity> getByCategoria(Categoria categoriaPassada) {
        QProductEntity qProduct = QProductEntity.productEntity;
        return new JPAQuery<>(em)
                .select(qProduct)
                .from(qProduct)
                .where(qProduct.categoria.eq(categoriaPassada))
                .fetch();

    }
}
