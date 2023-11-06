package com.example.usbe.entity;

import com.example.usbe.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "url")
public class URL {

    @Id
    private String id;
    private String value;
    @PrePersist
    private void generateId() {
        if (this.id == null) {
            this.id = CustomIdGenerator.generateRandomId(4);
        }
    }
}
