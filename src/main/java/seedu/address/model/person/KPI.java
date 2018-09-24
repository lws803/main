package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's KPI(Key Performance Index) in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidKPI(String)}
 */
public class KPI {

    //TODO change message KPI constraints
    public static final String MESSAGE_KPI_CONSTRAINTS = "Phone numbers should only contain numbers, "
            + "and it should be at least 3 digits long";
    //TODO update regex to accept only floats from 0 to 5
    public static final String KPI_VALIDATION_REGEX = "\\d{2,}";
    public final String value;
    public final boolean doesExist;

    /**
     * Constructs a {@code KPI}.
     *
     * @param score A valid KPI score.
     */
    public KPI(String score) {
        requireNonNull(score);
        checkArgument(isValidKPI(score), MESSAGE_KPI_CONSTRAINTS);
        value = score;
        doesExist = true;

    }

    public KPI(){
        this.value = null;
        doesExist = false;
    }

    /**
     * Returns true if a given string is a valid KPI score.
     */
    public static boolean isValidKPI(String test) {
        return test.matches(KPI_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof KPI // instanceof handles nulls
                && value.equals(((KPI) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}

