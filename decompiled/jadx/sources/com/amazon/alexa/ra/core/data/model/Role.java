package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import com.amazon.deecomms.common.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Role;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BUTTON", "CHECKBOX", "IMAGE", "IMAGEBUTTON", "LINK", "LIST", "LISTITEM", "RADIOBUTTON", "RADIOGROUP", "RATING", "SCROLLABLE", "SWITCH", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "TIMER", "VIDEO", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Role {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Role[] $VALUES;

    @SerializedName("NONE")
    public static final Role NONE = new Role("NONE", 0);

    @SerializedName("BUTTON")
    public static final Role BUTTON = new Role("BUTTON", 1);

    @SerializedName("CHECKBOX")
    public static final Role CHECKBOX = new Role("CHECKBOX", 2);

    @SerializedName("IMAGE")
    public static final Role IMAGE = new Role("IMAGE", 3);

    @SerializedName("IMAGEBUTTON")
    public static final Role IMAGEBUTTON = new Role("IMAGEBUTTON", 4);

    @SerializedName("LINK")
    public static final Role LINK = new Role("LINK", 5);

    @SerializedName("LIST")
    public static final Role LIST = new Role("LIST", 6);

    @SerializedName("LISTITEM")
    public static final Role LISTITEM = new Role("LISTITEM", 7);

    @SerializedName("RADIOBUTTON")
    public static final Role RADIOBUTTON = new Role("RADIOBUTTON", 8);

    @SerializedName("RADIOGROUP")
    public static final Role RADIOGROUP = new Role("RADIOGROUP", 9);

    @SerializedName("RATING")
    public static final Role RATING = new Role("RATING", 10);

    @SerializedName("SCROLLABLE")
    public static final Role SCROLLABLE = new Role("SCROLLABLE", 11);

    @SerializedName("SWITCH")
    public static final Role SWITCH = new Role("SWITCH", 12);

    @SerializedName(Constants.Calling.MEDIA_STREAM_TYPE_TEXT)
    public static final Role TEXT = new Role(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 13);

    @SerializedName("TIMER")
    public static final Role TIMER = new Role("TIMER", 14);

    @SerializedName("VIDEO")
    public static final Role VIDEO = new Role("VIDEO", 15);

    private static final /* synthetic */ Role[] $values() {
        return new Role[]{NONE, BUTTON, CHECKBOX, IMAGE, IMAGEBUTTON, LINK, LIST, LISTITEM, RADIOBUTTON, RADIOGROUP, RATING, SCROLLABLE, SWITCH, TEXT, TIMER, VIDEO};
    }

    static {
        Role[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Role(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Role> getEntries() {
        return $ENTRIES;
    }

    public static Role valueOf(String str) {
        return (Role) Enum.valueOf(Role.class, str);
    }

    public static Role[] values() {
        return (Role[]) $VALUES.clone();
    }
}
