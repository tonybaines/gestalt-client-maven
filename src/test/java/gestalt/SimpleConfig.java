package gestalt;

import javax.validation.constraints.NotNull;

import com.github.tonybaines.gestalt.Default;

public interface SimpleConfig {

    @NotNull
    @Default.String("foo")
    String getName();

    @Default.Integer(42)
    int getLevel();

    @Default.Boolean(false)
    boolean isEnabled();
}
