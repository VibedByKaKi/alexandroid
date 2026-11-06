package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f$0;

    public /* synthetic */ FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.f$0;
        switch (i) {
            case 0:
                fontRequestMetadataLoader.createMetadata();
                break;
            default:
                fontRequestMetadataLoader.loadInternal();
                break;
        }
    }
}
