package org.apache.commons.fileupload.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.io.FileCleaningTracker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FileCleanerCleanup implements ServletContextListener {
    public static final String FILE_CLEANING_TRACKER_ATTRIBUTE = FileCleanerCleanup.class.getName().concat(".FileCleaningTracker");

    public static FileCleaningTracker getFileCleaningTracker(ServletContext servletContext) {
        return (FileCleaningTracker) servletContext.getAttribute(FILE_CLEANING_TRACKER_ATTRIBUTE);
    }

    public static void setFileCleaningTracker(ServletContext servletContext, FileCleaningTracker fileCleaningTracker) {
        servletContext.setAttribute(FILE_CLEANING_TRACKER_ATTRIBUTE, fileCleaningTracker);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        getFileCleaningTracker(servletContextEvent.getServletContext()).exitWhenFinished();
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        setFileCleaningTracker(servletContextEvent.getServletContext(), new FileCleaningTracker());
    }
}
