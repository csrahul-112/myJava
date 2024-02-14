public class ComplexNumber {
    public static void main(String args[]){
        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(1, 2);

        System.out.println(num1.num);
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
    

}
