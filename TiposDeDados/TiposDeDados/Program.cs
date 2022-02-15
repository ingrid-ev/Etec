using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TiposDeDados
{
    class Program
    {
        static void Main(string[] args)
        {
            //comentarios lineares
            /*para comentar em bloco(varias linhas)*/
            /*Tipos de dados Primitivos
                string(ex: a/A/b/B/1/2/ ...)
                int (1/2/3/2222/ ...)
                double/float (1,2/3,444/...)
                bool (true/false)
            */

            /*
             Funções de conversao
                string p/ int  --> int.parse(string)
                string p/ double  --> double.parse(string)
                string p/ flout  -->  flout.parse(string)
                valor p/ string  --> variavel.tostring()
            */
            int v1;
            int v2;
            int r;

            Console.Write("Informe o primeiro valor:");
            v1 = int.Parse( Console.ReadLine());

            Console.Write("Informe o segundo valor:");
            v2 = int.Parse( Console.ReadLine());

            r = v1 + v2;

            Console.Write("Resultado: " + r.ToString());

            Console.ReadKey();
        }
    }
}
