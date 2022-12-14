package com.edu.icesi.virtualshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "userRole")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @Type(type="org.hibernate.type.UUIDCharType")

    private UUID roleId;

    private String name;

    private String description;

    @PrePersist
    public void generateId(){
        this.roleId = UUID.randomUUID();
    }


}
