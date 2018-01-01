package br.com.triway.dao;
import java.io.Serializable;
import java.util.Collection;
public abstract interface Dao<E, K extends Serializable> {
	E consultar(final K id);
	void alterar(final E entidade);
	void salvar(final E entidade);
	void remover(final E entidade);
	Collection<E> listar();
}
