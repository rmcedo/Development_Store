package br.com.senior.mydomain.myservice.product;

import br.com.senior.mydomain.myservice.Categoria;
import br.com.senior.mydomain.myservice.ProductEntity;

import java.util.List;

interface ProductRepositoryCustom {
    List<ProductEntity> getByCategoria(Categoria categoriaPassada);
}
