package com.abes.cse12.bms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="books")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private  String name;
    private double price;
    private int totalPage;

}
