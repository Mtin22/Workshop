import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

public class BoardTest {
    @Nested
    class Preconditions {
        @Test
        void nameMustNotBeNull() {
            assertThatNullPointerException()
                    .isThrownBy(() -> new Board().setxAxis(null))
                    .isThrownBy(() -> new Board().setyAxis(null))
                    .withMessage("number can not be null");
        }   
    }

    @Test
    void setxAxis() {
        assertThat(new Board().setxAxis(7)).isEqualTo(7);
    }

    void setyAxis() {
        assertThat(new Board().setyAxis(6)).isEqualTo(6);
    }

    @ParameterizedTest
    @CsvSource({"1, 2", "3, 4", "5, 6"})
    void xyNumber(final int setxAxis, final int setyAxis) {
        assertThat(new Board().setxAxis(setxAxis)).isEqualTo("X Axis " + setxAxis);
        assertThat(new Board().setyAxis(setyAxis)).isEqualTo("Y Axis " + setyAxis);
    }
}
