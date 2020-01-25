package com.github.shatteredsuite.utilities;

/**
 * Provides string-related utilities.
 */
public class StringUtil {

    private StringUtil() {
    }

    /**
     * Tests if a string is empty or null.
     *
     * @param string The string to test.
     * @return <code>true</code> if the string is empty or null, <code>false</code> otherwise.
     */
    public static boolean isEmptyOrNull(String string) {
        return string == null || string.isEmpty();
    }
}
