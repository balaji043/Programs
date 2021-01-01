package tech.balaji;


import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import java.util.Arrays;

import static java.lang.String.valueOf;
import static tech.balaji.CustomLogger.CommonEncoder.encode;

public class CustomLogger implements Logger {

    private static final String BRACKETS = "\\{}";
    private static final String STRING_FORMAT_SPECIFIERS = "%s";

    private final Logger log;

    private CustomLogger(Class<?> clazz) {
        log = LoggerFactory.getLogger(clazz);
    }

    public static CustomLogger getLogger(Class<?> clazz) {
        return new CustomLogger(clazz);
    }

    @Override
    public String getName() {
        return log.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public void trace(String s) {
        log.trace(s);
    }

    @Override
    public void trace(String s, Object o) {
        log.trace(s, encode(o));
    }

    @Override
    public void trace(String s, Object o, Object o1) {
        log.trace(s, encode(o), encode(o1));
    }

    @Override
    public void trace(String s, Object... objects) {
        log.trace(s, encode(objects));
    }

    @Override
    public void trace(String s, Throwable throwable) {
        log.trace(s, throwable);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return log.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String s) {
        log.trace(marker, encode(s));
    }

    @Override
    public void trace(Marker marker, String s, Object o) {
        log.trace(marker, s, encode(o));
    }

    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        log.trace(marker, s, encode(o), encode(o1));
    }

    @Override
    public void trace(Marker marker, String s, Object... objects) {
        log.trace(marker, s, encode(objects));
    }

    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        log.trace(marker, s, throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public void debug(String s) {
        log.debug(encode(s));
    }

    @Override
    public void debug(String s, Object o) {
        log.debug(s, encode(o));
    }

    @Override
    public void debug(String s, Object o, Object o1) {
        log.debug(s, encode(o), encode(o1));
    }

    @Override
    public void debug(String s, Object... objects) {
        log.debug(s, encode(objects));
    }

    @Override
    public void debug(String s, Throwable throwable) {
        log.debug(s, throwable);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return log.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String s) {
        log.debug(marker, encode(s));
    }

    @Override
    public void debug(Marker marker, String s, Object o) {
        log.debug(marker, s, encode(o));
    }

    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        log.debug(marker, s, encode(o), encode(o1));
    }

    @Override
    public void debug(Marker marker, String s, Object... objects) {
        log.debug(marker, s, encode(objects));
    }

    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        log.debug(marker, s, throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public void info(String s) {
        log.info(s);
    }

    @Override
    public void info(String s, Object o) {
        log.info(s, encode(o));
    }

    @Override
    public void info(String s, Object o, Object o1) {
        log.info(s, encode(o), encode(o1));
    }

    @Override
    public void info(String s, Object... objects) {
        log.info(s, encode(objects));
    }

    @Override
    public void info(String s, Throwable throwable) {
        log.info(s, throwable);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return log.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String s) {
        log.info(marker, encode(s));
    }

    @Override
    public void info(Marker marker, String s, Object o) {
        log.info(marker, s, encode(o));
    }

    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        log.info(marker, s, encode(o), encode(o1));
    }

    @Override
    public void info(Marker marker, String s, Object... objects) {
        log.info(marker, s, encode(objects));
    }

    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        log.info(marker, s, throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    @Override
    public void warn(String s) {
        log.warn(s);
    }

    @Override
    public void warn(String s, Object o) {
        log.warn(s, encode(o));
    }

    @Override
    public void warn(String s, Object... objects) {
        log.warn(s, encode(objects));
    }

    @Override
    public void warn(String s, Object o, Object o1) {
        log.warn(s, encode(o), encode(o1));
    }

    @Override
    public void warn(String s, Throwable throwable) {
        log.warn(s, throwable);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return log.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String s) {
        log.warn(marker, s);
    }

    @Override
    public void warn(Marker marker, String s, Object o) {
        log.warn(marker, s, encode(o));
    }

    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {
        log.warn(marker, s, encode(o), encode(o1));
    }

    @Override
    public void warn(Marker marker, String s, Object... objects) {
        log.warn(marker, s, encode(objects));
    }

    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        log.warn(marker, s, throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    @Override
    public void error(String s) {
        log.error(s);

    }

    @Override
    public void error(String s, Object o) {
        log.error(s, encode(o));
    }

    @Override
    public void error(String s, Object o, Object o1) {
        log.error(s, encode(o), encode(o1));
    }

    @Override
    public void error(String s, Object... objects) {
        log.error(s, encode(objects));
    }

    @Override
    public void error(String s, Throwable throwable) {
        log.error(s, throwable);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return log.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String s) {
        log.error(marker, encode(s));
    }

    @Override
    public void error(Marker marker, String s, Object o) {
        log.error(marker, s, encode(o));
    }

    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        log.error(marker, s, encode(o), encode(o1));
    }

    @Override
    public void error(Marker marker, String s, Object... objects) {
        log.error(marker, s, encode(objects));
    }


    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        log.error(marker, s, throwable);
    }

    @UtilityClass
    static class CommonEncoder {

        private static final char UNDERSCORE = '_';
        private static final char NEW_LINE = '\n';
        private static final char CARRIAGE_RETURN = '\r';
        private static final char TAB = '\t';

        public static String encode(String businessKey) {
            if (businessKey == null) return null;
            return replaceChars(businessKey);
        }

        private static String replaceChars(String string) {
            return string.replace(NEW_LINE, UNDERSCORE)
                    .replace(CARRIAGE_RETURN, UNDERSCORE).replace(TAB, UNDERSCORE);
        }

        public static String encode(Integer businessKey) {
            if (businessKey == null) return null;
            return replaceChars(valueOf(businessKey));
        }

        public static String encode(Object businessKey) {
            if (businessKey == null) return null;
            return replaceChars(valueOf(businessKey));
        }

        public static String encode(Throwable throwable) {
            if (throwable == null) return null;
            return replaceChars(Arrays.toString(throwable.getStackTrace()));
        }

        public static Object[] encode(Object... objects) {
            if (objects == null || objects.length == 0)
                return new String[0];
            String[] encoded = new String[objects.length];
            for (int i = 0; i < objects.length; i++) {
                encoded[i] = encode(objects[i]);
            }
            return encoded;
        }

    }
}
