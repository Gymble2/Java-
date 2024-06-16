package Pessoa;

import java.util.ArrayList;

public class Aula0305 {
    public static void main(String[] args) {
        Aluno a1= new Aluno(1,"joão","001","001-1", "adm", 600);
        Aluno a2= new Aluno(1,"joão","001","001-1", "adm", 600);
        Aluno a3= new Aluno(1,"joão","001","001-1", "adm", 600);
        Professor p1= new Professor(1,"ricardo", 200, "Física",9000);
        Professor p2= new Professor(1,"ricardo", 200, "Física",9000);
        Professor p3= new Professor(1,"ricardo", 200, "Física",9000);
        Empresa e1= new Empresa(1,"ricardo",  "200", 600,9000);
        Empresa e2= new Empresa(1,"ricardo",  "200", 600,9000);
        Empresa e3= new Empresa(1,"ricardo", "200", 600,9000);

        ArrayList<Professor> professores = new ArrayList<>();
            professores.add(p1);
            professores.add(p2);
            professores.add(p3);

        ArrayList<Aluno> alunos= new ArrayList<>();
            alunos.add(a1);
            alunos.add(a2);
            alunos.add(a3);

        ArrayList<Empresa> empresas = new ArrayList<>();
            empresas.add(e1);
            empresas.add(e2);
            empresas.add(e3);


        double total_pago=0;

        for(Professor professor:professores){
            total_pago+=professor.getSalario();
        }
        for (Empresa Empresa: empresas){
            total_pago+=Empresa.getPago();
        }
        double totalrecebido = 0;

        for(Aluno aluno: alunos){
            totalrecebido+=aluno.getMensalidade();
        }
        for (Empresa Empresa:empresas){
            totalrecebido+=Empresa.getSalario();
        }

        /*ArrayList<Receita> receitas = new ArrayList<>();
        receitas.add(a1);
        receitas.add(a2);
        receitas.add(a3);
        receitas.add(e1);
        receitas.add(e2);
        receitas.add(e3);

        ArrayList<Despesas> despesas = new ArrayList<>();
        despesas.add(e1);
        despesas.add(e2);
        despesas.add(e3);
        despesas.add(p1);
        despesas.add(p2);
        despesas.add(p3);

        */

        //totalrecebido= 0;

        for (Receita receita: receitas){
            totalrecebido += receita.receita();
        }

        //total_pago = 0;
        for (Despesas despesa: despesas){
            total_pago += despesa.despesas();
        }
        System.out.println("Total pago "+ total_pago);
        System.out.println("Total recebido "+ totalrecebido);
    }
}
