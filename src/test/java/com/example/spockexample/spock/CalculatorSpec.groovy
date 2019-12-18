package com.example.spockexample.spock

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def calculator
    def cacheService = Mock(CacheService)

    void setup() {
        calculator = new Calculator(cacheService)
    }

    def "should return the real size of the text string"() {

        expect:
        calculator.size(text) == length

        // given
        where:
        text         | length
        "Spock"      | 5
        "Java"       | 4
        "JavaScript" | 10
    }

    def "should return the sum of a plus b"() {
        expect:
        calculator.sum(a, b) == sum

        where:
        a  | b  | sum
        1  | 2  | 3
        10 | 29 | 39
    }

//    @Unroll
    def "should return true when username equal to logged in username"() {
        cacheService.getName() >> "Spock"

        expect:
        calculator.isLoggedInUser(name) == result

        where:
        name    | result
        "Spock" | true
        "Java"  | false
    }

    def "should throw exception when index out of array index"() {
        when:
        calculator.getValue(100)
        then:
        thrown(IndexOutOfBoundsException)
    }

}
