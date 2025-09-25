package com.asthakastor.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripDto {
private Long id;
private String destination;
private LocalDate startDate;
private LocalDate endDate;
private Double price;
private String status;
}