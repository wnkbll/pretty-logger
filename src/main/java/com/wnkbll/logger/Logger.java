package com.wnkbll.logger;

import com.wnkbll.logger.modules.LogPrinter;

public final class Logger {
    private static final LogPrinter printer = new LogPrinter();

    public static void debug(String message) {
        printer.debug(message);
    }

    public static void info(String message) {
        printer.info(message);
    }

    public static void success(String message) {
        printer.success(message);
    }

    public static void warning(String message) {
        printer.warning(message);
    }

    public static void error(String message) {
        printer.error(message);
    }

    public static void critical(String message) {
        printer.critical(message);
    }
}
