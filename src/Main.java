import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
              /* CURSO1 */
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("des");
        curso1.setCarga_horaria(8);
        System.out.println(curso1);
               /* CURSO2 */
        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("des");
        curso2.setCarga_horaria(8);
        System.out.println(curso2);
            /* MENTORIA */
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("ths mentoria");
        mentoria.setDescricao("ajuda no código");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        //bootcamp1
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("java developer");
        bootcamp1.setDescrição("descrição");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);
        //      Bootcamp2
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Python");
        bootcamp2.setDescrição("descrição");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria);
        // DEVS
        Dev thais = new Dev();
        thais.setNome("Thaís");
        thais.InscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos"+thais.getConteudosInscritos());
        thais.progredir();
        System.out.println("Conteudos Concluidos"+thais.getConteudosConcluidos());
        thais.progredir();
        System.out.println("Conteudos inscritos"+thais.getConteudosInscritos());
        System.out.println("XP: "+thais.calcularXp());
        System.out.println("------------");
        Dev joao = new Dev();
        joao.InscreverBootcamp(bootcamp2);
        System.out.println("Conteudos inscritos"+joao.getConteudosInscritos());
        joao.progredir();
        System.out.println("Conteudos Concluidos"+joao.getConteudosConcluidos());
        System.out.println("XP: "+joao.calcularXp());


    }
}