public class Curso {

    private String nomeCurso;
    private String professorCurso;

    public Curso(String nomeCurso, String professorCurso) {
        this.nomeCurso = nomeCurso;
        this.professorCurso = professorCurso;

    }

    public Curso (){}

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getProfessorCurso() {
        return professorCurso;
    }

    public void setProfessorCurso(String professorCurso) {
        this.professorCurso = professorCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", professorCurso='" + professorCurso + '\'' +
                '}';
    }
}
