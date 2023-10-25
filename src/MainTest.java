import org.junit.jupiter.api.Assertions;

class MainTest {
    Main main = new Main();

    @org.junit.jupiter.api.Test
    void occurenceOfSingleChar(){
        String stringToCheck = "hej";
        char charTofind = 'e';
        int expectedResult = 1;
        int actualResult = main.occurence(stringToCheck,charTofind);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void NotSingleOccurenceOfChar() {
        String stringToCheck = "eee";
        char charTofind = 'e';
        int expectedResult = 1;
        int actualResult = main.occurence(stringToCheck,charTofind);
        Assertions.assertNotEquals(expectedResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void MultipleInstancesOfOccurence () {
        String stringToCheck = "heeeeej";
        char charTofind = 'e';
        int expectedResult = 5;
        int actualResult = main.occurence(stringToCheck,charTofind);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void intensitiveOccurenceOfChar(){
        String stringToCheck = "heEeeEj";
        char charTofind = 'e';
        int expectedResult = 5;
        int actualResult = main.occurence(stringToCheck,charTofind);
        Assertions.assertEquals(expectedResult,actualResult);
    }


    @org.junit.jupiter.api.Test
    void nullTest() {
        String stringToCheck = null;
        char charTofind = 'e';
        int expectedResult = -1;
        int actualResult = main.occurence(stringToCheck,charTofind);
        Assertions.assertEquals(expectedResult,actualResult);
    }

}