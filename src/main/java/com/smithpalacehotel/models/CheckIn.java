package com.smithpalacehotel.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @NotBlank(message = "A data deve ser preenchida.")
    public LocalDateTime dataCheckin;

    // Referenciar a reserva
}
