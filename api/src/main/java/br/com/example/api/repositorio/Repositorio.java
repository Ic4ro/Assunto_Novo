package br.com.example.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.example.api.modelo.Veiculo;

@Repository
public interface Repositorio extends CrudRepository<Veiculo, Integer> {
    List<Veiculo> findAll();
    Veiculo findByCodigo(int codigo);
}