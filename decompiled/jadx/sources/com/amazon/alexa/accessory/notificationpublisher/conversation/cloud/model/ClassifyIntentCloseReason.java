package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model;

import com.amazon.alexa.featureservice.constants.FeatureServiceMetrics;
import com.amazon.clouddrive.model.ResumeState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentCloseReason;", "", "wireValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireValue", "()Ljava/lang/String;", ResumeState.COMPLETED, "DECLINED", "ABANDONED", "CANCELED", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClassifyIntentCloseReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClassifyIntentCloseReason[] $VALUES;

    @NotNull
    private final String wireValue;
    public static final ClassifyIntentCloseReason COMPLETED = new ClassifyIntentCloseReason(ResumeState.COMPLETED, 0, FeatureServiceMetrics.EventType.PREFETCH_COMPLETED);
    public static final ClassifyIntentCloseReason DECLINED = new ClassifyIntentCloseReason("DECLINED", 1, "declined");
    public static final ClassifyIntentCloseReason ABANDONED = new ClassifyIntentCloseReason("ABANDONED", 2, "abandoned");
    public static final ClassifyIntentCloseReason CANCELED = new ClassifyIntentCloseReason("CANCELED", 3, "canceled");

    private static final /* synthetic */ ClassifyIntentCloseReason[] $values() {
        return new ClassifyIntentCloseReason[]{COMPLETED, DECLINED, ABANDONED, CANCELED};
    }

    static {
        ClassifyIntentCloseReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ClassifyIntentCloseReason(String str, int i, String str2) {
        this.wireValue = str2;
    }

    @NotNull
    public static EnumEntries<ClassifyIntentCloseReason> getEntries() {
        return $ENTRIES;
    }

    public static ClassifyIntentCloseReason valueOf(String str) {
        return (ClassifyIntentCloseReason) Enum.valueOf(ClassifyIntentCloseReason.class, str);
    }

    public static ClassifyIntentCloseReason[] values() {
        return (ClassifyIntentCloseReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getWireValue() {
        return this.wireValue;
    }
}
