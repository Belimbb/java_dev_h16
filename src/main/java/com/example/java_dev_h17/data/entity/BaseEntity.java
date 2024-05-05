package com.example.java_dev_h17.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    @Column(name = "last_updated_date", nullable = false)
    LocalDate lastUpdatedDate;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    LocalDate createdDate;
}
