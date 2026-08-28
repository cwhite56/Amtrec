package com.cwhite56.amtrec.domain.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Response that contains list of inclusion rate and list of average index by spell
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassStatsResponse {
    
    private List<Double> inclusion;

    private List<Double> average;
    
}
