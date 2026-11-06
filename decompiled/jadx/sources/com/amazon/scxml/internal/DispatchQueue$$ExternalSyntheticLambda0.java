package com.amazon.scxml.internal;

import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.pryon.PryonLiteEngineProvider;
import com.amazon.alexa.assistant.opusencoder.OpusAudioEncoder;
import com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper;
import com.amazon.comms.calling.presentation.ui.utils.PermissionsHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DispatchQueue$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ DispatchQueue$$ExternalSyntheticLambda0(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit async$lambda$1;
        boolean nativeLibraryLoaded$lambda$1;
        OpusEncoderWrapper opusEncoder_delegate$lambda$0;
        Unit requestPermissionIfNeeded$lambda$5;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                async$lambda$1 = DispatchQueue.async$lambda$1(function0);
                return async$lambda$1;
            case 1:
                nativeLibraryLoaded$lambda$1 = PryonLiteEngineProvider.nativeLibraryLoaded$lambda$1(function0);
                return Boolean.valueOf(nativeLibraryLoaded$lambda$1);
            case 2:
                opusEncoder_delegate$lambda$0 = OpusAudioEncoder.opusEncoder_delegate$lambda$0(function0);
                return opusEncoder_delegate$lambda$0;
            default:
                requestPermissionIfNeeded$lambda$5 = PermissionsHelper.requestPermissionIfNeeded$lambda$5(function0);
                return requestPermissionIfNeeded$lambda$5;
        }
    }
}
