import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate data;

   public LocalDate getData() {
      return data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   @Override
   public double calcularXp() {
      return xp_padrao+20;
   }
@Override
   public String toString() {
      return "Curso{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", carga_horaria=" + data +
              '}';
   }
}
