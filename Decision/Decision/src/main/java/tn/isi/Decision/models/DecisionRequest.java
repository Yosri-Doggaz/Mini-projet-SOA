package tn.isi.Decision.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DecisionRequest {
    private Long request_id;
    private String scoringResult;
}
