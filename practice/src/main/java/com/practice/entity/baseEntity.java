package com.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.LocalTime;

@MappedSuperclass
@EntityListeners( value = {AuditingEntityListener.class})
@Getter
public class baseEntity {

    @CreatedDate
    @Column(name="regdate")
    private LocalDateTime createdby;
    @LastModifiedDate
    @Column(name="moddate")
    private LocalDateTime modifiedby;
}
