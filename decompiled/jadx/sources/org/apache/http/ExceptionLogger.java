package org.apache.http;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ExceptionLogger {
    public static final ExceptionLogger NO_OP = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.1
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
        }
    };
    public static final ExceptionLogger STD_ERR = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.2
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
            exc.printStackTrace();
        }
    };

    void log(Exception exc);
}
