package com.example.sistemadocao.repository

import com.example.sistemadocao.model.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository : JpaRepository<Pet, Long> {
    fun existsByNome(nome: String): Boolean
}