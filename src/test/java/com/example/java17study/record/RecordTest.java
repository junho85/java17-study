package com.example.java17study.record;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecordTest {
    @Test
    void test() {
        Person person = new Person("홍길동", "한국");
        assertThat(person.name())
                .isEqualTo("홍길동");

    }
}
