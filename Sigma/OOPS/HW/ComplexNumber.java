public class ComplexNumber {
    public static void main(String args[]){
        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(1, 2);

        num1.printComplex();

        Complex sum = Complex.addComplex(num1, num2);
        sum.printComplex();

        Complex diff = Complex.diffComplex(num1, num2);
        diff.printComplex();

        Complex prod = Complex.productComplex(num1, num2);
        prod.printComplex();
    }
}
class Complex {
    int real;
    int imaginary;

    
    public Complex(int r, int i){
        this.real = r;
        this.imaginary = i;
    }

    public static Complex addComplex(Complex a, Complex b){
        return new Complex ((a.real + b.real), (a.imaginary + b.imaginary));
    }
    public static Complex diffComplex(Complex a, Complex b){
        return new Complex ((a.real - b.real), (a.imaginary - b.imaginary));
    }
    public static Complex productComplex(Complex a, Complex b){
        return new Complex(((a.real * b.real)-(a.imaginary * b.imaginary)), ((a.real * b.imaginary)+(a.imaginary*b.real)));
    }

    public void printComplex(){
        if(imaginary == 0 & real != 0){
            System.out.println(real);
        }else if(real == 0 & imaginary != 0){
            System.out.println(imaginary);
        }else{
            System.out.println(real + "+" + imaginary + "i");
        }
    }

}
