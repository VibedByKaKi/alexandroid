package org.jetbrains.kotlin.library;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\b\u0010\u000e\u001a\u00020\bH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/IrLibrary;", "", "dataFlowGraph", "", "getDataFlowGraph", "()[B", "bodies", "fileIndex", "", "body", "index", "debugInfo", "declarations", "file", "fileCount", "irDeclaration", PayloadUtils.PayloadKeys.SIGNATURE, "signatures", TypedValues.Custom.S_STRING, "strings", "type", "types", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface IrLibrary {
    @NotNull
    byte[] bodies(int fileIndex);

    @NotNull
    byte[] body(int index, int fileIndex);

    @Nullable
    byte[] debugInfo(int index, int fileIndex);

    @NotNull
    byte[] declarations(int fileIndex);

    @NotNull
    byte[] file(int index);

    int fileCount();

    @Nullable
    byte[] getDataFlowGraph();

    @NotNull
    byte[] irDeclaration(int index, int fileIndex);

    @NotNull
    byte[] signature(int index, int fileIndex);

    @NotNull
    byte[] signatures(int fileIndex);

    @NotNull
    byte[] string(int index, int fileIndex);

    @NotNull
    byte[] strings(int fileIndex);

    @NotNull
    byte[] type(int index, int fileIndex);

    @NotNull
    byte[] types(int fileIndex);
}
