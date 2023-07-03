using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using  propriedades_metodos_e_construtores.models;

namespace propriedades_metodos_e_construtores.models
{
    public class Curso
    {
        public string Nome { get; set; }
        public List<Pessoa> Alunos { get; set; }

        public void AdicionarAluno(Pessoa aluno){
            Alunos.Add(aluno);
        }

        public int GetQuantidadeDeAlunos(){
            return Alunos.Count;
        }

        public bool RemoveAluno(Pessoa aluno){
            Alunos.Remove(aluno);
            return true;
        }

        public void ListarAlunos(){
            foreach(Pessoa aluno in Alunos){
                System.Console.WriteLine(aluno.NomeCompleto);
            }
        }

    }
}