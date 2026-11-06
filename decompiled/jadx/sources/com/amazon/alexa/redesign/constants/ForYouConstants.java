package com.amazon.alexa.redesign.constants;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/constants/ForYouConstants;", "", "<init>", "()V", "AUTHORITY", "", "CONTENT_URI", "Landroid/net/Uri;", "getCONTENT_URI", "()Landroid/net/Uri;", "COLUMN_CONTENT_ID", "COLUMN_PRIMARY_TEXT", "COLUMN_SECONDARY_TEXT", "COLUMN_IMAGE_URL", "COLUMN_ACTION_URL", "COLUMN_UPC", "COLUMN_CONTENT_TYPE", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ForYouConstants {
    public static final int $stable;

    @NotNull
    public static final String AUTHORITY = "com.amazon.alexa.redesign.foryou";

    @NotNull
    public static final String COLUMN_ACTION_URL = "actionURL";

    @NotNull
    public static final String COLUMN_CONTENT_ID = "contentId";

    @NotNull
    public static final String COLUMN_CONTENT_TYPE = "contentType";

    @NotNull
    public static final String COLUMN_IMAGE_URL = "imageURL";

    @NotNull
    public static final String COLUMN_PRIMARY_TEXT = "primaryText";

    @NotNull
    public static final String COLUMN_SECONDARY_TEXT = "secondaryText";

    @NotNull
    public static final String COLUMN_UPC = "upc";

    @NotNull
    private static final Uri CONTENT_URI;

    @NotNull
    public static final ForYouConstants INSTANCE = new ForYouConstants();

    static {
        Uri parse = Uri.parse("content://com.amazon.alexa.redesign.foryou/foryou");
        parse.getClass();
        CONTENT_URI = parse;
        $stable = 8;
    }

    private ForYouConstants() {
    }

    @NotNull
    public final Uri getCONTENT_URI() {
        return CONTENT_URI;
    }
}
