package com.springdata.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
@Getter
public abstract class BaseEntity {

    @CreatedDate
    @Column(name="createAt", updatable = false)
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column(name="updateAt")
    private LocalDateTime updateAt;
}