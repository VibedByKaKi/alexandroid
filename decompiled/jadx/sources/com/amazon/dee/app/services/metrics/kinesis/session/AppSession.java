package com.amazon.dee.app.services.metrics.kinesis.session;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.kinesis.context.KinesisContext;
import com.amazon.dee.sdk.iotsoftap.Constants;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.client.utils.CacheControl;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\""}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession;", "Lcom/amazonaws/mobileconnectors/amazonmobileanalytics/internal/core/util/JSONSerializable;", "context", "Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;", "<init>", "(Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;)V", "sessionID", "", "startTime", "stopTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sessionIdTimeFormat", "Ljava/text/SimpleDateFormat;", "getSessionID", "()Ljava/lang/String;", "", "getStartTime", "()J", "value", "getStopTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isPaused", "", "()Z", "pause", "", "resume", "getSessionDuration", "generateSessionID", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppSession implements JSONSerializable {

    @NotNull
    private static final String JSON_SESSION_ID_ATTR = "session_id";

    @NotNull
    private static final String JSON_START_TIME_ATTR = "start_time";

    @NotNull
    private static final String JSON_STOP_TIME_ATTR = "stop_time";
    private static final int SESSION_ID_APPKEY_LENGTH = 8;

    @NotNull
    private static final String SESSION_ID_DATE_FORMAT = "yyyyMMdd";
    private static final char SESSION_ID_DELIMITER = '-';
    private static final char SESSION_ID_PAD_CHAR = '_';

    @NotNull
    private static final String SESSION_ID_TIME_FORMAT = "HHmmssSSS";
    private static final int SESSION_ID_UNIQID_LENGTH = 8;

    @NotNull
    private final String sessionID;

    @NotNull
    private final SimpleDateFormat sessionIdTimeFormat;
    private final long startTime;

    @Nullable
    private Long stopTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AppSession.class);

    private AppSession(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
        this.sessionIdTimeFormat = simpleDateFormat;
        this.startTime = Long.parseLong(StringsKt.trim((CharSequence) str2).toString());
        long parseLong = Long.parseLong(StringsKt.trim((CharSequence) str3).toString());
        this.stopTime = parseLong == Long.MIN_VALUE ? null : Long.valueOf(parseLong);
        this.sessionID = str;
    }

    @JvmStatic
    @Nullable
    public static final AppSession getSessionFromSerializedSession(@Nullable String str) {
        return INSTANCE.getSessionFromSerializedSession(str);
    }

    @JvmStatic
    @NotNull
    public static final AppSession newInstance(@NotNull KinesisContext kinesisContext) {
        return INSTANCE.newInstance(kinesisContext);
    }

    @NotNull
    public final String generateSessionID(@NotNull KinesisContext context) {
        context.getClass();
        String id = context.getUniqueId().getId();
        if (id == null) {
            id = "";
        }
        return a$$ExternalSyntheticOutline0.m$1(INSTANCE.trimOrPad(id, 8), "-", this.sessionIdTimeFormat.format(Long.valueOf(this.startTime)));
    }

    public final long getSessionDuration() {
        Long l = this.stopTime;
        long longValue = l != null ? l.longValue() : System.currentTimeMillis();
        long j = this.startTime;
        if (longValue < j) {
            return 0L;
        }
        return longValue - j;
    }

    @NotNull
    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Long getStopTime() {
        return this.stopTime;
    }

    public final boolean isPaused() {
        return this.stopTime != null;
    }

    public final void pause() {
        if (isPaused()) {
            return;
        }
        this.stopTime = Long.valueOf(System.currentTimeMillis());
    }

    public final void resume() {
        this.stopTime = null;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable
    @NotNull
    public JSONObject toJSONObject() {
        Long l = this.stopTime;
        long longValue = l != null ? l.longValue() : Long.MIN_VALUE;
        JSONBuilder jSONBuilder = new JSONBuilder(this);
        jSONBuilder.withAttribute(JSON_SESSION_ID_ATTR, this.sessionID);
        jSONBuilder.withAttribute(JSON_START_TIME_ATTR, Long.valueOf(this.startTime));
        jSONBuilder.withAttribute(JSON_STOP_TIME_ATTR, Long.valueOf(longValue));
        JSONObject jSONObject = jSONBuilder.toJSONObject();
        jSONObject.getClass();
        return jSONObject;
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = toJSONObject();
        try {
            String jSONObject2 = jSONObject.toString(4);
            jSONObject2.getClass();
            return jSONObject2;
        } catch (JSONException unused) {
            String jSONObject3 = jSONObject.toString();
            jSONObject3.getClass();
            return jSONObject3;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\u0017\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession$Companion;", "", "<init>", "()V", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "", "SESSION_ID_DATE_FORMAT", "SESSION_ID_TIME_FORMAT", "SESSION_ID_DELIMITER", "", "SESSION_ID_PAD_CHAR", "SESSION_ID_APPKEY_LENGTH", "", "SESSION_ID_UNIQID_LENGTH", "JSON_SESSION_ID_ATTR", "JSON_START_TIME_ATTR", "JSON_STOP_TIME_ATTR", SmartFragmentEventProcessor.NEW_INSTANCE, "Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession;", "context", "Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;", "getSessionFromSerializedSession", "serializedSession", "trimOrPad", "length", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String trimOrPad(String str, int i) {
            String repeat;
            if (str.length() > i) {
                return str.substring(str.length() - i);
            }
            if (str.length() >= i) {
                return str;
            }
            repeat = StringsKt__StringsJVMKt.repeat("_", i - str.length());
            return BitVector$$ExternalSyntheticOutline0.m(repeat, str);
        }

        @JvmStatic
        @Nullable
        public final AppSession getSessionFromSerializedSession(@Nullable String serializedSession) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (serializedSession != null && !StringsKt.isBlank(serializedSession)) {
                try {
                    JSONObject jSONObject = new JSONObject(serializedSession);
                    String string = jSONObject.getString(AppSession.JSON_SESSION_ID_ATTR);
                    string.getClass();
                    String string2 = jSONObject.getString(AppSession.JSON_START_TIME_ATTR);
                    string2.getClass();
                    String string3 = jSONObject.getString(AppSession.JSON_STOP_TIME_ATTR);
                    string3.getClass();
                    return new AppSession(string, string2, string3, defaultConstructorMarker);
                } catch (NumberFormatException e) {
                    Log.e(AppSession.TAG, e, "Unable to parse session times", new Object[0]);
                } catch (JSONException e2) {
                    Log.e(AppSession.TAG, e2, "Unable to create session", new Object[0]);
                }
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final AppSession newInstance(@NotNull KinesisContext context) {
            context.getClass();
            return new AppSession(context, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppSession(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    private AppSession(KinesisContext kinesisContext) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
        this.sessionIdTimeFormat = simpleDateFormat;
        this.startTime = System.currentTimeMillis();
        this.sessionID = generateSessionID(kinesisContext);
    }

    public /* synthetic */ AppSession(KinesisContext kinesisContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(kinesisContext);
    }
}
