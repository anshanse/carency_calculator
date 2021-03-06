package repository;

import Model.BaseGoods;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


public interface Repository<E extends BaseGoods<ID>, ID> {

    public E getOne(ID id);

    public List<E> saveAll(Iterable<E> itrbl);

    public Collection<E> findAll();

    public void deleteAll();

    public void deleteById(ID id);

    public long count();

    public boolean existsById(ID id);

    public Optional<E> findById(ID id);

    public E save(E e);

}
