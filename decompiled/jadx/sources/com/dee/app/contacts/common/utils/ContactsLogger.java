package com.dee.app.contacts.common.utils;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.contacts.interfaces.IContactsLogger;
import com.dee.app.contacts.interfaces.models.data.enums.LogLevel;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"LogTagMismatch"})
/* loaded from: classes6.dex */
public class ContactsLogger implements IContactsLogger {
    private static final String BUILD_TYPE_USER = "user";
    private static final String BUILD_TYPE_USERDEBUG = "userdebug";
    private static final int MAX_TAG_LENGTH = 23;
    private static boolean userBuild = false;
    private static boolean userDebugBuild = false;
    public String tag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ContactsLoggerFactory {
        ContactsLogger getLogger(Object obj);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ContactsLoggerFactoryImpl implements ContactsLoggerFactory {
        @Override // com.dee.app.contacts.common.utils.ContactsLogger.ContactsLoggerFactory
        public ContactsLogger getLogger(Object obj) {
            return new ContactsLogger(ContactsLogger.generateTag("", obj), 0);
        }
    }

    static {
        String str = Build.TYPE;
        if (str != null) {
            userBuild = str.equals(BUILD_TYPE_USER);
            userDebugBuild = str.equals(BUILD_TYPE_USERDEBUG);
        }
    }

    public ContactsLogger() {
        this.tag = Constants.LOG_TAG;
    }

    public static String generateTag(String str, Object obj) {
        String simpleName;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("prefix must be non-null.");
            return null;
        }
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("tagObj must be non-null.");
            return null;
        }
        if (obj instanceof CharSequence) {
            simpleName = obj.toString();
            if (simpleName.equals("")) {
                Single$$ExternalSyntheticBUOutline0.m$3("tagObj cannot be an empty string.");
                return null;
            }
        } else {
            Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
            simpleName = (!cls.isAnonymousClass() || cls.getEnclosingClass() == null) ? cls.getSimpleName() : cls.getEnclosingClass().getSimpleName();
        }
        String concat = str.concat(simpleName);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static ContactsLogger getLogger(Object obj) {
        return new ContactsLogger(generateTag("", obj));
    }

    public static boolean isDebugBuild() {
        return !userBuild;
    }

    public static boolean isUserDebugBuild() {
        return userDebugBuild;
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void d(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Debug)) {
            String.format(str, objArr);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void ds(String str) {
        d(str);
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void e(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, String.format(str, objArr));
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public String getTag() {
        return this.tag;
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void i(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, String.format(str, objArr));
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public boolean isLoggable(LogLevel logLevel) {
        if (isUserDebugBuild()) {
            return true;
        }
        return Log.isLoggable(this.tag, logLevel.getValue());
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public String sensitive(String str) {
        return isLoggable(LogLevel.Debug) ? str : "*****";
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void v(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Verbose)) {
            String.format(str, objArr);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void w(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, String.format(str, objArr));
        }
    }

    public /* synthetic */ ContactsLogger(String str, int i) {
        this(str);
    }

    private ContactsLogger(String str) {
        this.tag = str;
    }

    public static ContactsLogger getLogger(String str, Object obj) {
        return new ContactsLogger(generateTag(str, obj));
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void d(String str) {
        isLoggable(LogLevel.Debug);
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void v(String str) {
        isLoggable(LogLevel.Verbose);
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void d(String str, Throwable th) {
        isLoggable(LogLevel.Debug);
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void v(String str, Throwable th) {
        isLoggable(LogLevel.Verbose);
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public String sensitiveCallId(String str) {
        return str;
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void e(String str) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, str);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void i(String str) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, str);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void w(String str) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, str);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void e(String str, Throwable th) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, str, th);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void i(String str, Throwable th) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, str, th);
        }
    }

    @Override // com.dee.app.contacts.interfaces.IContactsLogger
    public void w(String str, Throwable th) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, str, th);
        }
    }
}
