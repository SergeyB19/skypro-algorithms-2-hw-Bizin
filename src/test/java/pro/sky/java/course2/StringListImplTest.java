package pro.sky.java.course2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;


class StringListImplTest {

    @Test
    void clear() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        assertThat(stringList.size()).isEqualTo(4);
        stringList.clear();
        assertThat(stringList.isEmpty()).isTrue();
        assertThat(stringList.toArray()).hasSize(0);

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> stringList.get(1));
    }
}