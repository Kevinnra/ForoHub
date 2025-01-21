package Challenge.API.ForoHub.domain.topico;

public record DatosListadoTopico(long id, String titulo, String mensaje, String autor) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor());
    }

}
