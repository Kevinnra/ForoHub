package Challenge.API.ForoHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String status,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {

}
