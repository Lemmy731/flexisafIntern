public class Inheritance
{
   
        //write a program that demonstrates your knowledge of nested classes, access modifiers, anonymous class

            public static void main(String[] args)
            {
                //main method
             Inheritance inherit = new Inheritance();
             int result = inherit.CalculateMethod();
             System.out.print(result);

            }


            //anonymous class in CalculateMethod
            public int CalculateMethod()
            {
                //anonymous class to provide implementation for interface ICalculate
                ICaculate calculate = new ICaculate()
            {
                public int Add()
                {
                    int lowest = 400;
                    int highest = 900;
                    int total = lowest + highest;
                    return(total);
                }
            };
            int result = calculate.Add();
            return(result);
            }
}

//interface to be implemented by anonymous class
interface ICaculate
{
    public int Add();
}
