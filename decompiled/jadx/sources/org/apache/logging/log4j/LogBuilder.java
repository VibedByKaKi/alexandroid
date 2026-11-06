package org.apache.logging.log4j;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface LogBuilder {
    public static final LogBuilder NOOP = new LogBuilder() { // from class: org.apache.logging.log4j.LogBuilder.1
    };

    default Message logAndGet(Supplier<Message> supplier) {
        return null;
    }

    default void log(CharSequence charSequence) {
    }

    default LogBuilder withLocation(StackTraceElement stackTraceElement) {
        return this;
    }

    default void log(Object obj) {
    }

    default void log(String str) {
    }

    default void log(String str, Object obj) {
    }

    default void log(String str, Object obj, Object obj2) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
    }

    default void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
    }

    default void log(String str, Object... objArr) {
    }

    default void log(String str, Supplier<?>... supplierArr) {
    }

    default void log() {
    }

    default void log(Message message) {
    }

    default LogBuilder withLocation() {
        return this;
    }

    default void log(Supplier<Message> supplier) {
    }

    default LogBuilder withMarker(Marker marker) {
        return this;
    }

    default LogBuilder withThrowable(Throwable th) {
        return this;
    }
}
