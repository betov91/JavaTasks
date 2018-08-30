
using System;
        using System.Collections.Generic;
        using System.Linq;
        using System.Text;
        using System.Threading.Tasks;

        namespace Currency_Converter
        {
class Program
{
    static void Main(string[] args)
    {
        double a = double.Parse(Console.ReadLine());
        string b = Console.ReadLine();
        string c = Console.ReadLine();
        double BGN = 1;
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        if (b == "BGN" & c == "USD")
        { Console.WriteLine(Math.Round((a * BGN / USD), 2) + " " + c); }

        else if (b == "BGN" & c == "EUR")
        { Console.WriteLine(Math.Round((a * BGN / EUR), 2) + " " + c); }

        else if (b == "BGN" & c == "GBP")
        { Console.WriteLine(Math.Round((a * BGN / GBP), 2) + " " + c); }

        else if (b == "USD" & c == "EUR")
        { Console.WriteLine(Math.Round((a * USD / EUR), 2) + " " + c); }

        else if (b == "USD" & c == "GBP")
        { Console.WriteLine(Math.Round((a * USD / GBP), 2) + " " + c); }

        else if (b == "USD" & c == "BGN")
        { Console.WriteLine(Math.Round((a * USD / BGN), 2) + " " + c); }

        else if (b == "EUR" & c == "GBP")
        { Console.WriteLine(Math.Round((a * EUR / GBP), 2) + " " + c); }

        else if (b == "EUR" & c == "USD")
        { Console.WriteLine(Math.Round((a * EUR / USD), 2) + " " + c); }

        else if (b == "EUR" & c == "BGN")
        { Console.WriteLine(Math.Round((a * EUR / BGN), 2) + " " + c); }

        else if (b == "GBP" & c == "EUR")
        { Console.WriteLine(Math.Round((a * GBP / EUR), 2) + " " + c); }

        else if (b == "GBP" & c == "USD")
        { Console.WriteLine(Math.Round((a * GBP / USD), 2) + " " + c); }

        else if (b == "GBP" & c == "BGN")
        { Console.WriteLine(Math.Round((a * GBP / BGN), 2) + " " + c); }
    }
}
}