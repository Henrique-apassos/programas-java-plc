public class TestaAluno {
    public static void main(){
        Curso curso = new Curso("Engenharia da Computação", "18");
        Aluno a = new Aluno("Henrique", "123.456.789-00", 21, curso);
        System.out.println("Dados do aluno:" +a.getNome());
        System.out.println("CPF: " +a.getCPF());
        System.out.println("Idade: " +a.getIdade());
        Curso c = a.getCurso();
        System.out.println("Curso: " +c.getNome());
        a.setCPF("321.654.987-11");
        a.setIdade(23);
        a.setNome("Gabriel");
        curso = new Curso("Ciência da Computação", "17");
        a.setCurso(curso);
        System.out.println("Dados do aluno:" +a.getNome());
        System.out.println("CPF: " +a.getCPF());
        System.out.println("Idade: " +a.getIdade());
        System.out.println("Curso: " +a.getCurso().getNome());

    }
}
