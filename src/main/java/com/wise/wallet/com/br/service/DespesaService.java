package com.wise.wallet.com.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wise.wallet.com.br.model.Despesa;
import com.wise.wallet.com.br.repository.DespesaRepository;

@Service
public class DespesaService {
    @Autowired
    private DespesaRepository repository;

    public List<Despesa> findAll() {
        return repository.findAll();
    }

    public Despesa save(Despesa despesa) {
        return repository.save(despesa);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

