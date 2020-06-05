package com.yng.wallet.merchants.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Merchants Object Model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="merchants")
public class Merchants {
    // merchant id,
    @Id
    @GeneratedValue
    @Column(name = "id", nullable=false)
    private Integer id;

    // merchant name, golobal unique
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    @Basic
    @Column(name = "isAudit", nullable = false)
    private Boolean isAudit = false;
}
