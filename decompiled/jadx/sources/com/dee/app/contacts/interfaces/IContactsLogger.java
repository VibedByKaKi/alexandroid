package com.dee.app.contacts.interfaces;

import com.dee.app.contacts.interfaces.models.data.enums.LogLevel;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface IContactsLogger {
    void d(String str);

    void d(String str, Throwable th);

    void d(@Nonnull String str, Object... objArr);

    void ds(String str);

    void e(String str);

    void e(String str, Throwable th);

    void e(@Nonnull String str, Object... objArr);

    String getTag();

    void i(String str);

    void i(String str, Throwable th);

    void i(@Nonnull String str, Object... objArr);

    boolean isLoggable(LogLevel logLevel);

    String sensitive(String str);

    String sensitiveCallId(String str);

    void v(String str);

    void v(String str, Throwable th);

    void v(@Nonnull String str, Object... objArr);

    void w(String str);

    void w(String str, Throwable th);

    void w(@Nonnull String str, Object... objArr);
}
