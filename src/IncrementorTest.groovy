//import Incrementor;

class IncrementorTest extends GroovyTestCase {
    void testGetNumber() {

        Incrementor incrementor = new Incrementor();

        // 1.
        System.out.println("testGetNumber ... = " + incrementor.getNumber() );

        // 2.
        incrementor.incrementNumber();
        System.out.println("testGetNumber ... = " + incrementor.getNumber() );

        // 3.
        incrementor.incrementNumber();
        System.out.println("testGetNumber ... = " + incrementor.getNumber() );


    }

    void testIncrementNumber() {

        Incrementor incrementor = new Incrementor();

        // 1.
        incrementor.incrementNumber();
        System.out.println("testIncrementNumber ... = " + incrementor.getNumber() );

        // 2.
        incrementor.incrementNumber();
        System.out.println("testIncrementNumber ... = " + incrementor.getNumber() );



    }

    void testSetMaximumValue() {


        Incrementor incrementor = new Incrementor();

        // 1.
        System.out.println("testSetMaximumValue ... = " + incrementor.getNumber() );

        // 2.
        incrementor.setMaximumValue(100000);
        System.out.println("testSetMaximumValue ... = " + incrementor.getNumber() );




    }
}
