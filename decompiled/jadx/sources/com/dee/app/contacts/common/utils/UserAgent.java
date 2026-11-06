package com.dee.app.contacts.common.utils;

import android.os.Build;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.contacts.common.exceptions.ClientNotSupportedException;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class UserAgent {
    public static final String USER_AGENT_HEADER = "User-Agent";
    private String appName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.dee.app.contacts.common.utils.UserAgent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dee$app$contacts$common$utils$Client;

        static {
            int[] iArr = new int[Client.values().length];
            $SwitchMap$com$dee$app$contacts$common$utils$Client = iArr;
            try {
                iArr[Client.PhotosApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dee$app$contacts$common$utils$Client[Client.MusicApp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dee$app$contacts$common$utils$Client[Client.AlexaApp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public UserAgent(@Named("ApplicationName") String str) {
        this.appName = str;
    }

    private String formatUserAgentEntry(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, str, "=", str2, MarkdownConstants.RIGHT_BRACKET);
    }

    private String getUserAgentHeader() throws ClientNotSupportedException {
        int i = AnonymousClass1.$SwitchMap$com$dee$app$contacts$common$utils$Client[Client.get(this.appName).ordinal()];
        if (i == 1) {
            return "Amazon Photos/";
        }
        if (i == 2) {
            return "Amazon Music/";
        }
        if (i == 3) {
            return "PitanguiBridge/";
        }
        throw new ClientNotSupportedException(this.appName);
    }

    public String get() throws ClientNotSupportedException {
        return getUserAgentHeader() + "1.0-" + formatUserAgentEntry("PLATFORM", "Android") + formatUserAgentEntry("MANUFACTURER", Build.MANUFACTURER) + formatUserAgentEntry("RELEASE", Build.VERSION.RELEASE) + formatUserAgentEntry("BRAND", Build.BRAND) + formatUserAgentEntry("SDK", String.valueOf(Build.VERSION.SDK_INT)) + formatUserAgentEntry("MODEL", Build.MODEL);
    }
}
