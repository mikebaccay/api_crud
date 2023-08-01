package com.Myki.Sample.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "employee_profile")
public class EmployeeProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonProperty("id")
    private Integer Id;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String FirstName;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String LastName;

    @Column(name = "birthday")
    @JsonProperty("birthday")
    private String Birthday;

    @Column(name = "address")
    @JsonProperty("address")
    private String Address;

    @Column(name = "created_at")
    @JsonProperty("created_at")
    private LocalDateTime CreatedAt = LocalDateTime.now();
}
