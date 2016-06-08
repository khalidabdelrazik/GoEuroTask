package com.goeuro.app.logger;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goeuro.app.constants.Constants;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

// TODO: Auto-generated Javadoc
/**
 * The Class LoggerManager.
 */
public final class LoggerManager {

	/** The logger manager. */
	private static LoggerManager loggerManager = new LoggerManager();

	/**
	 * Instantiates a new logger manager.
	 */
	private LoggerManager() {
		LoggerContext context = (LoggerContext) LoggerFactory
				.getILoggerFactory();
		try {
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(context);

			context.reset();
			
			configurator.doConfigure(getClass().getResource("/" + Constants.LOGER_OUTPUT_FILE));
		
		} catch (JoranException je) {
			getLogger(LoggerManager.class).error(
					"error in configure logger manager", je);
			StatusPrinter.printInCaseOfErrorsOrWarnings(context);
		}

	}

	/**
	 * Gets the instant.
	 * 
	 * @return the instant
	 */
	public synchronized static LoggerManager getInstant() {
		return loggerManager;
	}

	/**
	 * Gets the logger.
	 * 
	 * @param clazz
	 *            the clazz
	 * @return the logger
	 */
	public Logger getLogger(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}

	/**
	 * Shutdown loggers.
	 */
	public void shutdownLoggers() {
		LoggerContext loggerContext = (LoggerContext) LoggerFactory
				.getILoggerFactory();
		loggerContext.stop();
	}
}
