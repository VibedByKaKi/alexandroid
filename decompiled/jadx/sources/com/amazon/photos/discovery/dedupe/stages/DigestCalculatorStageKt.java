package com.amazon.photos.discovery.dedupe.stages;

import com.amazon.alexa.voice.ui.onedesign.util.image.ImageType;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"EXTENSION_JPEG", "", "", "KEEP_ALIVE_TIME", "", "MAX_THREAD_CALCULATE_DIGEST", "", Constants.LOG_TAG, "AndroidPhotosDiscovery_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DigestCalculatorStageKt {

    @NotNull
    private static final Set<String> EXTENSION_JPEG = SetsKt.setOf((Object[]) new String[]{"jpeg", ImageType.JPG});
    private static final long KEEP_ALIVE_TIME = 10;
    private static final int MAX_THREAD_CALCULATE_DIGEST = 2;

    @NotNull
    private static final String TAG = "DigestCalculatorStage";
}
