using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AlgoritimosSequenciais
{
    class Program
    {
        static void Main(string[] args)
        {
            double valor, valf, porcem;

            Console.Write("Informe o valor de custo: ");
            valor = double.Parse(Console.ReadLine());

            Console.Write("Informe a porcentagem do lucro: ");
            porcem = double.Parse(Console.ReadLine());

            valf = valor + (valor * (100 / porcem));

            Console.WriteLine("O valor do produto sera: "+ valf.ToString());
            Console.ReadKey();
        }
    }
}
