import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

public class BoardTest {
    @Nested
    class Preconditions {
        @Test
        void nameMustNotBeNull() {
            assertThatNullPointerException()
                    .isThrownBy(() -> new Board().setxyAxis(null, null))
                    .withMessage("number can not be null");
        }   
    }

    @Test
    void setxyAxis() {
        assertThat(new Board().setxyAxis(Integer.valueOf(7),Integer.valueOf(6))).isEqualTo(13);
    }


    @ParameterizedTest
    @CsvSource({
            "7, 6",
            "42, 99"
    })
    void xyNumber(final Integer int1, final Integer int2) {
        assertThat(new Board().setxyAxis(int1, int2)).isEqualTo(Integer.valueOf(int1 + int2));
    }
}