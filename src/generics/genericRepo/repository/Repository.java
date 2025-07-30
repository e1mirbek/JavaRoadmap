package generics.genericRepo.repository;

import generics.genericRepo.model.Entity;

// Repository<T>	Обобщённый интерфейс с параметром типа T
//  можешь передавать в него разные типы

// <T extends Entity>
// Ограничивает T, чтобы он обязательно был Entity или его наследником.
// То есть ты не можешь передать, например, String или Integer.

public interface Repository <T extends Entity>{

    void save (T entity);
    T findById(Long id);
    void delete (Long id);

}
