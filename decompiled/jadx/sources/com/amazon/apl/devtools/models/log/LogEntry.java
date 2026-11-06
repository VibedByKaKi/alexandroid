package com.amazon.apl.devtools.models.log;

import com.amazon.apl.android.Session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LogEntry {
    private final Object[] arguments;
    private final Session.LogEntryLevel level;
    private final Session.LogEntrySource source;
    private final String text;
    private final double timestamp;

    public LogEntry(Session.LogEntryLevel logEntryLevel, Session.LogEntrySource logEntrySource, String str, double d, Object[] objArr) {
        this.level = logEntryLevel;
        this.source = logEntrySource;
        this.text = str;
        this.timestamp = d;
        this.arguments = objArr;
    }

    public Object[] getArguments() {
        return this.arguments;
    }

    public Session.LogEntryLevel getLevel() {
        return this.level;
    }

    public Session.LogEntrySource getSource() {
        return this.source;
    }

    public String getText() {
        return this.text;
    }

    public double getTimestamp() {
        return this.timestamp;
    }
}
