package com.kube.books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "books", collectionResourceRel = "books")
public interface BookRepository extends CrudRepository<Book,Long> {
}
