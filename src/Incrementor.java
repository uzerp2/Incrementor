/////////////////////////////////////////////////////////////////////////////
//



/**
 *
 * Класс инкрементор со свойствами <b>defaultValue</b> и <b>value</b>.
 * @author p.semin
 * @version 1.0
 *
 */

public class Incrementor {

    private static final int MAX_VALUE = 883; // задается ручками

    /** Поле значение по умолчанию */
    private int defaultValue;

    /** Поле значение */
    private int value;



    Incrementor()
    {
        this.value = 0;
        this.defaultValue = MAX_VALUE;

        System.out.println("Конструктор ...");
    }


    /**
     * Возвращает текущее число. В самом начале это ноль.
     *
     * Функция Возвращает текущее число {@link Incrementor#value}
     * @return Возвращает текущее число
     *
     */
    public int getNumber() {
        return this.value;

    }


    /**
     * Увеличивает текущее число на один. После каждого вызова этого
     * метода getNumber() будет возвращать число на один больше.
     *
     * Увеличивает текущее число на один {@link Incrementor#value}
     *
     */
    public void incrementNumber(){

        if (this.value == MAX_VALUE) {
            this.value = 0;
            return;
        }

        this.value = this.value + 1;
    }


    /**
     * Устанавливает максимальное значение текущего числа.
     * Когда при вызове incrementNumber() текущее число достигает
     * этого значения, оно обнуляется, т.е. getNumber() начинает
     * снова возвращать ноль, и снова один после следующего
     * вызова incrementNumber() и так далее.
     * По умолчанию максимум -- максимальное значение int.
     * Если при смене максимального значения число резко начинает
     * превышать максимальное значение, то число надо обнулить.
     * Нельзя позволять установить тут число меньше нуля.
     *
     * Устанавливает максимальное значение текущего числа {@link Incrementor#value}
     * @param maximumValue - максимальное значение текущего числа
     *
     */
    public void setMaximumValue(int maximumValue) {

        if(maximumValue < 0 ) {
            return;
        }


        this.value = maximumValue;


    }



    public static void main(String[] args) {


        Incrementor incrementor = new Incrementor();
        incrementor.incrementNumber();
        incrementor.incrementNumber();
        incrementor.incrementNumber();
        //incrementor.setMaximumValue(100000);

        System.out.println("Уточка, плыви! ... = " + incrementor.getNumber() );


    }



}
