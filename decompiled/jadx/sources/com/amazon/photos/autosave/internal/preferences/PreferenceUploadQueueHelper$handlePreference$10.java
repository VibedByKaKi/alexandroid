package com.amazon.photos.autosave.internal.preferences;

import com.amazon.photos.uploader.QueueConstraint;
import com.amazon.photos.uploader.QueueManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class PreferenceUploadQueueHelper$handlePreference$10 extends FunctionReferenceImpl implements Function3<QueueManager, String, QueueConstraint, Unit> {
    public static final PreferenceUploadQueueHelper$handlePreference$10 INSTANCE = new PreferenceUploadQueueHelper$handlePreference$10();

    public PreferenceUploadQueueHelper$handlePreference$10() {
        super(3, QueueManager.class, "addQueueConstraint", "addQueueConstraint(Ljava/lang/String;Lcom/amazon/photos/uploader/QueueConstraint;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull QueueManager queueManager, @NotNull String str, @NotNull QueueConstraint queueConstraint) {
        queueManager.getClass();
        str.getClass();
        queueConstraint.getClass();
        queueManager.addQueueConstraint(str, queueConstraint);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(QueueManager queueManager, String str, QueueConstraint queueConstraint) {
        invoke2(queueManager, str, queueConstraint);
        return Unit.INSTANCE;
    }
}
