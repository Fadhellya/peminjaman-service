/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.peminjaman.service;

import com.fadhel.peminjaman.VO.Anggota;
import com.fadhel.peminjaman.VO.Buku;
import com.fadhel.peminjaman.VO.Pengembalian;
import com.fadhel.peminjaman.VO.ResponseTemplateVO;
import com.fadhel.peminjaman.entity.Peminjaman;
import com.fadhel.peminjaman.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
                Peminjaman peminjaman =
                        peminjamanRepository.findByPeminjamanId(peminjamanId);
                        Anggota anggota =
                                restTemplate.getForObject("http://localhost:9001/anggota/"
                                +peminjaman.getAnggotaId(), Anggota.class);
                        Buku buku = 
                                restTemplate.getForObject("http://localhost:9003/buku/"
                                +peminjaman.getBukuId(),Buku.class);
                        Pengembalian pengembalian = 
                                restTemplate.getForObject("http://localhost:9004/pengembalian/"
                                +peminjaman.getTglkembali(),Pengembalian.class);
                        vo.setPeminjaman(peminjaman);
                        vo.setAnggota(anggota);
                        vo.setBuku(buku);
                        return vo;
                                
    }
    
}
