public class Aluno {
    private String nome, cpf;
    private Integer idade;
    private Curso curso;

    public Aluno(String nome, String cpf, Integer idade, Curso curso){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return cpf;
    }

    public Integer getIdade(){
        return idade;
    }

    public Curso getCurso(){
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

}
