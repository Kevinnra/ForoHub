package Challenge.API.ForoHub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull long id, String titulo, String mensaje, String autor) {
}
