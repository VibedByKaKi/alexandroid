package com.amazon.apl.android.scenegraph.text;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TextChunk {
    private final long mNativeHandle;
    private com.amazon.apl.android.primitive.StyledText mStyledText;

    public TextChunk(long j) {
        this.mNativeHandle = j;
    }

    public com.amazon.apl.android.primitive.StyledText getText() {
        if (this.mStyledText == null) {
            this.mStyledText = new com.amazon.apl.android.primitive.StyledText(this.mNativeHandle);
        }
        return this.mStyledText;
    }
}
