package com.amazon.alexa.assistant.capability.externalmediaplayer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getValidationData", "", "", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayer;", "context", "Landroid/content/Context;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExternalMediaPlayerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalMediaPlayerExtensions.kt\ncom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n13472#2,2:37\n*S KotlinDebug\n*F\n+ 1 ExternalMediaPlayerExtensions.kt\ncom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerExtensionsKt\n*L\n25#1:37,2\n*E\n"})
/* loaded from: classes15.dex */
public final class ExternalMediaPlayerExtensionsKt {
    @NotNull
    public static final List<String> getValidationData(@NotNull ExternalMediaPlayer externalMediaPlayer, @NotNull Context context) {
        externalMediaPlayer.getClass();
        context.getClass();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(externalMediaPlayer.getLocalPlayerId(), 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        String encodeToString = Base64.encodeToString(signature.toByteArray(), 2);
                        encodeToString.getClass();
                        arrayList.add(encodeToString);
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }
}
