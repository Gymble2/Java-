package curso.ninja.lista.infos;

public class Funcionario {
    public String nome;
    public Integer idade;
    public Integer salario[] = {1423,1253,1666};

    public void imprima(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < 3; i++) {
            System.out.println("R$ "+this.salario[i]);

        }

    }

    public  void mediaSalarial(){
        Integer[] media = this.salario;

        float mediaSalario = (float) salario[0] + salario[1] + salario[2];

        System.out.println(mediaSalario/3);



    }


}
