/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.peminjaman.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pengembalian {
    private Long kembaliId;
    private Long pinjamId;
    private Integer tgldikembalikan;
    private Integer terlambat;
    private Double denda;
}
