package com.amazon.alexa.voice.tta.search;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.voice.ui.tta.search.PillResultItem;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/voice/tta/search/TextPillResultItem;", "Lcom/amazon/alexa/voice/ui/tta/search/PillResultItem;", "itemText", "", "type", "", "itemRoute", "id", "fromSimba", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getId", "getType", "getItemText", "getItemRoute", "isFromSimba", "Companion", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TextPillResultItem implements PillResultItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean fromSimba;

    @NotNull
    private final String id;

    @Nullable
    private final String itemRoute;

    @NotNull
    private final String itemText;
    private final int type;

    public /* synthetic */ TextPillResultItem(String str, int i, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? UUID.randomUUID().toString() : str3, (i2 & 16) != 0 ? Boolean.TRUE : bool);
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.PillResultItem
    @Nullable
    public String getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.PillResultItem
    @NotNull
    public String getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
    public int getType() {
        return this.type;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.PillResultItem
    public boolean isFromSimba() {
        Boolean bool = this.fromSimba;
        bool.getClass();
        return bool.booleanValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/voice/tta/search/TextPillResultItem$Companion;", "", "<init>", "()V", "getResultType", "", "type", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getResultType(@NotNull String type) {
            type.getClass();
            Locale locale = Locale.ROOT;
            String m = TableInfo$$ExternalSyntheticOutline0.m(locale, type, locale);
            return (!Intrinsics.areEqual(m, InteractionType.UTTERANCE) && Intrinsics.areEqual(m, "app_page")) ? 1 : 2;
        }

        private Companion() {
        }
    }

    public TextPillResultItem(@NotNull String str, int i, @Nullable String str2, @NotNull String str3, @Nullable Boolean bool) {
        str.getClass();
        str3.getClass();
        this.itemText = str;
        this.type = i;
        this.itemRoute = str2;
        this.id = str3;
        this.fromSimba = bool;
    }
}
