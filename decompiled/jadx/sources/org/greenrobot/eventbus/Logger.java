package org.greenrobot.eventbus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.logging.Level;
import org.greenrobot.eventbus.android.AndroidComponents;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Logger {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default {
        public static Logger get() {
            return AndroidComponents.areAvailable() ? AndroidComponents.get().logger : new SystemOutLogger();
        }
    }

    void log(Level level, String str);

    void log(Level level, String str, Throwable th);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JavaLogger implements Logger {
        protected final java.util.logging.Logger logger;

        public JavaLogger(String str) {
            this.logger = java.util.logging.Logger.getLogger(str);
        }

        @Override // org.greenrobot.eventbus.Logger
        public void log(Level level, String str) {
            this.logger.log(level, str);
        }

        @Override // org.greenrobot.eventbus.Logger
        public void log(Level level, String str, Throwable th) {
            this.logger.log(level, str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SystemOutLogger implements Logger {
        @Override // org.greenrobot.eventbus.Logger
        public void log(Level level, String str, Throwable th) {
            System.out.println(MarkdownConstants.LEFT_BRACKET + level + "] " + str);
            th.printStackTrace(System.out);
        }

        @Override // org.greenrobot.eventbus.Logger
        public void log(Level level, String str) {
            System.out.println(MarkdownConstants.LEFT_BRACKET + level + "] " + str);
        }
    }
}
