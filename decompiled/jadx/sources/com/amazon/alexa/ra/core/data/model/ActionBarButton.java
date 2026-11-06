package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.ra.core.R;
import com.amazon.clouddrive.extended.model.ReactionKind;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ActionBarButton;", "", "animationCon", "", "contentDesc", "text", "completedText", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/Integer;)V", "getAnimationCon", "()I", "getContentDesc", "getText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompletedText", "REGENERATE", "SHARE", ReactionKind.LIKE, "DISLIKE", "COPY", "DOWNLOAD", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ActionBarButton {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActionBarButton[] $VALUES;
    public static final ActionBarButton COPY = new ActionBarButton("COPY", 4, R.drawable.action_bar_copy, R.string.action_bar_copy_description, Integer.valueOf(R.string.action_bar_copy_text), Integer.valueOf(R.string.action_bar_copied_text));
    public static final ActionBarButton DISLIKE;
    public static final ActionBarButton DOWNLOAD;
    public static final ActionBarButton LIKE;
    public static final ActionBarButton REGENERATE;
    public static final ActionBarButton SHARE;
    private final int animationCon;

    @Nullable
    private final Integer completedText;
    private final int contentDesc;

    @Nullable
    private final Integer text;

    private static final /* synthetic */ ActionBarButton[] $values() {
        return new ActionBarButton[]{REGENERATE, SHARE, LIKE, DISLIKE, COPY, DOWNLOAD};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Integer num = null;
        REGENERATE = new ActionBarButton("REGENERATE", 0, R.raw.lottie_aic_refresh_expanded, R.string.action_bar_regenerate_description, null, num, 12, null);
        Integer num2 = null;
        SHARE = new ActionBarButton("SHARE", 1, R.raw.lottie_aic_share_expanded, R.string.action_bar_share_description, num, num2, 12, null);
        Integer num3 = null;
        LIKE = new ActionBarButton(ReactionKind.LIKE, 2, R.raw.lottie_aic_like_expanded, R.string.action_bar_like_description, num2, num3, 12, null);
        DISLIKE = new ActionBarButton("DISLIKE", 3, R.raw.lottie_aic_dislike_expanded, R.string.action_bar_dislike_description, num3, null, 12, null);
        int i = R.drawable.action_bar_download;
        int i2 = R.string.action_bar_download_text;
        DOWNLOAD = new ActionBarButton("DOWNLOAD", 5, i, i2, Integer.valueOf(i2), 0 == true ? 1 : 0, 8, null);
        ActionBarButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ ActionBarButton(String str, int i, int i2, int i3, Integer num, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? null : num2);
    }

    @NotNull
    public static EnumEntries<ActionBarButton> getEntries() {
        return $ENTRIES;
    }

    public static ActionBarButton valueOf(String str) {
        return (ActionBarButton) Enum.valueOf(ActionBarButton.class, str);
    }

    public static ActionBarButton[] values() {
        return (ActionBarButton[]) $VALUES.clone();
    }

    public final int getAnimationCon() {
        return this.animationCon;
    }

    @Nullable
    public final Integer getCompletedText() {
        return this.completedText;
    }

    public final int getContentDesc() {
        return this.contentDesc;
    }

    @Nullable
    public final Integer getText() {
        return this.text;
    }

    private ActionBarButton(String str, int i, int i2, int i3, Integer num, Integer num2) {
        this.animationCon = i2;
        this.contentDesc = i3;
        this.text = num;
        this.completedText = num2;
    }
}
