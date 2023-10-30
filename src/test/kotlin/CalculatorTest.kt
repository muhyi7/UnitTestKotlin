import org.junit.jupiter.api.Test

//Membuat class untuk test Calculator dengan nama menyesuaikan yang akan ditest
class CalculatorTest {

    //membuat variable untuk test dan memanggil object Calculator(yang ditest)
    val calculator = Calculator()

    //function untuk test pertama
    @Test
    fun testAddSuccess(){
        val result = calculator.add(10,10)
    }
    //function untuk test kedua(dua kali)
    @Test
    fun testAddSuccess2(){
        val result = calculator.add(10,10)
    }

}