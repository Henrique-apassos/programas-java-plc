public class Curso {
    private String nome, codigo;

    public Curso(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(String cod){
        codigo = cod;
    }


}
