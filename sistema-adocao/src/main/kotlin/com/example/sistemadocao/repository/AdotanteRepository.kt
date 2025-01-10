package com.example.sistemadocao.repository

import com.example.sistemadocao.model.Adotante
import org.springframework.data.jpa.repository.JpaRepository

interface AdotanteRepository : JpaRepository<Adotante, Long>
