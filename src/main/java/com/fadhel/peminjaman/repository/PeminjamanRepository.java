/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.peminjaman.repository;

import com.fadhel.peminjaman.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long>{
    public Peminjaman findByPeminjamanId(Long pinjamId);
}
