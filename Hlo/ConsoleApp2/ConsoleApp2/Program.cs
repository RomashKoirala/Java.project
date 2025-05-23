// See https://aka.ms/new-console-template for more information
using ConsoleApp2;
using System;

class Program
{
    static void Main(string[] args)
    {
        String fillname = "bro tf";
        String phno = "123-435";
        fillname = fillname.ToUpper();
        phno = phno.Replace(",", "");
        Console.WriteLine(phno);
        Messages messages = new Messages();
        Console.WriteLine(messages);
        operater opo = new operater();
        Console.WriteLine(opo);
    }
}
class Messages
{
    void hello()
    {
        Console.WriteLine("Hello");
    }
}