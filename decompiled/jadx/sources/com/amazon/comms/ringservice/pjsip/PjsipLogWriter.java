package com.amazon.comms.ringservice.pjsip;

import com.amazon.comms.log.CommsLogger;
import org.pjsip.pjsua2.LogEntry;
import org.pjsip.pjsua2.LogWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PjsipLogWriter extends LogWriter {
    private static final int SPLIT_BUFFER_SIZE = 4000;
    private static final CommsLogger log = CommsLogger.getLogger(PjsipLogWriter.class);

    @Override // org.pjsip.pjsua2.LogWriter
    public void write(LogEntry logEntry) {
        String str;
        String msg = logEntry.getMsg();
        while (true) {
            if (msg.length() > 4000) {
                int lastIndexOf = msg.lastIndexOf(10, 3999) + 1;
                int i = lastIndexOf != 0 ? lastIndexOf : 4000;
                str = msg.substring(i);
                msg = msg.substring(0, i - 1);
            } else {
                str = null;
            }
            int level = logEntry.getLevel();
            if (level == 0) {
                log.e(msg);
            } else if (level == 1) {
                log.w(msg);
            } else if (level == 2) {
                log.i(msg);
            } else if (level == 3) {
                log.ds(msg);
            } else if (level == 4) {
                log.ds(msg);
            } else if (level != 5) {
                log.v(msg);
            } else {
                log.ds(msg);
            }
            if (str == null) {
                return;
            } else {
                msg = str;
            }
        }
    }
}
