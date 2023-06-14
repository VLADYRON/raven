package pe.albatross.raven.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Persona {

    private Long id;
    private String paterno;
    private String materno;
    private String nombres;
    private Pais paisNacimiento;
}
