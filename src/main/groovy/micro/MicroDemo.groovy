package micro

class MicroDemo {
    static void main(args) {

        String μ = 'Jeff Scott Brown'

        println "The Name Is ${μ}"
    }

    void someMethod() {
        // this line of code will compile...
        String μ = 'good one'

        // this line of code will not compile
//        String µ = 'bad one'
    }
}